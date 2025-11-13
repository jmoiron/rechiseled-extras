package com.rechiseled_extras.registry;

import com.rechiseled_extras.RechiseledExtras;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RechiseledExtras.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RECHISELED_EXTRAS_TAB = CREATIVE_MODE_TABS.register("rechiseled_extras_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.rechiseled_extras"))
                    .icon(() -> new ItemStack(ModItems.VALENTINES_PINK_MARKER.get()))
                    .displayItems((parameters, output) -> {
                        // Valentines blocks
                        output.accept(ModItems.VALENTINES_PINK_MARKER.get());
                        output.accept(ModItems.VALENTINES_GRAY_ROCKY.get());
                        output.accept(ModItems.VALENTINES_PINK_HEART.get());
                        output.accept(ModItems.VALENTINES_PINK_ROCKY.get());
                        output.accept(ModItems.VALENTINES_PINK_TILE.get());
                        output.accept(ModItems.VALENTINES_PINK_CRACKS.get());
                        output.accept(ModItems.VALENTINES_PINK_STUDDED.get());
                        output.accept(ModItems.VALENTINES_FLAME.get());
                        output.accept(ModItems.VALENTINES_PINK_STEEL.get());
                        output.accept(ModItems.VALENTINES_COMPANION.get());

                        // Tyrian blocks
                        output.accept(ModItems.TYRIAN_DISORDERED_METAL_BITS.get());
                        output.accept(ModItems.TYRIAN_METAL_PLATES.get());
                        output.accept(ModItems.TYRIAN_DISORDERED_PURPLE_BITS.get());
                        output.accept(ModItems.TYRIAN_PURPLE_PLATES.get());
                        output.accept(ModItems.TYRIAN_RUST.get());
                        output.accept(ModItems.TYRIAN_SHINY_PLATES.get());
                        output.accept(ModItems.TYRIAN_ROUTES.get());
                        output.accept(ModItems.TYRIAN_PLATFORM.get());
                        output.accept(ModItems.TYRIAN_SMALL_UNEVEN_TILES.get());
                        output.accept(ModItems.TYRIAN_DIAGONAL_PLATES.get());
                        output.accept(ModItems.TYRIAN_DENT.get());
                        output.accept(ModItems.TYRIAN_BLUE_PLATES.get());
                        output.accept(ModItems.TYRIAN_BLACK_SCALED_PLATES.get());
                        output.accept(ModItems.TYRIAN_BLACK_STRIPS.get());
                        output.accept(ModItems.TYRIAN_OPENING.get());

                        // Tyrian blocks - CTM variants (regular)
                        output.accept(ModItems.TYRIAN_SHINY_PLATE.get());

                        // Tyrian blocks - CTM variants (connecting)
                        output.accept(ModItems.TYRIAN_SHINY_PLATE_CONNECTING.get());

                        // Voidstone blocks - simple variants (reordered)
                        output.accept(ModItems.VOIDSTONE_RAW.get());
                        output.accept(ModItems.VOIDSTONE_MEDIUM_TILES.get());
                        output.accept(ModItems.VOIDSTONE_PANEL.get());
                        output.accept(ModItems.VOIDSTONE_SKULLS.get());
                        output.accept(ModItems.VOIDSTONE_RUNE.get());
                        output.accept(ModItems.VOIDSTONE_EYE.get());

                        // Voidstone primal variants (same order as base blocks)
                        output.accept(ModItems.VOIDSTONE_PRIMAL_RAW.get());
                        output.accept(ModItems.VOIDSTONE_PRIMAL_MEDIUM_TILES.get());
                        output.accept(ModItems.VOIDSTONE_PRIMAL_PANEL.get());
                        output.accept(ModItems.VOIDSTONE_PRIMAL_SKULLS.get());
                        output.accept(ModItems.VOIDSTONE_PRIMAL_RUNE.get());
                        output.accept(ModItems.VOIDSTONE_PRIMAL_EYE.get());

                        // Voidstone rune variants (reordered to match dye colors)
                        output.accept(ModItems.VOIDSTONE_RUNE_BLACK.get());
                        output.accept(ModItems.VOIDSTONE_RUNE_RED.get());
                        output.accept(ModItems.VOIDSTONE_RUNE_GREEN.get());
                        output.accept(ModItems.VOIDSTONE_RUNE_BROWN.get());
                        output.accept(ModItems.VOIDSTONE_RUNE_BLUE.get());
                        output.accept(ModItems.VOIDSTONE_RUNE_PURPLE.get());
                        output.accept(ModItems.VOIDSTONE_RUNE_CYAN.get());
                        output.accept(ModItems.VOIDSTONE_RUNE_LIGHTGRAY.get());
                        output.accept(ModItems.VOIDSTONE_RUNE_GRAY.get());
                        output.accept(ModItems.VOIDSTONE_RUNE_PINK.get());
                        output.accept(ModItems.VOIDSTONE_RUNE_LIME.get());
                        output.accept(ModItems.VOIDSTONE_RUNE_YELLOW.get());
                        output.accept(ModItems.VOIDSTONE_RUNE_LIGHTBLUE.get());
                        output.accept(ModItems.VOIDSTONE_RUNE_MAGENTA.get());
                        output.accept(ModItems.VOIDSTONE_RUNE_ORANGE.get());

                        // Voidstone blocks - CTM variants (regular)
                        output.accept(ModItems.VOIDSTONE_DENT.get());
                        output.accept(ModItems.VOIDSTONE_METALLIC.get());
                        output.accept(ModItems.VOIDSTONE_PRIMAL_DENT.get());
                        output.accept(ModItems.VOIDSTONE_PRIMAL_METALLIC.get());

                        // Voidstone blocks - CTM variants (connecting)
                        output.accept(ModItems.VOIDSTONE_DENT_CONNECTING.get());
                        output.accept(ModItems.VOIDSTONE_METALLIC_CONNECTING.get());
                        output.accept(ModItems.VOIDSTONE_PRIMAL_DENT_CONNECTING.get());
                        output.accept(ModItems.VOIDSTONE_PRIMAL_METALLIC_CONNECTING.get());

                        // Laboratory blocks - non-connecting variants (ordered per GAMEBUGS.md)
                        output.accept(ModItems.LABORATORY_WHITE_PANEL.get());
                        output.accept(ModItems.LABORATORY_DOTTED_PANEL.get());
                        output.accept(ModItems.LABORATORY_TILE.get());
                        output.accept(ModItems.LABORATORY_ROUNDEL.get());
                        output.accept(ModItems.LABORATORY_VENTS.get());
                        output.accept(ModItems.LABORATORY_LARGE_TILES.get());
                        output.accept(ModItems.LABORATORY_MEDIUM_TILES.get());
                        output.accept(ModItems.LABORATORY_DARK_MEDIUM_TILES.get());
                        output.accept(ModItems.LABORATORY_CHECKERED_TILES.get());
                        output.accept(ModItems.LABORATORY_SCREEN.get());
                        output.accept(ModItems.LABORATORY_FUZZY_SCREEN.get());
                        output.accept(ModItems.LABORATORY_LARGE_STEEL.get());
                        output.accept(ModItems.LABORATORY_SMALL_STEEL.get());
                        output.accept(ModItems.LABORATORY_LEFT_FACED_ARROWS.get());
                        output.accept(ModItems.LABORATORY_RIGHT_FACED_ARROWS.get());
                        output.accept(ModItems.LABORATORY_CONSOLE.get());

                        // Laboratory blocks - connecting variants (same order)
                        output.accept(ModItems.LABORATORY_WHITE_PANEL_CONNECTING.get());
                        output.accept(ModItems.LABORATORY_WHITE_PANEL_WALL_CONNECTING.get());
                        output.accept(ModItems.LABORATORY_DOTTED_PANEL_CONNECTING.get());
                        output.accept(ModItems.LABORATORY_DOTTED_PANEL_WALL_CONNECTING.get());
                        output.accept(ModItems.LABORATORY_TILE_CONNECTING.get());
                        output.accept(ModItems.LABORATORY_ROUNDEL_CONNECTING.get());
                        output.accept(ModItems.LABORATORY_VENTS_CONNECTING.get());
                        output.accept(ModItems.LABORATORY_SCREEN_CONNECTING.get());
                        output.accept(ModItems.LABORATORY_FUZZY_SCREEN_CONNECTING.get());
                        output.accept(ModItems.LABORATORY_LEFT_FACED_ARROWS_CONNECTING.get());
                        output.accept(ModItems.LABORATORY_RIGHT_FACED_ARROWS_CONNECTING.get());
                        output.accept(ModItems.LABORATORY_CONSOLE_CONNECTING.get());

                        // Factory blocks - ordered according to GAMEBUGS.md specification
                        output.accept(ModItems.FACTORY_DOTS.get());
                        output.accept(ModItems.FACTORY_DOTS_CONNECTING.get());
                        output.accept(ModItems.FACTORY_RUST2.get());
                        output.accept(ModItems.FACTORY_RUST2_CONNECTING.get());
                        output.accept(ModItems.FACTORY_RUST.get());
                        output.accept(ModItems.FACTORY_RUST_CONNECTING.get());
                        output.accept(ModItems.FACTORY_PLATEX.get());
                        output.accept(ModItems.FACTORY_PLATEX_CONNECTING.get());
                        output.accept(ModItems.FACTORY_WIREFRAMEWHITE.get());
                        output.accept(ModItems.FACTORY_WIREFRAMEWHITE_CONNECTING.get());
                        output.accept(ModItems.FACTORY_WIREFRAME.get());
                        output.accept(ModItems.FACTORY_WIREFRAME_CONNECTING.get());
                        output.accept(ModItems.FACTORY_HAZARD.get());
                        output.accept(ModItems.FACTORY_HAZARD_CONNECTING.get());
                        output.accept(ModItems.FACTORY_HAZARDORANGE.get());
                        output.accept(ModItems.FACTORY_HAZARDORANGE_CONNECTING.get());
                        output.accept(ModItems.FACTORY_CIRCUIT.get());
                        output.accept(ModItems.FACTORY_CIRCUIT_CONNECTING.get());
                        // metal box (missing)
                        output.accept(ModItems.FACTORY_GOLDPLATE.get());
                        output.accept(ModItems.FACTORY_GOLDPLATE_CONNECTING.get());
                        output.accept(ModItems.FACTORY_GOLDPLATING.get());
                        output.accept(ModItems.FACTORY_GOLDPLATING_CONNECTING.get());
                        output.accept(ModItems.FACTORY_GRINDER.get());
                        output.accept(ModItems.FACTORY_GRINDER_CONNECTING.get());
                        output.accept(ModItems.FACTORY_PLATING.get());
                        output.accept(ModItems.FACTORY_RUSTPLATES.get());
                        output.accept(ModItems.FACTORY_RUSTPLATES_CONNECTING.get());
                        output.accept(ModItems.FACTORY_COLUMN.get());
                        output.accept(ModItems.FACTORY_COLUMN_CONNECTING.get());
                        output.accept(ModItems.FACTORY_FRAMEBLUE.get());
                        output.accept(ModItems.FACTORY_FRAMEBLUE_CONNECTING.get());
                        output.accept(ModItems.FACTORY_ICEICEICE.get());
                        output.accept(ModItems.FACTORY_ICEICEICE_CONNECTING.get());
                        output.accept(ModItems.FACTORY_TILEMOSAIC.get());
                        output.accept(ModItems.FACTORY_TILEMOSAIC_CONNECTING.get());
                        output.accept(ModItems.FACTORY_VENT.get());
                        output.accept(ModItems.FACTORY_VENT_CONNECTING.get());
                        output.accept(ModItems.FACTORY_WIREFRAMEBLUE.get());
                        output.accept(ModItems.FACTORY_WIREFRAMEBLUE_CONNECTING.get());

                        // Futura blocks - non-connecting variants
                        output.accept(ModItems.FUTURA_SCREEN_GRAY.get());
                        output.accept(ModItems.FUTURA_SCREEN_CYAN.get());
                        output.accept(ModItems.FUTURA_CONTROLLER.get());
                        output.accept(ModItems.FUTURA_CONTROLLER_PURPLE.get());
                        output.accept(ModItems.FUTURA_RAINBOWLICIOUSLY_WAVY.get());
                        output.accept(ModItems.FUTURA_FABULOUSLY_WAVY.get());

                        // Futura blocks - connecting variants
                        output.accept(ModItems.FUTURA_SCREEN_GRAY_CONNECTING.get());
                        output.accept(ModItems.FUTURA_SCREEN_CYAN_CONNECTING.get());
                        output.accept(ModItems.FUTURA_CONTROLLER_CONNECTING.get());
                        output.accept(ModItems.FUTURA_CONTROLLER_PURPLE_CONNECTING.get());
                        output.accept(ModItems.FUTURA_FABULOUSLY_WAVY_CONNECTING.get());
                    })
                    .build());
}
