#!/usr/bin/env -S uv run --script

"""
CTM to Fusion texture converter for Minecraft 1.20.1/Rechiseled Fusion.

Mode 1 (conversion): Given a CTM texture path ending with one of:
  - "-ctm.png"   (normal/omni-directional CTM)
  - "-ctmh.png"  (horizontal-only CTM)
  - "-ctmv.png"  (vertical-only CTM)

Produces a Fusion texture `<block>.png` and a `<block>.png.mcmeta` with the
correct Fusion layout. By default outputs to the current directory; override
with `--outdir`.

Rules are based on CTM.md in this repository:

Normal CTM ("pieced" Fusion layout by default, or "compact" with --compact):
  Output is a 5x1 spritesheet: [none, all, E+W, N+S, cardinals-only]
  - none comes from sibling `<block>.png` (required)
  - the remaining four tiles are the 4 quadrants of the CTM image
    TL=all, TR=E+W, BL=N+S, BR=cardinals-only.

Compact layout (when using --compact) uses order:
  [End, Center, Vertical, Horizontal, Cross]. For compact, 32×32 CTM quadrants
  map as TL=end, TR=horizontal, BL=vertical, BR=cross. The center tile is not
  present in CTM and should be provided separately (e.g., via `--center` in
  compositing mode, or taken from `<block>.png` in simple conversion).

Horizontal CTM ("horizontal" Fusion layout):
  CTM image is 2x2 tiles (TL,TR,BL,BR) each of size T x T. Output is 4x1:
    [none(TL), E-only(BL), E+W(TR), W-only(BR)]

Vertical CTM ("vertical" Fusion layout):
  CTM image is 2x2 tiles (TL,TR,BL,BR) each of size T x T. Output is 1x4:
    [none(TL), S-only(BL), N+S(TR), N-only(BR)] top-to-bottom

Mode 2 (compositing): Use `source` as the bottom layer, add repeated
`--composite <file>` layers to overlay, and optionally `--center <file>` for
the compact layout's center tile. Files can be static or animated. Animated
16px textures are 16x(16*N); animated CTM textures are 32x(32*N). If both
CTM and center are animated, they must have the same N; static inputs are
replicated to match.

This script requires Pillow (PIL): `pip install Pillow`.
"""

from __future__ import annotations

import argparse
import json
import os
import re
import sys
from pathlib import Path
from typing import Iterable, List, Optional, Sequence, Tuple

try:
    from PIL import Image
except Exception as exc:  # pragma: no cover
    print("Error: This script requires Pillow. Install with: pip install Pillow", file=sys.stderr)
    raise


CTM_TYPE_NORMAL = "ctm"
CTM_TYPE_HORIZ = "ctmh"
CTM_TYPE_VERT = "ctmv"


def detect_ctm_type(filename: str) -> str:
    name = filename.lower()
    if name.endswith("-ctmh.png"):
        return CTM_TYPE_HORIZ
    if name.endswith("-ctmv.png"):
        return CTM_TYPE_VERT
    if name.endswith("-ctm.png"):
        return CTM_TYPE_NORMAL
    raise ValueError("Source texture must end with -ctm.png, -ctmh.png, or -ctmv.png")


def derive_block_base_name(path: Path, ctm_type: str) -> str:
    stem = path.stem  # e.g., "stone_bricks-ctm" or "wood-ctmh"
    if ctm_type == CTM_TYPE_NORMAL and stem.endswith("-ctm"):
        return stem[: -len("-ctm")]
    if ctm_type == CTM_TYPE_HORIZ and stem.endswith("-ctmh"):
        return stem[: -len("-ctmh")]
    if ctm_type == CTM_TYPE_VERT and stem.endswith("-ctmv"):
        return stem[: -len("-ctmv")]
    # Fallback: strip trailing -ctm*
    m = re.match(r"^(.*?)-ctm(v|h)?$", stem, re.IGNORECASE)
    if m:
        return m.group(1)
    # As a last resort, return as-is
    return stem


