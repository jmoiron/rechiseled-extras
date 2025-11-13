package com.rechiseled_extras.datagen;

import com.rechiseled_extras.RechiseledExtras;
import com.rechiseled_extras.registry.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, RechiseledExtras.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // For now, just generate simple block states for all blocks
        // This assumes all blocks use simple cube models with textures matching their registry names
        
        // Valentines blocks
        simpleBlock(ModBlocks.VALENTINES_PINK_MARKER.get());
        simpleBlock(ModBlocks.VALENTINES_GRAY_ROCKY.get());
        simpleBlock(ModBlocks.VALENTINES_PINK_HEART.get());
        simpleBlock(ModBlocks.VALENTINES_PINK_ROCKY.get());
        simpleBlock(ModBlocks.VALENTINES_PINK_TILE.get());
        simpleBlock(ModBlocks.VALENTINES_PINK_CRACKS.get());
        simpleBlock(ModBlocks.VALENTINES_PINK_STUDDED.get());
        simpleBlock(ModBlocks.VALENTINES_FLAME.get());
        simpleBlock(ModBlocks.VALENTINES_PINK_STEEL.get());
        simpleBlock(ModBlocks.VALENTINES_COMPANION.get());

        // Tyrian blocks
        simpleBlock(ModBlocks.TYRIAN_DISORDERED_METAL_BITS.get());
        simpleBlock(ModBlocks.TYRIAN_METAL_PLATES.get());
        simpleBlock(ModBlocks.TYRIAN_DISORDERED_PURPLE_BITS.get());
        simpleBlock(ModBlocks.TYRIAN_PURPLE_PLATES.get());
        simpleBlock(ModBlocks.TYRIAN_RUST.get());
        simpleBlock(ModBlocks.TYRIAN_SHINY_PLATES.get());
        simpleBlock(ModBlocks.TYRIAN_ROUTES.get());
        simpleBlock(ModBlocks.TYRIAN_PLATFORM.get());
        simpleBlock(ModBlocks.TYRIAN_SMALL_UNEVEN_TILES.get());
        simpleBlock(ModBlocks.TYRIAN_DIAGONAL_PLATES.get());
        simpleBlock(ModBlocks.TYRIAN_DENT.get());
        simpleBlock(ModBlocks.TYRIAN_BLUE_PLATES.get());
        simpleBlock(ModBlocks.TYRIAN_BLACK_SCALED_PLATES.get());
        simpleBlock(ModBlocks.TYRIAN_BLACK_STRIPS.get());
        simpleBlock(ModBlocks.TYRIAN_OPENING.get());

        // Voidstone blocks - simple variants
        simpleBlock(ModBlocks.VOIDSTONE_RAW.get());
        simpleBlock(ModBlocks.VOIDSTONE_MEDIUM_TILES.get());
        simpleBlock(ModBlocks.VOIDSTONE_PANEL.get());
        simpleBlock(ModBlocks.VOIDSTONE_SKULLS.get());
        simpleBlock(ModBlocks.VOIDSTONE_RUNE.get());
        simpleBlock(ModBlocks.VOIDSTONE_EYE.get());

        // Voidstone primal variants
        simpleBlock(ModBlocks.VOIDSTONE_PRIMAL_RAW.get());
        simpleBlock(ModBlocks.VOIDSTONE_PRIMAL_MEDIUM_TILES.get());
        simpleBlock(ModBlocks.VOIDSTONE_PRIMAL_PANEL.get());
        simpleBlock(ModBlocks.VOIDSTONE_PRIMAL_SKULLS.get());
        simpleBlock(ModBlocks.VOIDSTONE_PRIMAL_RUNE.get());
        simpleBlock(ModBlocks.VOIDSTONE_PRIMAL_EYE.get());

        // Voidstone rune variants
        simpleBlock(ModBlocks.VOIDSTONE_RUNE_BLACK.get());
        simpleBlock(ModBlocks.VOIDSTONE_RUNE_RED.get());
        simpleBlock(ModBlocks.VOIDSTONE_RUNE_GREEN.get());
        simpleBlock(ModBlocks.VOIDSTONE_RUNE_BROWN.get());
        simpleBlock(ModBlocks.VOIDSTONE_RUNE_BLUE.get());
        simpleBlock(ModBlocks.VOIDSTONE_RUNE_PURPLE.get());
        simpleBlock(ModBlocks.VOIDSTONE_RUNE_CYAN.get());
        simpleBlock(ModBlocks.VOIDSTONE_RUNE_LIGHTGRAY.get());
        simpleBlock(ModBlocks.VOIDSTONE_RUNE_GRAY.get());
        simpleBlock(ModBlocks.VOIDSTONE_RUNE_PINK.get());
        simpleBlock(ModBlocks.VOIDSTONE_RUNE_LIME.get());
        simpleBlock(ModBlocks.VOIDSTONE_RUNE_YELLOW.get());
        simpleBlock(ModBlocks.VOIDSTONE_RUNE_LIGHTBLUE.get());
        simpleBlock(ModBlocks.VOIDSTONE_RUNE_MAGENTA.get());
        simpleBlock(ModBlocks.VOIDSTONE_RUNE_ORANGE.get());

        // Laboratory blocks - simple variants
        simpleBlock(ModBlocks.LABORATORY_CHECKERED_TILES.get());
        simpleBlock(ModBlocks.LABORATORY_DARK_MEDIUM_TILES.get());
        simpleBlock(ModBlocks.LABORATORY_LARGE_TILES.get());
        simpleBlock(ModBlocks.LABORATORY_MEDIUM_TILES.get());
        simpleBlock(ModBlocks.LABORATORY_LARGE_STEEL.get());
        simpleBlock(ModBlocks.LABORATORY_SMALL_STEEL.get());

        // Factory blocks
        simpleBlock(ModBlocks.FACTORY_OLD_VENTS.get());

        // Futura blocks
        simpleBlock(ModBlocks.FUTURA_RAINBOWLICIOUSLY_WAVY.get());

        // Note: CTM blocks (connecting variants) typically need special handling
        // For now, we'll generate basic blockstates but they may need custom models
        // This includes laboratory CTM variants, voidstone CTM variants, factory CTM variants, etc.
        // These would normally require more complex blockstate files to handle CTM texturing
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}