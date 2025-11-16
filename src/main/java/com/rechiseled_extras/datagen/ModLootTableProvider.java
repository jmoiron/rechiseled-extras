package com.rechiseled_extras.datagen;

import com.rechiseled_extras.registry.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.flag.FeatureFlags;

import java.util.List;
import java.util.Set;

public class ModLootTableProvider extends LootTableProvider {

    public ModLootTableProvider(PackOutput output) {
        super(output, Set.of(), List.of(
                new SubProviderEntry(ModBlockLootTables::new, LootContextParamSets.BLOCK)
        ));
    }

    public static class ModBlockLootTables extends net.minecraft.data.loot.BlockLootSubProvider {

        protected ModBlockLootTables() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
        }

        @Override
        protected void generate() {
            // Simple blocks that drop themselves
            dropSelf(ModBlocks.VALENTINES_PINK_MARKER.get());
            dropSelf(ModBlocks.VALENTINES_GRAY_ROCKY.get());
            dropSelf(ModBlocks.VALENTINES_PINK_HEART.get());
            dropSelf(ModBlocks.VALENTINES_PINK_ROCKY.get());
            dropSelf(ModBlocks.VALENTINES_PINK_TILE.get());
            dropSelf(ModBlocks.VALENTINES_PINK_CRACKS.get());
            dropSelf(ModBlocks.VALENTINES_PINK_STUDDED.get());
            dropSelf(ModBlocks.VALENTINES_FLAME.get());
            dropSelf(ModBlocks.VALENTINES_PINK_STEEL.get());
            dropSelf(ModBlocks.VALENTINES_COMPANION.get());

            // Tyrian blocks
            dropSelf(ModBlocks.TYRIAN_DISORDERED_METAL_BITS.get());
            dropSelf(ModBlocks.TYRIAN_METAL_PLATES.get());
            dropSelf(ModBlocks.TYRIAN_DISORDERED_PURPLE_BITS.get());
            dropSelf(ModBlocks.TYRIAN_PURPLE_PLATES.get());
            dropSelf(ModBlocks.TYRIAN_RUST.get());
            dropSelf(ModBlocks.TYRIAN_SHINY_PLATES.get());
            dropSelf(ModBlocks.TYRIAN_ROUTES.get());
            dropSelf(ModBlocks.TYRIAN_PLATFORM.get());
            dropSelf(ModBlocks.TYRIAN_SMALL_UNEVEN_TILES.get());
            dropSelf(ModBlocks.TYRIAN_DIAGONAL_PLATES.get());
            dropSelf(ModBlocks.TYRIAN_DENT.get());
            dropSelf(ModBlocks.TYRIAN_BLUE_PLATES.get());
            dropSelf(ModBlocks.TYRIAN_BLACK_SCALED_PLATES.get());
            dropSelf(ModBlocks.TYRIAN_BLACK_STRIPS.get());
            dropSelf(ModBlocks.TYRIAN_OPENING.get());
            dropSelf(ModBlocks.TYRIAN_SHINY_PLATE.get());

            // Voidstone blocks - simple variants
            dropSelf(ModBlocks.VOIDSTONE_RAW.get());
            dropSelf(ModBlocks.VOIDSTONE_MEDIUM_TILES.get());
            dropSelf(ModBlocks.VOIDSTONE_PANEL.get());
            dropSelf(ModBlocks.VOIDSTONE_SKULLS.get());
            dropSelf(ModBlocks.VOIDSTONE_RUNE.get());
            dropSelf(ModBlocks.VOIDSTONE_EYE.get());

            // Voidstone primal variants
            dropSelf(ModBlocks.VOIDSTONE_PRIMAL_RAW.get());
            dropSelf(ModBlocks.VOIDSTONE_PRIMAL_MEDIUM_TILES.get());
            dropSelf(ModBlocks.VOIDSTONE_PRIMAL_PANEL.get());
            dropSelf(ModBlocks.VOIDSTONE_PRIMAL_SKULLS.get());
            dropSelf(ModBlocks.VOIDSTONE_PRIMAL_RUNE.get());
            dropSelf(ModBlocks.VOIDSTONE_PRIMAL_EYE.get());

            // Voidstone rune variants
            dropSelf(ModBlocks.VOIDSTONE_RUNE_BLACK.get());
            dropSelf(ModBlocks.VOIDSTONE_RUNE_RED.get());
            dropSelf(ModBlocks.VOIDSTONE_RUNE_GREEN.get());
            dropSelf(ModBlocks.VOIDSTONE_RUNE_BROWN.get());
            dropSelf(ModBlocks.VOIDSTONE_RUNE_BLUE.get());
            dropSelf(ModBlocks.VOIDSTONE_RUNE_PURPLE.get());
            dropSelf(ModBlocks.VOIDSTONE_RUNE_CYAN.get());
            dropSelf(ModBlocks.VOIDSTONE_RUNE_LIGHTGRAY.get());
            dropSelf(ModBlocks.VOIDSTONE_RUNE_GRAY.get());
            dropSelf(ModBlocks.VOIDSTONE_RUNE_PINK.get());
            dropSelf(ModBlocks.VOIDSTONE_RUNE_LIME.get());
            dropSelf(ModBlocks.VOIDSTONE_RUNE_YELLOW.get());
            dropSelf(ModBlocks.VOIDSTONE_RUNE_LIGHTBLUE.get());
            dropSelf(ModBlocks.VOIDSTONE_RUNE_MAGENTA.get());
            dropSelf(ModBlocks.VOIDSTONE_RUNE_ORANGE.get());

            // Laboratory blocks - simple variants
            dropSelf(ModBlocks.LABORATORY_CHECKERED_TILES.get());
            dropSelf(ModBlocks.LABORATORY_DARK_MEDIUM_TILES.get());
            dropSelf(ModBlocks.LABORATORY_LARGE_TILES.get());
            dropSelf(ModBlocks.LABORATORY_MEDIUM_TILES.get());
            dropSelf(ModBlocks.LABORATORY_LARGE_STEEL.get());
            dropSelf(ModBlocks.LABORATORY_SMALL_STEEL.get());

            // Laboratory blocks - CTM variants
            dropSelf(ModBlocks.LABORATORY_SCREEN.get());
            dropSelf(ModBlocks.LABORATORY_FUZZY_SCREEN.get());
            dropSelf(ModBlocks.LABORATORY_TILE.get());
            dropSelf(ModBlocks.LABORATORY_ROUNDEL.get());
            dropSelf(ModBlocks.LABORATORY_LEFT_FACED_ARROWS.get());
            dropSelf(ModBlocks.LABORATORY_RIGHT_FACED_ARROWS.get());
            dropSelf(ModBlocks.LABORATORY_DOTTED_PANEL.get());
            dropSelf(ModBlocks.LABORATORY_DOTTED_PANEL_WALL_CONNECTING.get());
            dropSelf(ModBlocks.LABORATORY_CONSOLE.get());
            dropSelf(ModBlocks.LABORATORY_WHITE_PANEL.get());
            dropSelf(ModBlocks.LABORATORY_WHITE_PANEL_WALL_CONNECTING.get());
            dropSelf(ModBlocks.LABORATORY_VENTS.get());

            // Voidstone CTM variants
            dropSelf(ModBlocks.VOIDSTONE_DENT.get());
            dropSelf(ModBlocks.VOIDSTONE_METALLIC.get());
            dropSelf(ModBlocks.VOIDSTONE_PRIMAL_DENT.get());
            dropSelf(ModBlocks.VOIDSTONE_PRIMAL_METALLIC.get());

            // Factory blocks - simple variant
            dropSelf(ModBlocks.FACTORY_OLD_VENTS.get());

            // Factory blocks - CTM variants
            dropSelf(ModBlocks.FACTORY_DOTTED_RUSTY_PLATE.get());
            dropSelf(ModBlocks.FACTORY_RUSTY_PLATE.get());
            dropSelf(ModBlocks.FACTORY_VERY_RUSTY_PLATE.get());
            dropSelf(ModBlocks.FACTORY_SLIGHTLY_RUSTY_PLATE.get());
            dropSelf(ModBlocks.FACTORY_WIREFRAME.get());
            dropSelf(ModBlocks.FACTORY_PURPLE_WIREFRAME.get());
            dropSelf(ModBlocks.FACTORY_YELLOW_BLACK_CAUTION_STRIPES.get());
            dropSelf(ModBlocks.FACTORY_ORANGE_WHITE_CAUTION_STRIPES.get());
            dropSelf(ModBlocks.FACTORY_CIRCUIT.get());
            dropSelf(ModBlocks.FACTORY_GOLD_PLATED_CIRCUIT.get());
            dropSelf(ModBlocks.FACTORY_GOLD_FRAMED_PURPLE_PLATES.get());
            dropSelf(ModBlocks.FACTORY_GRINDER.get());
            dropSelf(ModBlocks.FACTORY_SEGMENTED_RUSTY_PLATES.get());
            dropSelf(ModBlocks.FACTORY_METAL_COLUMN.get());
            dropSelf(ModBlocks.FACTORY_BLUE_FRAMED_CIRCUIT.get());
            dropSelf(ModBlocks.FACTORY_ICE_ICE_ICE.get());
            dropSelf(ModBlocks.FACTORY_BLUE_CIRCUITS.get());
            dropSelf(ModBlocks.FACTORY_VENTS.get());
            dropSelf(ModBlocks.FACTORY_BLUE_WIREFRAME.get());

            // Futura blocks
            dropSelf(ModBlocks.FUTURA_CONTROLLER.get());
            dropSelf(ModBlocks.FUTURA_CONTROLLER_PURPLE.get());
            dropSelf(ModBlocks.FUTURA_SCREEN_CYAN.get());
            dropSelf(ModBlocks.FUTURA_SCREEN_GRAY.get());
            dropSelf(ModBlocks.FUTURA_RAINBOWLICIOUSLY_WAVY.get());
            dropSelf(ModBlocks.FUTURA_FABULOUSLY_WAVY.get());

            // Add all connecting blocks (blocks created by the connecting() method)
            // These are the _connecting variants that need loot tables
            addConnectingBlocks();

            // Technical (factory/technical) - simple static blocks
            dropSelf(ModBlocks.TECHNICAL_INDUSTRIAL_RELIC.get());
            dropSelf(ModBlocks.TECHNICAL_WIRES.get());
            dropSelf(ModBlocks.TECHNICAL_OLD.get());
            dropSelf(ModBlocks.TECHNICAL_MEGACELL.get());

            // Technical (factory/technical) - CTM-only blocks (regular variants)
            dropSelf(ModBlocks.TECHNICAL_CABLES.get());
            dropSelf(ModBlocks.TECHNICAL_CAUTION_FRAMED_PLATES.get());
            dropSelf(ModBlocks.TECHNICAL_INSULATION.get());
            dropSelf(ModBlocks.TECHNICAL_LARGE_PIPES.get());
            dropSelf(ModBlocks.TECHNICAL_SMALL_PIPES.get());
            dropSelf(ModBlocks.TECHNICAL_RUSTY_SCAFFOLD.get());
            dropSelf(ModBlocks.TECHNICAL_RUSTY_SCAFFOLD_TRANSPARENT.get());
            dropSelf(ModBlocks.TECHNICAL_RUSTY_BOLTED_PLATES.get());
            dropSelf(ModBlocks.TECHNICAL_VENT.get());
            dropSelf(ModBlocks.TECHNICAL_GLOWING_VENT.get());
            dropSelf(ModBlocks.TECHNICAL_GRATE.get());
            dropSelf(ModBlocks.TECHNICAL_RUSTY_GRATE.get());
            dropSelf(ModBlocks.TECHNICAL_FAN_FAST.get());
            dropSelf(ModBlocks.TECHNICAL_FAN_STILL.get());
            dropSelf(ModBlocks.TECHNICAL_FAN_FAST_TRANSPARENT.get());
            dropSelf(ModBlocks.TECHNICAL_FAN_STILL_TRANSPARENT.get());
            dropSelf(ModBlocks.TECHNICAL_FAN_MALFUNCTIONING.get());
            dropSelf(ModBlocks.TECHNICAL_GEARS_AND_FLYWHEELS.get());
            dropSelf(ModBlocks.TECHNICAL_STURDY.get());
            dropSelf(ModBlocks.TECHNICAL_EXHAUST_PLATING.get());
        }

        /**
         * Adds loot tables for all connecting blocks (blocks with _connecting suffix)
         */
        private void addConnectingBlocks() {
            // Get all connecting blocks by finding blocks in the registry that end with "_connecting"
            ModBlocks.BLOCKS.getEntries().stream()
                    .filter(block -> block.getId().getPath().endsWith("_connecting"))
                    .forEach(block -> dropSelf(block.get()));
        }

        @Override
        protected Iterable<net.minecraft.world.level.block.Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(net.minecraftforge.registries.RegistryObject::get)::iterator;
        }
    }
}
