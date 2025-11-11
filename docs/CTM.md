This document describes the connected textures support for 1.12 (via CTM) and 1.20.x (via Fusion).

# CTM (1.12.1)

CTM in 1.12 is implemented in three different ways.

The first "simple" way is via two textures:

* <block>.png
* <block>-ctm.png

There is also a <block>.png.mcmeta file, but its contents are not necessary. The <block.png> file should be 16x16 resolution, and the <block>-ctm.png is 32x32.

The <block>.png texture contains the texture for the block when it has no neighbors. Consider this the "main" texture, and you can think of it as a 2x2 sheet of 8x8 sprites that can be used for corners when there are no blocks connected to it.

The <block>-ctm.png image should be thought of as 16 8x8 sprites, with each sprite defining how a corner should look when it has neighbors. I will x/y coordinates for each 8x8 sprite to define how each one is used, with (0,0) being the top-left of the image. I will use cardinal directions like N/S/E/W/NE/NW/SE/SW to define how the surrounding blocks impact which texture gets used.

Connected Textures define how blocks render when connected in cardinal directions. Diagonally connected blocks can affect the texture of a block, but only when they are already connected in both cardinal directions; so for a NE neighbor to affect a block's texture, it needs to be connected N and E too.

(0,0) is the top left corner of a sprite connected at N, NW, and W
(0,1) is the top right corner of a sprite connected at N, NE, and E
(0,2) is the top left corner of a sprite connected at N and not W
(0,3) is the top right corner of a sprite connected at N but not E

(1,0) is the bottom-left corner of a sprite connected at W, SW, and S
(1,1) is the bottom-right corner of a sprite connected at S, SE, and E
(1,2) is the bottom-left corner of a sprite connected at S but not W
(1,3) is the bottom-right corner of a sprite connected at S but not E

(2,0) is top-left connected at W but not N
(2,1) is top-right connected at E but not N
(2,2) is top-left connected at N and W but not NW
(2,3) is top-right connected at N and E but not NE

(3,0) is bottom-left connected at W but not S
(3,1) is bottom-right connected at E but not S
(3,2) is bottom-left connected at S and W but not SW
(3,3) is bottom-right connected at S and E but not SE

Typically, these blocks connect spatially across all axes, so they will connect vertically and horizontally.

The next two ways are "vertical" and "horizontal" connected textures. These only connect vertically and horizontally, respectively. They are very similar so I'll describe both at the same time.

* <block>.png
* <block>-ctm{v,h}.png

They may also feature a <block>-side.png and a <block>-top.png, like normal textures do, which define the sides and the top of the block.

The horizontal and vertical textures only connect horizontally and vertically. These are 2x2 arrangements of 16x16 sprites, ie the whole blockface. They are:

(0,0) is the block not connected on either side
(0,1) is the block connected on "both" sides (N+S for vertical, or E+W for horizontal)
(1,1) is the block connected on S only for vertical and E only for horizontal
(1,2) is the block connected on N only for vertical and W only for horizontal

# Fusion (1.20.1)

The fusion sprite types are defined in this URL: https://github.com/SuperMartijn642/Fusion/wiki/Texture-Types

They have several different layouts they can do, which range from reduced to full sprite sheets for each possible adjacency.

The "pieced" layout is similar to Chisel's normal CTM layout. You can think of it as 5x1 sprite sheet that is 80x16, but each 16x16 tile corresponds to either the <block>.png or one 16x16 quadrant of the <block>-ctm.png.

* (0,0) corresponds to the "no connections", ie <block>.png
* (0,1) corresponds to "all" connections, ie the top-left 16x16 quadrant of <block>-ctm.png
* (0,2) is E/W only, top-right quadrant of <block>-ctm.png
* (0,3) is N/S only, bottom-left quadrant of <block>-ctm.png
* (0,4) is cardinals only (ie N+W but not NW), bottom-right quadrant of <block>-ctm.png

Fusion has a Horizontal and Vertical layout which correspond pretty well to 1.12.1 CTM vertical/horizontal layouts, the difference is that the Horizontal layout is a 4x1 spritesheet (64x16) and the Vertical layout is a 1x4 spritesheet (16x64).

* Horizontal: (0,0) No Adjacencies, (0,1) E only, (0,2) E+W, (0,3) W only
* Vertical goes (0,0) Adjacencies, (1,0) S only, (2,0) N+S, (3,0) N only

These are probably the best bets for migrating from CTM to Fusion.

When blocks are connecting in fusion, their block model json should take "type:connecting" and their texture png file should have a <block>.png.mcmeta which is an snbt file that contains {"fusion": {"type": "<layout-type>"}}, so eg "pieced" or "horizontal".