def load_image(path: Path) -> Image.Image:
    try:
        return Image.open(path).convert("RGBA")
    except FileNotFoundError:
        raise
    except Exception as e:  # pragma: no cover
        raise RuntimeError(f"Failed to load image '{path}': {e}")


def ensure_square(image: Image.Image, name: str) -> None:
    w, h = image.size
    if w != h:
        raise ValueError(f"{name} must be square, got {w}x{h}")


def slice_quadrants(img: Image.Image) -> tuple[Image.Image, Image.Image, Image.Image, Image.Image]:
    """Return (TL, TR, BL, BR) quadrants of a square image."""
    ensure_square(img, "CTM image")
    w, h = img.size
    if w % 2 != 0 or h % 2 != 0:
        raise ValueError(f"CTM image must be divisible by 2, got {w}x{h}")
    mid = w // 2
    tl = img.crop((0, 0, mid, mid))
    tr = img.crop((mid, 0, w, mid))
    bl = img.crop((0, mid, mid, h))
    br = img.crop((mid, mid, w, h))
    return tl, tr, bl, br


def frames_from_vertical_strip(img: Image.Image, tile_px: int) -> List[Image.Image]:
    """Slice an image of width=tile_px and height=tile_px*N into N frames of tile_px x tile_px."""
    w, h = img.size
    if w != tile_px or h % tile_px != 0:
        raise ValueError(f"Expected image width {tile_px} and height multiple of {tile_px}, got {w}x{h}")
    n = h // tile_px
    return [img.crop((0, i * tile_px, tile_px, (i + 1) * tile_px)) for i in range(n or 1)]


def frames_from_ctm(img: Image.Image) -> List[Tuple[Image.Image, Image.Image, Image.Image, Image.Image]]:
    """Return per-frame CTM quadrants [(TL,TR,BL,BR), ...] for a 32x(32*N) image."""
    w, h = img.size
    if w != 32 or h % 32 != 0:
        raise ValueError(f"CTM image must be 32 wide and height multiple of 32, got {w}x{h}")
    n = h // 32
    frames: List[Tuple[Image.Image, Image.Image, Image.Image, Image.Image]] = []
    for i in range(n):
        frame = img.crop((0, i * 32, 32, (i + 1) * 32))
        frames.append(slice_quadrants(frame))
    return frames


def frames_from_five_wide(img: Image.Image) -> List[List[Image.Image]]:
    """Return per-frame 5-tile rows for a modern 5x1 layout (80x16*N).

    Output shape: List[frame_index][tile_index] where tile_index in [0..4], each 16x16.
    """
    w, h = img.size
    if w != 80 or h % 16 != 0:
        raise ValueError(f"Five-wide image must be 80 wide and height multiple of 16, got {w}x{h}")
    n = h // 16
    frames: List[List[Image.Image]] = []
    for i in range(n):
        row = img.crop((0, i * 16, 80, (i + 1) * 16))
        tiles = [row.crop((j * 16, 0, (j + 1) * 16, 16)) for j in range(5)]
        frames.append(tiles)
    return frames


def repeat_to_length(frames: Sequence[Image.Image], n: int) -> List[Image.Image]:
    if len(frames) == n:
        return list(frames)
    if len(frames) == 1:
        return [frames[0]] * n
    raise ValueError(f"Cannot fit {len(frames)} frames into animation length {n}")


def build_tall_strip(frames: Sequence[Image.Image]) -> Image.Image:
    """Stack frames vertically into a single tall strip (width=frame.width, height=frame.height*N)."""
    if not frames:
        raise ValueError("No frames to stack")
    w, h = frames[0].size
    out = Image.new("RGBA", (w, h * len(frames)))
    for i, fr in enumerate(frames):
        if fr.size != (w, h):
            raise ValueError("All frames must have the same dimensions")
        out.paste(fr, (0, i * h))
    return out


