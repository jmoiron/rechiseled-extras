#!/usr/bin/env -S uv run --script

"""
CurseForge icon generator for rechiseled-extras.

Produces a 400×400 PNG:
  - 40 px transparent border on all sides
  - 5×5 grid (320×320) of randomly-selected 16×16 block textures, each
    upscaled to 64×64 with nearest-neighbor interpolation
  - rechiseled-icon.png upscaled to 300×300 (nearest-neighbor), alpha-
    composited at center

Usage:
    ./make-icon.py [-o icon.png] [--seed N] [--chisel PATH]

Options:
    -o / --output   Output file path (default: icon.png)
    --seed          Integer seed for reproducible tile selection
    --chisel        Path to rechiseled-icon.png (default: assets/rechiseled-icon.png)

This script requires Pillow (PIL): pip install Pillow
"""

from __future__ import annotations

import argparse
import random
import sys
from pathlib import Path
from typing import List, Optional

try:
    from PIL import Image
except ImportError:
    print("Error: This script requires Pillow. Install with: pip install Pillow", file=sys.stderr)
    raise

ICON_SIZE = 400
BORDER = 40
GRID = 5
TILE_SIZE = (ICON_SIZE - 2 * BORDER) // GRID  # 64
CHISEL_SIZE = 400

DEFAULT_CHISEL = Path("assets/rechiseled-icon.png")
TEXTURE_ROOT = Path("src/main/resources/assets/rechiseled_extras/textures/block")


def find_textures(root: Path) -> List[Path]:
    """Return sorted list of all 16×16 PNG files under root."""
    candidates: List[Path] = []
    for p in sorted(root.rglob("*.png")):
        try:
            with Image.open(p) as img:
                if img.size == (16, 16):
                    candidates.append(p)
        except Exception:
            pass
    return candidates


def make_icon(
    textures: List[Path],
    chisel_path: Path,
    output: Path,
    seed: Optional[int] = None,
) -> None:
    rng = random.Random(seed)

    n = GRID * GRID
    chosen = rng.sample(textures, min(n, len(textures)))
    # Fill remaining slots with repeats if the pool is somehow smaller than 25
    while len(chosen) < n:
        chosen.append(rng.choice(textures))

    canvas = Image.new("RGBA", (ICON_SIZE, ICON_SIZE), (0, 0, 0, 0))

    # 5×5 grid of block tiles
    for i, tex_path in enumerate(chosen):
        row, col = divmod(i, GRID)
        tile = Image.open(tex_path).convert("RGBA")
        tile = tile.resize((TILE_SIZE, TILE_SIZE), Image.NEAREST)
        x = BORDER + col * TILE_SIZE
        y = BORDER + row * TILE_SIZE
        canvas.alpha_composite(tile, (x, y))

    # Centered chisel overlay
    chisel = Image.open(chisel_path).convert("RGBA")
    # r, g, b, a = chisel.split()
    # r = r.point(lambda v: int(v * 0.4))
    # g = g.point(lambda v: int(v * 0.4))
    # b = b.point(lambda v: int(v * 0.4))
    # chisel = Image.merge("RGBA", (r, g, b, a))
    chisel = chisel.resize((CHISEL_SIZE, CHISEL_SIZE), Image.NEAREST)
    cx = (ICON_SIZE - CHISEL_SIZE) // 2
    cy = (ICON_SIZE - CHISEL_SIZE) // 2
    canvas.alpha_composite(chisel, (cx, cy))

    output.parent.mkdir(parents=True, exist_ok=True)
    canvas.save(output)
    print(f"Wrote {output}")

    icon64 = output.parent / "icon-64.png"
    canvas.resize((64, 64), Image.NEAREST).save(icon64)
    print(f"Wrote {icon64}")


def main(argv: List[str]) -> int:
    parser = argparse.ArgumentParser(description="Generate rechiseled-extras CurseForge icon")
    parser.add_argument("-o", "--output", default="icon.png", help="Output file (default: icon.png)")
    parser.add_argument("--seed", type=int, default=None, help="Random seed for reproducible tile selection")
    parser.add_argument("--chisel", default=str(DEFAULT_CHISEL), help="Path to rechiseled-icon.png")
    args = parser.parse_args(argv)

    chisel_path = Path(args.chisel)
    if not chisel_path.exists():
        print(f"Error: chisel image not found: {chisel_path}", file=sys.stderr)
        return 2

    textures = find_textures(TEXTURE_ROOT)
    if not textures:
        print(f"Error: no 16×16 textures found under {TEXTURE_ROOT}", file=sys.stderr)
        return 2

    print(f"Found {len(textures)} candidate textures")
    make_icon(textures, chisel_path, Path(args.output), seed=args.seed)
    return 0


if __name__ == "__main__":
    raise SystemExit(main(sys.argv[1:]))
