# ReChiseled Extras

ReChiseled Extras is a forge 1.20.1 addon mod for ReChiseled.

It adds the custom blocks from the Chisel 1.12 mod that are not part of ReChiseled:

* factory blocks
* laboratory blocks
* futura
* voidstone
* valentines
* tyrian

If you are looking for antiblocks, there is already [AntiBLocksReChiseled](https://github.com/manmaed/AntiBlocksReChiseled) that adds them.

## License

The Code in the Chisel mod is licesned GPLv2, but no code from that mod is reused in ReChiseled Extras. Except where specified, code, build scripts, etc are covered by the MIT
Licence in the LICENCE file.

A majority of the texture data comes from the Chisel mod. This _appears_ to also be GPLv2, as it's not covered by any of the CC cutouts in their README. Therefore, all of the
files in the following directories are distributed under GPLv2 as they are either taken from or derived from textures in Chisel:

  * `src/main/resources/assets/rechiseled_extras/textures`

### Known Differences from Chisel

There are a few differences from the blocks in the original Chisel mod. I've attempted to enumerate the known differences here. Any differences not referenced here are a bug
and should be reported.

* Most blocks that have connected textures have non-connected variants, like the blocks in ReChiseled itself
* Laboratory `white panel` and `dotted panel` variants have an additional "wall" style connected texture
* `primal voidstone` animates slightly differently and doesn't look quite as good. This is due to a difference in CTM's animation system vs builtin animation system

### Status

All block lines are complete except "factory blocks", which are missing "technical" and animated blocks.

I'm not sure yet if all factory blocks will be addable, some may tile in ways that are not easily reproducible with Fusion.