def composite_frames(base: Sequence[Image.Image], overlays: Sequence[Sequence[Image.Image]]) -> List[Image.Image]:
    """Alpha-composite N frames: base[i] then each overlays[j][i] in order."""
    n = len(base)
    result: List[Image.Image] = []
    for i in range(n):
        frame = base[i].copy()
        for layer in overlays:
            frame.alpha_composite(layer[i])
        result.append(frame)
    return result


def compose_row(tiles: list[Image.Image]) -> Image.Image:
    if not tiles:
        raise ValueError("No tiles to compose")
    t_w, t_h = tiles[0].size
    for im in tiles:
        if im.size != (t_w, t_h):
            raise ValueError("All tiles must have the same dimensions")
    out = Image.new("RGBA", (t_w * len(tiles), t_h))
    x = 0
    for im in tiles:
        out.paste(im, (x, 0))
        x += t_w
    return out


def compose_column(tiles: list[Image.Image]) -> Image.Image:
    if not tiles:
        raise ValueError("No tiles to compose")
    t_w, t_h = tiles[0].size
    for im in tiles:
        if im.size != (t_w, t_h):
            raise ValueError("All tiles must have the same dimensions")
    out = Image.new("RGBA", (t_w, t_h * len(tiles)))
    y = 0
    for im in tiles:
        out.paste(im, (0, y))
        y += t_h
    return out


def write_mcmeta(path: Path, layout: str) -> None:
    data = {"fusion": {"type": "connecting", "layout": layout}}
    with path.open("w", encoding="utf-8") as f:
        json.dump(data, f, indent=2)
        f.write("\n")


def write_vanilla_animation_mcmeta(path: Path, frametime: int = 1) -> None:
    """Write a vanilla animation mcmeta for simple animated textures."""
    data = {"animation": {"frametime": frametime}}
    with path.open("w", encoding="utf-8") as f:
        json.dump(data, f, indent=2)
        f.write("\n")


def convert_normal(ctm_path: Path, outdir: Path, *, compact: bool = False, outfile: Optional[Path] = None) -> Path:
    """Convert a normal CTM (-ctm.png) to Fusion layout, supporting animation."""
    ctm_img = load_image(ctm_path)
    ctm_frames = frames_from_ctm(ctm_img)  # list of (tl,tr,bl,br)

    base_name = derive_block_base_name(ctm_path, CTM_TYPE_NORMAL)
    base_path = ctm_path.with_name(base_name + ".png")
    if not base_path.exists():
        raise FileNotFoundError(
            f"Required base texture not found: '{base_path}'. For normal CTM, a sibling '<block>.png' is needed."
        )
    base_img = load_image(base_path)
    base_frames = frames_from_vertical_strip(base_img, 16)

    # Determine N and align frames
    n = max(len(ctm_frames), len(base_frames))
    base_frames = repeat_to_length(base_frames, n)
    if len(ctm_frames) == 1:
        ctm_frames = ctm_frames * n
    elif len(ctm_frames) != n:
        raise ValueError("Unexpected CTM frames vs base frames mismatch")

    if compact:
        # Compact mapping: TL=end, TR=horizontal, BL=vertical, BR=cross; center comes from base
        end_frames: List[Image.Image] = [tl for (tl, _, _, _) in ctm_frames]
        center_frames: List[Image.Image] = [bf for bf in base_frames]
        vertical_frames: List[Image.Image] = [bl for (_, _, bl, _) in ctm_frames]
        horizontal_frames: List[Image.Image] = [tr for (_, tr, _, _) in ctm_frames]
        cross_frames: List[Image.Image] = [br for (_, _, _, br) in ctm_frames]
        tiles = [
            build_tall_strip(end_frames),
            build_tall_strip(center_frames),
            build_tall_strip(vertical_frames),
            build_tall_strip(horizontal_frames),
            build_tall_strip(cross_frames),
        ]
        sheet = compose_row(tiles)
    else:
        # Pieced mapping unchanged: [none(base), all(TL), E+W(TR), N+S(BL), cardinals(BR)]
        none_frames: List[Image.Image] = [bf for bf in base_frames]
        all_frames: List[Image.Image] = [tl for (tl, _, _, _) in ctm_frames]
        ew_frames: List[Image.Image] = [tr for (_, tr, _, _) in ctm_frames]
        ns_frames: List[Image.Image] = [bl for (_, _, bl, _) in ctm_frames]
        card_frames: List[Image.Image] = [br for (_, _, _, br) in ctm_frames]
        tiles = [
            build_tall_strip(none_frames),
            build_tall_strip(all_frames),
            build_tall_strip(ew_frames),
            build_tall_strip(ns_frames),
            build_tall_strip(card_frames),
        ]
        sheet = compose_row(tiles)

    out_png = outfile if outfile is not None else (outdir / f"{base_name}.png")
    out_png.parent.mkdir(parents=True, exist_ok=True)
    out_meta = outdir / f"{base_name}.png.mcmeta"
    sheet.save(out_png)
    # mcmeta should sit next to the chosen output file
    out_meta = Path(str(out_png) + ".mcmeta")
    write_mcmeta(out_meta, "compact" if compact else "pieced")
    return out_png


