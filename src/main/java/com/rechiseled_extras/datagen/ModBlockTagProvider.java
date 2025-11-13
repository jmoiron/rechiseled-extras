package com.rechiseled_extras.datagen;

import com.rechiseled_extras.RechiseledExtras;
import com.rechiseled_extras.registry.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, RechiseledExtras.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        // All blocks require pickaxe to mine
        addPickaxeMineable();
        
        // All blocks have stone mining level
        addStoneMiningLevel();
    }

    private void addPickaxeMineable() {
        var pickaxeTag = tag(BlockTags.MINEABLE_WITH_PICKAXE);
        
        // Valentines blocks
        pickaxeTag.add(
            ModBlocks.VALENTINES_PINK_MARKER.get(),
            ModBlocks.VALENTINES_GRAY_ROCKY.get(),
            ModBlocks.VALENTINES_PINK_HEART.get(),
            ModBlocks.VALENTINES_PINK_ROCKY.get(),
            ModBlocks.VALENTINES_PINK_TILE.get(),
            ModBlocks.VALENTINES_PINK_CRACKS.get(),
            ModBlocks.VALENTINES_PINK_STUDDED.get(),
            ModBlocks.VALENTINES_FLAME.get(),
            ModBlocks.VALENTINES_PINK_STEEL.get(),
            ModBlocks.VALENTINES_COMPANION.get()
        );

        // Tyrian blocks
        pickaxeTag.add(
            ModBlocks.TYRIAN_DISORDERED_METAL_BITS.get(),
            ModBlocks.TYRIAN_METAL_PLATES.get(),
            ModBlocks.TYRIAN_DISORDERED_PURPLE_BITS.get(),
            ModBlocks.TYRIAN_PURPLE_PLATES.get(),
            ModBlocks.TYRIAN_RUST.get(),
            ModBlocks.TYRIAN_SHINY_PLATES.get(),
            ModBlocks.TYRIAN_ROUTES.get(),
            ModBlocks.TYRIAN_PLATFORM.get(),
            ModBlocks.TYRIAN_SMALL_UNEVEN_TILES.get(),
            ModBlocks.TYRIAN_DIAGONAL_PLATES.get(),
            ModBlocks.TYRIAN_DENT.get(),
            ModBlocks.TYRIAN_BLUE_PLATES.get(),
            ModBlocks.TYRIAN_BLACK_SCALED_PLATES.get(),
            ModBlocks.TYRIAN_BLACK_STRIPS.get(),
            ModBlocks.TYRIAN_OPENING.get(),
            ModBlocks.TYRIAN_SHINY_PLATE.get()
        );

        // Voidstone blocks - simple variants
        pickaxeTag.add(
            ModBlocks.VOIDSTONE_RAW.get(),
            ModBlocks.VOIDSTONE_MEDIUM_TILES.get(),
            ModBlocks.VOIDSTONE_PANEL.get(),
            ModBlocks.VOIDSTONE_SKULLS.get(),
            ModBlocks.VOIDSTONE_RUNE.get(),
            ModBlocks.VOIDSTONE_EYE.get()
        );

        // Voidstone primal variants
        pickaxeTag.add(
            ModBlocks.VOIDSTONE_PRIMAL_RAW.get(),
            ModBlocks.VOIDSTONE_PRIMAL_MEDIUM_TILES.get(),
            ModBlocks.VOIDSTONE_PRIMAL_PANEL.get(),
            ModBlocks.VOIDSTONE_PRIMAL_SKULLS.get(),
            ModBlocks.VOIDSTONE_PRIMAL_RUNE.get(),
            ModBlocks.VOIDSTONE_PRIMAL_EYE.get()
        );

        // Voidstone rune variants
        pickaxeTag.add(
            ModBlocks.VOIDSTONE_RUNE_BLACK.get(),
            ModBlocks.VOIDSTONE_RUNE_RED.get(),
            ModBlocks.VOIDSTONE_RUNE_GREEN.get(),
            ModBlocks.VOIDSTONE_RUNE_BROWN.get(),
            ModBlocks.VOIDSTONE_RUNE_BLUE.get(),
            ModBlocks.VOIDSTONE_RUNE_PURPLE.get(),
            ModBlocks.VOIDSTONE_RUNE_CYAN.get(),
            ModBlocks.VOIDSTONE_RUNE_LIGHTGRAY.get(),
            ModBlocks.VOIDSTONE_RUNE_GRAY.get(),
            ModBlocks.VOIDSTONE_RUNE_PINK.get(),
            ModBlocks.VOIDSTONE_RUNE_LIME.get(),
            ModBlocks.VOIDSTONE_RUNE_YELLOW.get(),
            ModBlocks.VOIDSTONE_RUNE_LIGHTBLUE.get(),
            ModBlocks.VOIDSTONE_RUNE_MAGENTA.get(),
            ModBlocks.VOIDSTONE_RUNE_ORANGE.get()
        );

        // Laboratory blocks - simple variants
        pickaxeTag.add(
            ModBlocks.LABORATORY_CHECKERED_TILES.get(),
            ModBlocks.LABORATORY_DARK_MEDIUM_TILES.get(),
            ModBlocks.LABORATORY_LARGE_TILES.get(),
            ModBlocks.LABORATORY_MEDIUM_TILES.get(),
            ModBlocks.LABORATORY_LARGE_STEEL.get(),
            ModBlocks.LABORATORY_SMALL_STEEL.get()
        );

        // Laboratory blocks - CTM variants (both regular and connecting)
        pickaxeTag.add(
            ModBlocks.LABORATORY_SCREEN.get(),
            ModBlocks.LABORATORY_FUZZY_SCREEN.get(),
            ModBlocks.LABORATORY_TILE.get(),
            ModBlocks.LABORATORY_ROUNDEL.get(),
            ModBlocks.LABORATORY_LEFT_FACED_ARROWS.get(),
            ModBlocks.LABORATORY_RIGHT_FACED_ARROWS.get(),
            ModBlocks.LABORATORY_DOTTED_PANEL.get(),
            ModBlocks.LABORATORY_DOTTED_PANEL_WALL_CONNECTING.get(),
            ModBlocks.LABORATORY_CONSOLE.get(),
            ModBlocks.LABORATORY_WHITE_PANEL.get(),
            ModBlocks.LABORATORY_WHITE_PANEL_WALL_CONNECTING.get(),
            ModBlocks.LABORATORY_VENTS.get()
        );

        // Voidstone CTM variants
        pickaxeTag.add(
            ModBlocks.VOIDSTONE_DENT.get(),
            ModBlocks.VOIDSTONE_METALLIC.get(),
            ModBlocks.VOIDSTONE_PRIMAL_DENT.get(),
            ModBlocks.VOIDSTONE_PRIMAL_METALLIC.get()
        );

        // Factory blocks - simple variant
        pickaxeTag.add(ModBlocks.FACTORY_OLD_VENTS.get());

        // Factory blocks - CTM variants
        pickaxeTag.add(
            ModBlocks.FACTORY_DOTTED_RUSTY_PLATE.get(),
            ModBlocks.FACTORY_RUSTY_PLATE.get(),
            ModBlocks.FACTORY_VERY_RUSTY_PLATE.get(),
            ModBlocks.FACTORY_SLIGHTLY_RUSTY_PLATE.get(),
            ModBlocks.FACTORY_WIREFRAME.get(),
            ModBlocks.FACTORY_PURPLE_WIREFRAME.get(),
            ModBlocks.FACTORY_YELLOW_BLACK_CAUTION_STRIPES.get(),
            ModBlocks.FACTORY_ORANGE_WHITE_CAUTION_STRIPES.get(),
            ModBlocks.FACTORY_CIRCUIT.get(),
            ModBlocks.FACTORY_GOLD_PLATED_CIRCUIT.get(),
            ModBlocks.FACTORY_GOLD_FRAMED_PURPLE_PLATES.get(),
            ModBlocks.FACTORY_GRINDER.get(),
            ModBlocks.FACTORY_SEGMENTED_RUSTY_PLATES.get(),
            ModBlocks.FACTORY_METAL_COLUMN.get(),
            ModBlocks.FACTORY_BLUE_FRAMED_CIRCUIT.get(),
            ModBlocks.FACTORY_ICE_ICE_ICE.get(),
            ModBlocks.FACTORY_BLUE_CIRCUITS.get(),
            ModBlocks.FACTORY_VENTS.get(),
            ModBlocks.FACTORY_BLUE_WIREFRAME.get()
        );

        // Futura blocks
        pickaxeTag.add(
            ModBlocks.FUTURA_CONTROLLER.get(),
            ModBlocks.FUTURA_CONTROLLER_PURPLE.get(),
            ModBlocks.FUTURA_SCREEN_CYAN.get(),
            ModBlocks.FUTURA_SCREEN_GRAY.get(),
            ModBlocks.FUTURA_RAINBOWLICIOUSLY_WAVY.get(),
            ModBlocks.FUTURA_FABULOUSLY_WAVY.get()
        );
    }

    private void addStoneMiningLevel() {
        var stoneTag = tag(BlockTags.NEEDS_STONE_TOOL);
        
        // Add all mod blocks to stone tier - they all have the same mining requirements
        // Using the same block lists as pickaxe mineable since all our blocks are stone tier
        
        // Valentines blocks
        stoneTag.add(
            ModBlocks.VALENTINES_PINK_MARKER.get(),
            ModBlocks.VALENTINES_GRAY_ROCKY.get(),
            ModBlocks.VALENTINES_PINK_HEART.get(),
            ModBlocks.VALENTINES_PINK_ROCKY.get(),
            ModBlocks.VALENTINES_PINK_TILE.get(),
            ModBlocks.VALENTINES_PINK_CRACKS.get(),
            ModBlocks.VALENTINES_PINK_STUDDED.get(),
            ModBlocks.VALENTINES_FLAME.get(),
            ModBlocks.VALENTINES_PINK_STEEL.get(),
            ModBlocks.VALENTINES_COMPANION.get()
        );

        // Tyrian blocks
        stoneTag.add(
            ModBlocks.TYRIAN_DISORDERED_METAL_BITS.get(),
            ModBlocks.TYRIAN_METAL_PLATES.get(),
            ModBlocks.TYRIAN_DISORDERED_PURPLE_BITS.get(),
            ModBlocks.TYRIAN_PURPLE_PLATES.get(),
            ModBlocks.TYRIAN_RUST.get(),
            ModBlocks.TYRIAN_SHINY_PLATES.get(),
            ModBlocks.TYRIAN_ROUTES.get(),
            ModBlocks.TYRIAN_PLATFORM.get(),
            ModBlocks.TYRIAN_SMALL_UNEVEN_TILES.get(),
            ModBlocks.TYRIAN_DIAGONAL_PLATES.get(),
            ModBlocks.TYRIAN_DENT.get(),
            ModBlocks.TYRIAN_BLUE_PLATES.get(),
            ModBlocks.TYRIAN_BLACK_SCALED_PLATES.get(),
            ModBlocks.TYRIAN_BLACK_STRIPS.get(),
            ModBlocks.TYRIAN_OPENING.get(),
            ModBlocks.TYRIAN_SHINY_PLATE.get()
        );

        // Voidstone blocks - simple variants
        stoneTag.add(
            ModBlocks.VOIDSTONE_RAW.get(),
            ModBlocks.VOIDSTONE_MEDIUM_TILES.get(),
            ModBlocks.VOIDSTONE_PANEL.get(),
            ModBlocks.VOIDSTONE_SKULLS.get(),
            ModBlocks.VOIDSTONE_RUNE.get(),
            ModBlocks.VOIDSTONE_EYE.get()
        );

        // Voidstone primal variants
        stoneTag.add(
            ModBlocks.VOIDSTONE_PRIMAL_RAW.get(),
            ModBlocks.VOIDSTONE_PRIMAL_MEDIUM_TILES.get(),
            ModBlocks.VOIDSTONE_PRIMAL_PANEL.get(),
            ModBlocks.VOIDSTONE_PRIMAL_SKULLS.get(),
            ModBlocks.VOIDSTONE_PRIMAL_RUNE.get(),
            ModBlocks.VOIDSTONE_PRIMAL_EYE.get()
        );

        // Voidstone rune variants
        stoneTag.add(
            ModBlocks.VOIDSTONE_RUNE_BLACK.get(),
            ModBlocks.VOIDSTONE_RUNE_RED.get(),
            ModBlocks.VOIDSTONE_RUNE_GREEN.get(),
            ModBlocks.VOIDSTONE_RUNE_BROWN.get(),
            ModBlocks.VOIDSTONE_RUNE_BLUE.get(),
            ModBlocks.VOIDSTONE_RUNE_PURPLE.get(),
            ModBlocks.VOIDSTONE_RUNE_CYAN.get(),
            ModBlocks.VOIDSTONE_RUNE_LIGHTGRAY.get(),
            ModBlocks.VOIDSTONE_RUNE_GRAY.get(),
            ModBlocks.VOIDSTONE_RUNE_PINK.get(),
            ModBlocks.VOIDSTONE_RUNE_LIME.get(),
            ModBlocks.VOIDSTONE_RUNE_YELLOW.get(),
            ModBlocks.VOIDSTONE_RUNE_LIGHTBLUE.get(),
            ModBlocks.VOIDSTONE_RUNE_MAGENTA.get(),
            ModBlocks.VOIDSTONE_RUNE_ORANGE.get()
        );

        // Laboratory blocks - simple variants
        stoneTag.add(
            ModBlocks.LABORATORY_CHECKERED_TILES.get(),
            ModBlocks.LABORATORY_DARK_MEDIUM_TILES.get(),
            ModBlocks.LABORATORY_LARGE_TILES.get(),
            ModBlocks.LABORATORY_MEDIUM_TILES.get(),
            ModBlocks.LABORATORY_LARGE_STEEL.get(),
            ModBlocks.LABORATORY_SMALL_STEEL.get()
        );

        // Laboratory blocks - CTM variants
        stoneTag.add(
            ModBlocks.LABORATORY_SCREEN.get(),
            ModBlocks.LABORATORY_FUZZY_SCREEN.get(),
            ModBlocks.LABORATORY_TILE.get(),
            ModBlocks.LABORATORY_ROUNDEL.get(),
            ModBlocks.LABORATORY_LEFT_FACED_ARROWS.get(),
            ModBlocks.LABORATORY_RIGHT_FACED_ARROWS.get(),
            ModBlocks.LABORATORY_DOTTED_PANEL.get(),
            ModBlocks.LABORATORY_DOTTED_PANEL_WALL_CONNECTING.get(),
            ModBlocks.LABORATORY_CONSOLE.get(),
            ModBlocks.LABORATORY_WHITE_PANEL.get(),
            ModBlocks.LABORATORY_WHITE_PANEL_WALL_CONNECTING.get(),
            ModBlocks.LABORATORY_VENTS.get()
        );

        // Voidstone CTM variants
        stoneTag.add(
            ModBlocks.VOIDSTONE_DENT.get(),
            ModBlocks.VOIDSTONE_METALLIC.get(),
            ModBlocks.VOIDSTONE_PRIMAL_DENT.get(),
            ModBlocks.VOIDSTONE_PRIMAL_METALLIC.get()
        );

        // Factory blocks - simple variant
        stoneTag.add(ModBlocks.FACTORY_OLD_VENTS.get());

        // Factory blocks - CTM variants
        stoneTag.add(
            ModBlocks.FACTORY_DOTTED_RUSTY_PLATE.get(),
            ModBlocks.FACTORY_RUSTY_PLATE.get(),
            ModBlocks.FACTORY_VERY_RUSTY_PLATE.get(),
            ModBlocks.FACTORY_SLIGHTLY_RUSTY_PLATE.get(),
            ModBlocks.FACTORY_WIREFRAME.get(),
            ModBlocks.FACTORY_PURPLE_WIREFRAME.get(),
            ModBlocks.FACTORY_YELLOW_BLACK_CAUTION_STRIPES.get(),
            ModBlocks.FACTORY_ORANGE_WHITE_CAUTION_STRIPES.get(),
            ModBlocks.FACTORY_CIRCUIT.get(),
            ModBlocks.FACTORY_GOLD_PLATED_CIRCUIT.get(),
            ModBlocks.FACTORY_GOLD_FRAMED_PURPLE_PLATES.get(),
            ModBlocks.FACTORY_GRINDER.get(),
            ModBlocks.FACTORY_SEGMENTED_RUSTY_PLATES.get(),
            ModBlocks.FACTORY_METAL_COLUMN.get(),
            ModBlocks.FACTORY_BLUE_FRAMED_CIRCUIT.get(),
            ModBlocks.FACTORY_ICE_ICE_ICE.get(),
            ModBlocks.FACTORY_BLUE_CIRCUITS.get(),
            ModBlocks.FACTORY_VENTS.get(),
            ModBlocks.FACTORY_BLUE_WIREFRAME.get()
        );

        // Futura blocks
        stoneTag.add(
            ModBlocks.FUTURA_CONTROLLER.get(),
            ModBlocks.FUTURA_CONTROLLER_PURPLE.get(),
            ModBlocks.FUTURA_SCREEN_CYAN.get(),
            ModBlocks.FUTURA_SCREEN_GRAY.get(),
            ModBlocks.FUTURA_RAINBOWLICIOUSLY_WAVY.get(),
            ModBlocks.FUTURA_FABULOUSLY_WAVY.get()
        );
    }
}