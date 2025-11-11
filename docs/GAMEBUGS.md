This file is a list of all of the bugs I've found when manually testing in game.

## Futura

* The two ME controller blocks are missing a very nuanced effect from the "particle" texture which gives them a slight "shimmer" effect as they also animate. This could be fixed in a future version of the mod as the blocks already look good and connect properly.

## Voidstone

* missing primal voidstone blocks


## Factory

There are so many factory blocks, and we're missing a large number of them because their textures are in "technical."  Lets focus on getting the ordering right first so it's easier to find missing blocks and test the ones that are there.

The ordering is:

- dotted rusty plate
- rusty plate
- very rusty plate
- slightly rusty plate
- wireframe
- purple wireframe
- yellow/black caution stripes
- orange/white caution stripes
- circuit
- metal box
- gold-plated circuit
- gold-framed purple plates
- grinder
- old vents
- segmented rusty plates
- metal column
- blue-framed circuit
- ice ice ice
- blue circuits
- vents
- blue wireframe
- rusty scaffold
- caution framed plates
- an old relic (this name is longer but lets call it an old relic)
- large pipes
- fan (fast)
- small pipes
- fan (off)
- vent
- glowing vent
- insulation
- gears & flywheels
- cables
- rusty bolted plates
- grate
- fan (malfunctioning)
- rusty grate
- rusty scaffold - transparent
- fan (fast) - transparent
- fan (still) - transparent
- massive fan
- massive hexagonal plating
- extremely corroded panels
- extremely rusted panels
- sturdy
- megacell battery
- exhaust plating
- sloppy plating
- engineer's pipes
- large rusty scaffold
- pipes

We should examine the chisel code to find what textures correspond to what blocks so that we can get our naming and ordering consistent.