def convert_composite(bottom_path: Path, outdir: Path, *, compact: bool, composites: List[Path], center: Optional[Path], end_cross: bool = False, outfile: Optional[Path] = None) -> Path:
    """Composite layers into a Fusion sheet (compact or pieced). Only compact uses --center.

    - bottom_path: 16x(16*N)
    - composites: sequence of overlay images; may include one CTM (32x(32*N)) and any number of 16x(16*N)
    - center: optional 16x(16*N); only used for compact layout
    """
    base_img = load_image(bottom_path)
    base_frames_16: Optional[List[Image.Image]] = None
    base_ctm_frames: Optional[List[Tuple[Image.Image, Image.Image, Image.Image, Image.Image]]] = None
    if base_img.size[0] == 16:
        base_frames_16 = frames_from_vertical_strip(base_img, 16)
    elif base_img.size[0] == 32:
        base_ctm_frames = frames_from_ctm(base_img)
    else:
        raise ValueError(f"Unsupported base width {base_img.size[0]} (expected 16 or 32)")

    # Identify CTM among composites, keep order for 16x overlays
    ctm_overlays: List[List[Tuple[Image.Image, Image.Image, Image.Image, Image.Image]]] = []
    modern_overlays: List[List[List[Image.Image]]] = []  # per overlay: list of frames -> list of 5 tiles
    overlay_16_list: List[List[Image.Image]] = []
    for comp in composites:
        img = load_image(comp)
        if img.size[0] == 32:
            ctm_overlays.append(frames_from_ctm(img))
        elif img.size[0] == 80:
            modern_overlays.append(frames_from_five_wide(img))
        elif img.size[0] == 16:
            overlay_16_list.append(frames_from_vertical_strip(img, 16))
        else:
            raise ValueError(f"Unsupported composite width {img.size[0]} (expected 16, 32, or 80)")

    center_frames: Optional[List[Image.Image]] = None
    if center is not None:
        c_img = load_image(center)
        if c_img.size[0] != 16:
            raise ValueError("--center image must be 16px wide (16x16 or 16x16*N)")
        center_frames = frames_from_vertical_strip(c_img, 16)

    # Determine N and validate animation compatibility
    counts: List[int] = []
    if base_frames_16 is not None:
        counts.append(len(base_frames_16))
    if base_ctm_frames is not None:
        counts.append(len(base_ctm_frames))
    counts += [len(fr) for fr in overlay_16_list]
    counts += [len(fr) for fr in ctm_overlays]
    counts += [len(fr) for fr in modern_overlays]
    if center_frames is not None:
        counts.append(len(center_frames))
    n = max(counts) if counts else 1

    # If both CTM and center animated, require same N
    any_ctm_sources = (base_ctm_frames is not None) or bool(ctm_overlays)
    if any_ctm_sources and center_frames is not None:
        # All animated CTM sources must share the same count as center when both animated
        ctm_lengths = []
        if base_ctm_frames is not None:
            ctm_lengths.append(len(base_ctm_frames))
        ctm_lengths += [len(fr) for fr in ctm_overlays]
        for L in ctm_lengths:
            if L > 1 and len(center_frames) > 1 and L != len(center_frames):
                raise ValueError("CTM and center animations must have the same frame count when both animated")

    # Repeat all to N
    if base_frames_16 is not None:
        base_frames_16 = repeat_to_length(base_frames_16, n)
    overlay_16_list = [repeat_to_length(fr, n) for fr in overlay_16_list]
    if base_ctm_frames is not None:
        if len(base_ctm_frames) == 1:
            base_ctm_frames = base_ctm_frames * n
        elif len(base_ctm_frames) != n:
            raise ValueError("Base CTM animation length must be 1 or match the overall N")
    ctm_overlays_rep: List[List[Tuple[Image.Image, Image.Image, Image.Image, Image.Image]]] = []
    for ct in ctm_overlays:
        if len(ct) == 1:
            ctm_overlays_rep.append(ct * n)
        elif len(ct) == n:
            ctm_overlays_rep.append(ct)
        else:
            raise ValueError("CTM overlay animation length must be 1 or match the overall N")
    modern_overlays_rep: List[List[List[Image.Image]]] = []
    for mo in modern_overlays:
        if len(mo) == 1:
            modern_overlays_rep.append(mo * n)
        elif len(mo) == n:
            modern_overlays_rep.append(mo)
        else:
            raise ValueError("Five-wide overlay animation length must be 1 or match the overall N")

    if center_frames is None:
        # If no center provided and using compact, we'll fall back to CTM TL
        pass
    else:
        center_frames = repeat_to_length(center_frames, n)

    # If there are no CTM sources and not in compact mode, do a simple animated composite and return a single strip.
    connecting_mode = compact or (base_ctm_frames is not None) or bool(ctm_overlays) or bool(modern_overlays)
    if not connecting_mode:
        if base_frames_16 is None:
            raise ValueError("Non-connecting compositing requires a 16px-wide base image")
        # Repeat base/overlays and composite
        base_frames = repeat_to_length(base_frames_16, n)
        overlays = [repeat_to_length(fr, n) for fr in overlay_16_list]
        result_frames = composite_frames(base_frames, overlays)
        out_img = build_tall_strip(result_frames)
        out_png = outfile if outfile is not None else (outdir / f"{bottom_path.stem}.png")
        out_png.parent.mkdir(parents=True, exist_ok=True)
        out_img.save(out_png)
        # Intentionally do not write a .mcmeta here; this is a regular animated texture.
        return out_png

    # Connecting-mode: PNG + mcmeta

    # Helper: get CTM tile quadrant list from a CTM frames list for a given kind
    def select_ctm_tile(ctm_list: List[Tuple[Image.Image, Image.Image, Image.Image, Image.Image]], kind: str) -> List[Image.Image]:
        if compact:
            if kind == 'end':
                return [tl for (tl, _, _, _) in ctm_list]
            if kind == 'horizontal':
                return [tr for (_, tr, _, _) in ctm_list]
            if kind == 'vertical':
                return [bl for (_, _, bl, _) in ctm_list]
            if kind == 'cross':
                return [br for (_, _, _, br) in ctm_list]
            if kind == 'center':
                return [Image.new("RGBA", (16, 16)) for _ in range(len(ctm_list))]
        else:
            if kind == 'all':
                return [tl for (tl, _, _, _) in ctm_list]
            if kind == 'ew':
                return [tr for (_, tr, _, _) in ctm_list]
            if kind == 'ns':
                return [bl for (_, _, bl, _) in ctm_list]
            if kind == 'cardinals':
                return [br for (_, _, _, br) in ctm_list]
            if kind == 'none':
                return [Image.new("RGBA", (16, 16)) for _ in range(len(ctm_list))]
        raise ValueError(f"Unknown tile kind {kind}")

    # For each tile, build per-frame composites
    def tile_frames_for(kind: str) -> List[Image.Image]:
        # Start base per-frame image
        if base_frames_16 is not None:
            base = base_frames_16
        elif base_ctm_frames is not None:
            base = select_ctm_tile(base_ctm_frames, kind)
        else:
            base = [Image.new("RGBA", (16, 16)) for _ in range(n)]

        # Note: --center should only affect the 'center' tile in compact mode,
        # so do not apply it to 'end' or other tiles as a base.

        # Build per-tile overlay sequence: 16px overlays first
        overlays: List[List[Image.Image]] = []
        overlays.extend(overlay_16_list)

        # Then add each CTM overlay's selected quadrant for this tile
        for ctm in ctm_overlays_rep:
            overlays.append(select_ctm_tile(ctm, kind))

        # Then add each five-wide overlay's selected tile for this layout and kind
        if compact:
            index_map = {'end': 0, 'center': 1, 'vertical': 2, 'horizontal': 3, 'cross': 4}
        else:
            index_map = {'none': 0, 'all': 1, 'ew': 2, 'ns': 3, 'cardinals': 4}
        tile_index = index_map[kind]
        for mo in modern_overlays_rep:
            overlays.append([frame_tiles[tile_index] for frame_tiles in mo])

        # Special handling for compact center override
        if compact and kind == 'center' and center_frames is not None:
            overlays.append(center_frames)

        return composite_frames(base, overlays)

    if compact:
        names = ['end', 'center', 'vertical', 'horizontal', 'cross']
    else:
        names = ['none', 'all', 'ew', 'ns', 'cardinals']

    # Build tiles sequentially to allow end->cross mirroring
    tile_frames_cache: dict[str, List[Image.Image]] = {}
    tiles_built: List[Image.Image] = []
    for k in names:
        if compact and end_cross and k == 'cross' and 'end' in tile_frames_cache:
            frames = tile_frames_cache['end']
        else:
            frames = tile_frames_for(k)
        tile_frames_cache[k] = frames
        tiles_built.append(build_tall_strip(frames))
    sheet = compose_row(tiles_built)

    base_name = bottom_path.stem
    out_png = outfile if outfile is not None else (outdir / f"{base_name}.png")
    out_png.parent.mkdir(parents=True, exist_ok=True)
    out_meta = Path(str(out_png) + ".mcmeta")
    sheet.save(out_png)
    write_mcmeta(out_meta, "compact" if compact else "pieced")
    return out_png


