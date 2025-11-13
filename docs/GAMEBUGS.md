This file is a list of all of the bugs I've found when manually testing in game.

## Futura

* The two ME controller blocks are missing a very nuanced effect from the "particle" texture which gives them a slight "shimmer" effect as they also animate. This could be fixed in a future version of the mod as the blocks already look good and connect properly.

## Voidstone

* missing primal voidstone blocks


## Factory

There are so many factory blocks, and we're missing a large number of them because their textures are in "technical."  Lets focus on getting the ordering right first so it's easier to find missing blocks and test the ones that are there.

The ordering is:

- dots -> dotted rusty plate
- rust 2 -> rusty plate
- rust -> very rusty plate
- plate X -> slightly rusty plate
- white wireframe -> wireframe
- wireframe -> purple wireframe
- hazard -> yellow-black caution stripes
- orange hazard -> orange-white caution stripes
- circuit
- metal box (missing)
- gold plate -> gold-plated circuit
- gold plating -> gold-framed purple plates
- grinder
- plating -> old vents
- rust plates -> segmented rusty plates
- column -> metal column
- blue frame -> blue-framed circuit
- ice -> ice ice ice
- tile mosaic -> blue circuits
- vent -> vents
- blue wireframe

(all of the blocks from here out are missing)

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

Bugs:

* vent has a "top" and is supposed to tile both horizontally and vertically.. we should ship horizontal and then perhaps fix it with one of the more complicated layouts later

We should examine the chisel code to find what textures correspond to what blocks so that we can get our naming and ordering consistent.