def convert_horizontal(ctm_path: Path, outdir: Path, *, outfile: Optional[Path] = None) -> Path:
    ctm_img = load_image(ctm_path)
    ctm_frames = frames_from_ctm(ctm_img)
    # Order per frame: [none(TL), E-only(BL), E+W(TR), W-only(BR)]
    tiles = [
        build_tall_strip([tl for (tl, _, _, _) in ctm_frames]),
        build_tall_strip([bl for (_, _, bl, _) in ctm_frames]),
        build_tall_strip([tr for (_, tr, _, _) in ctm_frames]),
        build_tall_strip([br for (_, _, _, br) in ctm_frames]),
    ]
    sheet = compose_row(tiles)
    base_name = derive_block_base_name(ctm_path, CTM_TYPE_HORIZ)
    out_png = outfile if outfile is not None else (outdir / f"{base_name}.png")
    out_png.parent.mkdir(parents=True, exist_ok=True)
    out_meta = Path(str(out_png) + ".mcmeta")
    sheet.save(out_png)
    write_mcmeta(out_meta, "horizontal")
    return out_png


def convert_vertical(ctm_path: Path, outdir: Path, *, outfile: Optional[Path] = None) -> Path:
    ctm_img = load_image(ctm_path)
    ctm_frames = frames_from_ctm(ctm_img)
    # Order top-to-bottom per frame: [none(TL), S-only(BL), N+S(TR), N-only(BR)]
    tiles = [
        build_tall_strip([tl for (tl, _, _, _) in ctm_frames]),
        build_tall_strip([bl for (_, _, bl, _) in ctm_frames]),
        build_tall_strip([tr for (_, tr, _, _) in ctm_frames]),
        build_tall_strip([br for (_, _, _, br) in ctm_frames]),
    ]
    sheet = compose_column(tiles)
    base_name = derive_block_base_name(ctm_path, CTM_TYPE_VERT)
    out_png = outfile if outfile is not None else (outdir / f"{base_name}.png")
    out_png.parent.mkdir(parents=True, exist_ok=True)
    out_meta = Path(str(out_png) + ".mcmeta")
    sheet.save(out_png)
    write_mcmeta(out_meta, "vertical")
    return out_png


def main(argv: list[str]) -> int:
    parser = argparse.ArgumentParser(description="Convert CTM textures to Fusion textures")
    parser.add_argument("source", help="Path to CTM texture (-ctm.png, -ctmh.png, -ctmv.png) or base layer in compositing mode")
    parser.add_argument("-o", "--outdir", default=".", help="Output directory (defaults to current directory)")
    parser.add_argument("--compact", action="store_true", help="For -ctm.png, use Fusion 'compact' layout instead of 'pieced'")
    parser.add_argument("--composite", action="append", default=[], help="Overlay image (16x16[*N] or 32x32[*N] CTM); can be repeated")
    parser.add_argument("--center", default=None, help="Center tile image for compact layout (16x16[*N])")
    parser.add_argument("--end-cross", action="store_true", help="In compact layout, copy the 'end' tile result to the 'cross' tile")
    parser.add_argument("-f", "--file", default=None, help="Output file path when producing a single image (no mcmeta)")
    args = parser.parse_args(argv)

    src_path = Path(args.source)
    if not src_path.exists():
        print(f"Error: Source texture not found: {src_path}", file=sys.stderr)
        return 2

    outdir = Path(args.outdir)
    outdir.mkdir(parents=True, exist_ok=True)

    try:
        if args.composite:
            comps = [Path(p) for p in args.composite]
            center = Path(args.center) if args.center else None
            out_file = Path(args.file) if args.file else None
            out_png = convert_composite(src_path, outdir, compact=args.compact, composites=comps, center=center, end_cross=args.end_cross, outfile=out_file)
        else:
            ctm_type = detect_ctm_type(src_path.name)
            if ctm_type == CTM_TYPE_NORMAL:
                out_file = Path(args.file) if args.file else None
                out_png = convert_normal(src_path, outdir, compact=args.compact, outfile=out_file)
            elif ctm_type == CTM_TYPE_HORIZ:
                out_file = Path(args.file) if args.file else None
                out_png = convert_horizontal(src_path, outdir, outfile=out_file)
            elif ctm_type == CTM_TYPE_VERT:
                out_file = Path(args.file) if args.file else None
                out_png = convert_vertical(src_path, outdir, outfile=out_file)
            else:  # pragma: no cover
                raise AssertionError(f"Unknown CTM type: {ctm_type}")
    except Exception as e:
        print(f"Conversion failed: {e}", file=sys.stderr)
        return 1

    meta_path = out_png.parent / (out_png.name + ".mcmeta")
    if meta_path.exists():
        print(f"Wrote {out_png} and {meta_path}")
    else:
        print(f"Wrote {out_png}")
    return 0


if __name__ == "__main__":
    raise SystemExit(main(sys.argv[1:]))
