package com.rechiseled_extras.registry;

import com.rechiseled_extras.RechiseledExtras;
import com.rechiseled_extras.item.ConnectingBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RechiseledExtras.MOD_ID);

    // Valentines block items
    public static final RegistryObject<Item> VALENTINES_PINK_MARKER = ITEMS.register("valentines_pink_marker",
            () -> new BlockItem(ModBlocks.VALENTINES_PINK_MARKER.get(), new Item.Properties()));

    public static final RegistryObject<Item> VALENTINES_GRAY_ROCKY = ITEMS.register("valentines_gray_rocky",
            () -> new BlockItem(ModBlocks.VALENTINES_GRAY_ROCKY.get(), new Item.Properties()));

    public static final RegistryObject<Item> VALENTINES_PINK_HEART = ITEMS.register("valentines_pink_heart",
            () -> new BlockItem(ModBlocks.VALENTINES_PINK_HEART.get(), new Item.Properties()));

    public static final RegistryObject<Item> VALENTINES_PINK_ROCKY = ITEMS.register("valentines_pink_rocky",
            () -> new BlockItem(ModBlocks.VALENTINES_PINK_ROCKY.get(), new Item.Properties()));

    public static final RegistryObject<Item> VALENTINES_PINK_TILE = ITEMS.register("valentines_pink_tile",
            () -> new BlockItem(ModBlocks.VALENTINES_PINK_TILE.get(), new Item.Properties()));

    public static final RegistryObject<Item> VALENTINES_PINK_CRACKS = ITEMS.register("valentines_pink_cracks",
            () -> new BlockItem(ModBlocks.VALENTINES_PINK_CRACKS.get(), new Item.Properties()));

    public static final RegistryObject<Item> VALENTINES_PINK_STUDDED = ITEMS.register("valentines_pink_studded",
            () -> new BlockItem(ModBlocks.VALENTINES_PINK_STUDDED.get(), new Item.Properties()));

    public static final RegistryObject<Item> VALENTINES_FLAME = ITEMS.register("valentines_flame",
            () -> new BlockItem(ModBlocks.VALENTINES_FLAME.get(), new Item.Properties()));

    public static final RegistryObject<Item> VALENTINES_PINK_STEEL = ITEMS.register("valentines_pink_steel",
            () -> new BlockItem(ModBlocks.VALENTINES_PINK_STEEL.get(), new Item.Properties()));

    public static final RegistryObject<Item> VALENTINES_COMPANION = ITEMS.register("valentines_companion",
            () -> new BlockItem(ModBlocks.VALENTINES_COMPANION.get(), new Item.Properties()));

    // Tyrian block items
    public static final RegistryObject<Item> TYRIAN_DISORDERED_METAL_BITS = ITEMS.register("tyrian_disordered_metal_bits",
            () -> new BlockItem(ModBlocks.TYRIAN_DISORDERED_METAL_BITS.get(), new Item.Properties()));

    public static final RegistryObject<Item> TYRIAN_METAL_PLATES = ITEMS.register("tyrian_metal_plates",
            () -> new BlockItem(ModBlocks.TYRIAN_METAL_PLATES.get(), new Item.Properties()));

    public static final RegistryObject<Item> TYRIAN_DISORDERED_PURPLE_BITS = ITEMS.register("tyrian_disordered_purple_bits",
            () -> new BlockItem(ModBlocks.TYRIAN_DISORDERED_PURPLE_BITS.get(), new Item.Properties()));

    public static final RegistryObject<Item> TYRIAN_PURPLE_PLATES = ITEMS.register("tyrian_purple_plates",
            () -> new BlockItem(ModBlocks.TYRIAN_PURPLE_PLATES.get(), new Item.Properties()));

    public static final RegistryObject<Item> TYRIAN_RUST = ITEMS.register("tyrian_rust",
            () -> new BlockItem(ModBlocks.TYRIAN_RUST.get(), new Item.Properties()));

    public static final RegistryObject<Item> TYRIAN_SHINY_PLATES = ITEMS.register("tyrian_shiny_plates",
            () -> new BlockItem(ModBlocks.TYRIAN_SHINY_PLATES.get(), new Item.Properties()));

    public static final RegistryObject<Item> TYRIAN_ROUTES = ITEMS.register("tyrian_routes",
            () -> new BlockItem(ModBlocks.TYRIAN_ROUTES.get(), new Item.Properties()));

    public static final RegistryObject<Item> TYRIAN_PLATFORM = ITEMS.register("tyrian_platform",
            () -> new BlockItem(ModBlocks.TYRIAN_PLATFORM.get(), new Item.Properties()));

    public static final RegistryObject<Item> TYRIAN_SMALL_UNEVEN_TILES = ITEMS.register("tyrian_small_uneven_tiles",
            () -> new BlockItem(ModBlocks.TYRIAN_SMALL_UNEVEN_TILES.get(), new Item.Properties()));

    public static final RegistryObject<Item> TYRIAN_DIAGONAL_PLATES = ITEMS.register("tyrian_diagonal_plates",
            () -> new BlockItem(ModBlocks.TYRIAN_DIAGONAL_PLATES.get(), new Item.Properties()));

    public static final RegistryObject<Item> TYRIAN_DENT = ITEMS.register("tyrian_dent",
            () -> new BlockItem(ModBlocks.TYRIAN_DENT.get(), new Item.Properties()));

    public static final RegistryObject<Item> TYRIAN_BLUE_PLATES = ITEMS.register("tyrian_blue_plates",
            () -> new BlockItem(ModBlocks.TYRIAN_BLUE_PLATES.get(), new Item.Properties()));

    public static final RegistryObject<Item> TYRIAN_BLACK_SCALED_PLATES = ITEMS.register("tyrian_black_scaled_plates",
            () -> new BlockItem(ModBlocks.TYRIAN_BLACK_SCALED_PLATES.get(), new Item.Properties()));

    public static final RegistryObject<Item> TYRIAN_BLACK_STRIPS = ITEMS.register("tyrian_black_strips",
            () -> new BlockItem(ModBlocks.TYRIAN_BLACK_STRIPS.get(), new Item.Properties()));

    public static final RegistryObject<Item> TYRIAN_OPENING = ITEMS.register("tyrian_opening",
            () -> new BlockItem(ModBlocks.TYRIAN_OPENING.get(), new Item.Properties()));

    // Tyrian block items - CTM variants (regular)
    public static final RegistryObject<Item> TYRIAN_SHINY_PLATE = ITEMS.register("tyrian_shiny_plate",
            () -> new BlockItem(ModBlocks.TYRIAN_SHINY_PLATE.get(), new Item.Properties()));

    // Tyrian block items - CTM variants (connecting)
    public static final RegistryObject<Item> TYRIAN_SHINY_PLATE_CONNECTING = ITEMS.register("tyrian_shiny_plate_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("tyrian_shiny_plate_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    // Voidstone block items - simple variants (reordered)
    public static final RegistryObject<Item> VOIDSTONE_RAW = ITEMS.register("voidstone_raw",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RAW.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_MEDIUM_TILES = ITEMS.register("voidstone_medium_tiles",
            () -> new BlockItem(ModBlocks.VOIDSTONE_MEDIUM_TILES.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_PANEL = ITEMS.register("voidstone_panel",
            () -> new BlockItem(ModBlocks.VOIDSTONE_PANEL.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_SKULLS = ITEMS.register("voidstone_skulls",
            () -> new BlockItem(ModBlocks.VOIDSTONE_SKULLS.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_RUNE = ITEMS.register("voidstone_rune",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RUNE.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_EYE = ITEMS.register("voidstone_eye",
            () -> new BlockItem(ModBlocks.VOIDSTONE_EYE.get(), new Item.Properties()));

    // Voidstone primal variants (same order as base blocks)
    public static final RegistryObject<Item> VOIDSTONE_PRIMAL_RAW = ITEMS.register("voidstone_primal_raw",
            () -> new BlockItem(ModBlocks.VOIDSTONE_PRIMAL_RAW.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_PRIMAL_MEDIUM_TILES = ITEMS.register("voidstone_primal_medium_tiles",
            () -> new BlockItem(ModBlocks.VOIDSTONE_PRIMAL_MEDIUM_TILES.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_PRIMAL_PANEL = ITEMS.register("voidstone_primal_panel",
            () -> new BlockItem(ModBlocks.VOIDSTONE_PRIMAL_PANEL.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_PRIMAL_SKULLS = ITEMS.register("voidstone_primal_skulls",
            () -> new BlockItem(ModBlocks.VOIDSTONE_PRIMAL_SKULLS.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_PRIMAL_RUNE = ITEMS.register("voidstone_primal_rune",
            () -> new BlockItem(ModBlocks.VOIDSTONE_PRIMAL_RUNE.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_PRIMAL_EYE = ITEMS.register("voidstone_primal_eye",
            () -> new BlockItem(ModBlocks.VOIDSTONE_PRIMAL_EYE.get(), new Item.Properties()));

    // Voidstone rune variants (reordered to match dye colors)
    public static final RegistryObject<Item> VOIDSTONE_RUNE_BLACK = ITEMS.register("voidstone_runed_black",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RUNE_BLACK.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_RUNE_RED = ITEMS.register("voidstone_runed_red",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RUNE_RED.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_RUNE_GREEN = ITEMS.register("voidstone_runed_green",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RUNE_GREEN.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_RUNE_BROWN = ITEMS.register("voidstone_runed_brown",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RUNE_BROWN.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_RUNE_BLUE = ITEMS.register("voidstone_runed_blue",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RUNE_BLUE.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_RUNE_PURPLE = ITEMS.register("voidstone_runed_purple",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RUNE_PURPLE.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_RUNE_CYAN = ITEMS.register("voidstone_runed_cyan",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RUNE_CYAN.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_RUNE_LIGHTGRAY = ITEMS.register("voidstone_runed_lightgray",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RUNE_LIGHTGRAY.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_RUNE_GRAY = ITEMS.register("voidstone_runed_gray",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RUNE_GRAY.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_RUNE_PINK = ITEMS.register("voidstone_runed_pink",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RUNE_PINK.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_RUNE_LIME = ITEMS.register("voidstone_runed_lime",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RUNE_LIME.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_RUNE_YELLOW = ITEMS.register("voidstone_runed_yellow",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RUNE_YELLOW.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_RUNE_LIGHTBLUE = ITEMS.register("voidstone_runed_lightblue",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RUNE_LIGHTBLUE.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_RUNE_MAGENTA = ITEMS.register("voidstone_runed_magenta",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RUNE_MAGENTA.get(), new Item.Properties()));

    public static final RegistryObject<Item> VOIDSTONE_RUNE_ORANGE = ITEMS.register("voidstone_runed_orange",
            () -> new BlockItem(ModBlocks.VOIDSTONE_RUNE_ORANGE.get(), new Item.Properties()));

    // Voidstone block items - CTM variants (regular)
    public static final RegistryObject<Item> VOIDSTONE_DENT = ITEMS.register("voidstone_dent",
            () -> new BlockItem(ModBlocks.VOIDSTONE_DENT.get(), new Item.Properties()));
    public static final RegistryObject<Item> VOIDSTONE_METALLIC = ITEMS.register("voidstone_metallic",
            () -> new BlockItem(ModBlocks.VOIDSTONE_METALLIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> VOIDSTONE_PRIMAL_DENT = ITEMS.register("voidstone_primal_dent",
            () -> new BlockItem(ModBlocks.VOIDSTONE_PRIMAL_DENT.get(), new Item.Properties()));
    public static final RegistryObject<Item> VOIDSTONE_PRIMAL_METALLIC = ITEMS.register("voidstone_primal_metallic",
            () -> new BlockItem(ModBlocks.VOIDSTONE_PRIMAL_METALLIC.get(), new Item.Properties()));

    // Voidstone block items - CTM variants (connecting)
    public static final RegistryObject<Item> VOIDSTONE_DENT_CONNECTING = ITEMS.register("voidstone_dent_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("voidstone_dent_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> VOIDSTONE_METALLIC_CONNECTING = ITEMS.register("voidstone_metallic_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("voidstone_metallic_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> VOIDSTONE_PRIMAL_DENT_CONNECTING = ITEMS.register("voidstone_primal_dent_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("voidstone_primal_dent_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> VOIDSTONE_PRIMAL_METALLIC_CONNECTING = ITEMS.register("voidstone_primal_metallic_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("voidstone_primal_metallic_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    // Laboratory block items - simple tile variants
    public static final RegistryObject<Item> LABORATORY_CHECKERED_TILES = ITEMS.register("laboratory_checkered_tiles",
            () -> new BlockItem(ModBlocks.LABORATORY_CHECKERED_TILES.get(), new Item.Properties()));

    public static final RegistryObject<Item> LABORATORY_DARK_MEDIUM_TILES = ITEMS.register("laboratory_dark_medium_tiles",
            () -> new BlockItem(ModBlocks.LABORATORY_DARK_MEDIUM_TILES.get(), new Item.Properties()));

    public static final RegistryObject<Item> LABORATORY_LARGE_TILES = ITEMS.register("laboratory_large_tiles",
            () -> new BlockItem(ModBlocks.LABORATORY_LARGE_TILES.get(), new Item.Properties()));

    public static final RegistryObject<Item> LABORATORY_MEDIUM_TILES = ITEMS.register("laboratory_medium_tiles",
            () -> new BlockItem(ModBlocks.LABORATORY_MEDIUM_TILES.get(), new Item.Properties()));

    public static final RegistryObject<Item> LABORATORY_LARGE_STEEL = ITEMS.register("laboratory_large_steel",
            () -> new BlockItem(ModBlocks.LABORATORY_LARGE_STEEL.get(), new Item.Properties()));

    public static final RegistryObject<Item> LABORATORY_SMALL_STEEL = ITEMS.register("laboratory_small_steel",
            () -> new BlockItem(ModBlocks.LABORATORY_SMALL_STEEL.get(), new Item.Properties()));

    // Laboratory block items - CTM variants (regular)
    public static final RegistryObject<Item> LABORATORY_SCREEN = ITEMS.register("laboratory_screen",
            () -> new BlockItem(ModBlocks.LABORATORY_SCREEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_FUZZY_SCREEN = ITEMS.register("laboratory_fuzzy_screen",
            () -> new BlockItem(ModBlocks.LABORATORY_FUZZY_SCREEN.get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_TILE = ITEMS.register("laboratory_tile",
            () -> new BlockItem(ModBlocks.LABORATORY_TILE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_ROUNDEL = ITEMS.register("laboratory_roundel",
            () -> new BlockItem(ModBlocks.LABORATORY_ROUNDEL.get(), new Item.Properties()));

    // Laboratory block items - CTM variants (connecting)
    public static final RegistryObject<Item> LABORATORY_SCREEN_CONNECTING = ITEMS.register("laboratory_screen_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("laboratory_screen_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_FUZZY_SCREEN_CONNECTING = ITEMS.register("laboratory_fuzzy_screen_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("laboratory_fuzzy_screen_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_TILE_CONNECTING = ITEMS.register("laboratory_tile_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("laboratory_tile_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_ROUNDEL_CONNECTING = ITEMS.register("laboratory_roundel_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("laboratory_roundel_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    // Laboratory block items - directional CTM variants (regular)
    public static final RegistryObject<Item> LABORATORY_LEFT_FACED_ARROWS = ITEMS.register("laboratory_left_faced_arrows",
            () -> new BlockItem(ModBlocks.LABORATORY_LEFT_FACED_ARROWS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_RIGHT_FACED_ARROWS = ITEMS.register("laboratory_right_faced_arrows",
            () -> new BlockItem(ModBlocks.LABORATORY_RIGHT_FACED_ARROWS.get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_DOTTED_PANEL = ITEMS.register("laboratory_dotted_panel",
            () -> new BlockItem(ModBlocks.LABORATORY_DOTTED_PANEL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_CONSOLE = ITEMS.register("laboratory_console",
            () -> new BlockItem(ModBlocks.LABORATORY_CONSOLE.get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_WHITE_PANEL = ITEMS.register("laboratory_white_panel",
            () -> new BlockItem(ModBlocks.LABORATORY_WHITE_PANEL.get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_VENTS = ITEMS.register("laboratory_vents",
            () -> new BlockItem(ModBlocks.LABORATORY_VENTS.get(), new Item.Properties()));

    // Laboratory block items - directional CTM variants (connecting)
    public static final RegistryObject<Item> LABORATORY_LEFT_FACED_ARROWS_CONNECTING = ITEMS.register("laboratory_left_faced_arrows_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("laboratory_left_faced_arrows_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_RIGHT_FACED_ARROWS_CONNECTING = ITEMS.register("laboratory_right_faced_arrows_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("laboratory_right_faced_arrows_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_DOTTED_PANEL_CONNECTING = ITEMS.register("laboratory_dotted_panel_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("laboratory_dotted_panel_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_DOTTED_PANEL_WALL_CONNECTING = ITEMS.register("laboratory_dotted_panel_wall_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("laboratory_dotted_panel_wall_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_CONSOLE_CONNECTING = ITEMS.register("laboratory_console_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("laboratory_console_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_WHITE_PANEL_CONNECTING = ITEMS.register("laboratory_white_panel_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("laboratory_white_panel_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_WHITE_PANEL_WALL_CONNECTING = ITEMS.register("laboratory_white_panel_wall_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("laboratory_white_panel_wall_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> LABORATORY_VENTS_CONNECTING = ITEMS.register("laboratory_vents_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("laboratory_vents_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    // Factory block items - ordered according to GAMEBUGS.md specification
    public static final RegistryObject<Item> FACTORY_DOTS = ITEMS.register("factory_dots",
            () -> new BlockItem(ModBlocks.FACTORY_DOTTED_RUSTY_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_DOTS_CONNECTING = ITEMS.register("factory_dots_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_dotted_rusty_plate_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_RUST2 = ITEMS.register("factory_rust2",
            () -> new BlockItem(ModBlocks.FACTORY_RUSTY_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_RUST2_CONNECTING = ITEMS.register("factory_rust2_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_rusty_plate_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_RUST = ITEMS.register("factory_rust",
            () -> new BlockItem(ModBlocks.FACTORY_VERY_RUSTY_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_RUST_CONNECTING = ITEMS.register("factory_rust_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_very_rusty_plate_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_PLATEX = ITEMS.register("factory_platex",
            () -> new BlockItem(ModBlocks.FACTORY_SLIGHTLY_RUSTY_PLATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_PLATEX_CONNECTING = ITEMS.register("factory_platex_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_slightly_rusty_plate_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_WIREFRAMEWHITE = ITEMS.register("factory_wireframewhite",
            () -> new BlockItem(ModBlocks.FACTORY_WIREFRAME.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_WIREFRAMEWHITE_CONNECTING = ITEMS.register("factory_wireframewhite_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_wireframe_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_WIREFRAME = ITEMS.register("factory_wireframe",
            () -> new BlockItem(ModBlocks.FACTORY_PURPLE_WIREFRAME.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_WIREFRAME_CONNECTING = ITEMS.register("factory_wireframe_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_purple_wireframe_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_HAZARD = ITEMS.register("factory_hazard",
            () -> new BlockItem(ModBlocks.FACTORY_YELLOW_BLACK_CAUTION_STRIPES.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_HAZARD_CONNECTING = ITEMS.register("factory_hazard_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_yellow_black_caution_stripes_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_HAZARDORANGE = ITEMS.register("factory_hazardorange",
            () -> new BlockItem(ModBlocks.FACTORY_ORANGE_WHITE_CAUTION_STRIPES.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_HAZARDORANGE_CONNECTING = ITEMS.register("factory_hazardorange_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_orange_white_caution_stripes_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_CIRCUIT = ITEMS.register("factory_circuit",
            () -> new BlockItem(ModBlocks.FACTORY_CIRCUIT.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_CIRCUIT_CONNECTING = ITEMS.register("factory_circuit_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_circuit_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    // metal box (missing)

    public static final RegistryObject<Item> FACTORY_GOLDPLATE = ITEMS.register("factory_goldplate",
            () -> new BlockItem(ModBlocks.FACTORY_GOLD_PLATED_CIRCUIT.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_GOLDPLATE_CONNECTING = ITEMS.register("factory_goldplate_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_gold_plated_circuit_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_GOLDPLATING = ITEMS.register("factory_goldplating",
            () -> new BlockItem(ModBlocks.FACTORY_GOLD_FRAMED_PURPLE_PLATES.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_GOLDPLATING_CONNECTING = ITEMS.register("factory_goldplating_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_gold_framed_purple_plates_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_GRINDER = ITEMS.register("factory_grinder",
            () -> new BlockItem(ModBlocks.FACTORY_GRINDER.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_GRINDER_CONNECTING = ITEMS.register("factory_grinder_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_grinder_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_PLATING = ITEMS.register("factory_plating",
            () -> new BlockItem(ModBlocks.FACTORY_OLD_VENTS.get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_RUSTPLATES = ITEMS.register("factory_rustplates",
            () -> new BlockItem(ModBlocks.FACTORY_SEGMENTED_RUSTY_PLATES.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_RUSTPLATES_CONNECTING = ITEMS.register("factory_rustplates_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_segmented_rusty_plates_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_COLUMN = ITEMS.register("factory_column",
            () -> new BlockItem(ModBlocks.FACTORY_METAL_COLUMN.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_COLUMN_CONNECTING = ITEMS.register("factory_column_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_metal_column_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_FRAMEBLUE = ITEMS.register("factory_frameblue",
            () -> new BlockItem(ModBlocks.FACTORY_BLUE_FRAMED_CIRCUIT.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_FRAMEBLUE_CONNECTING = ITEMS.register("factory_frameblue_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_blue_framed_circuit_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_ICEICEICE = ITEMS.register("factory_iceiceice",
            () -> new BlockItem(ModBlocks.FACTORY_ICE_ICE_ICE.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_ICEICEICE_CONNECTING = ITEMS.register("factory_iceiceice_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_ice_ice_ice_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_TILEMOSAIC = ITEMS.register("factory_tilemosaic",
            () -> new BlockItem(ModBlocks.FACTORY_BLUE_CIRCUITS.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_TILEMOSAIC_CONNECTING = ITEMS.register("factory_tilemosaic_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_blue_circuits_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_VENT = ITEMS.register("factory_vent",
            () -> new BlockItem(ModBlocks.FACTORY_VENTS.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_VENT_CONNECTING = ITEMS.register("factory_vent_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_vents_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    public static final RegistryObject<Item> FACTORY_BLUE_WIREFRAME = ITEMS.register("factory_blue_wireframe",
            () -> new BlockItem(ModBlocks.FACTORY_BLUE_WIREFRAME.get(), new Item.Properties()));
    public static final RegistryObject<Item> FACTORY_BLUE_WIREFRAME_CONNECTING = ITEMS.register("factory_blue_wireframe_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("factory_blue_wireframe_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    // Futura block items - ME Controllers (regular)
    public static final RegistryObject<Item> FUTURA_CONTROLLER = ITEMS.register("futura_controller",
            () -> new BlockItem(ModBlocks.FUTURA_CONTROLLER.get(), new Item.Properties()));
    public static final RegistryObject<Item> FUTURA_CONTROLLER_PURPLE = ITEMS.register("futura_controller_purple",
            () -> new BlockItem(ModBlocks.FUTURA_CONTROLLER_PURPLE.get(), new Item.Properties()));

    // Futura block items - ME Controllers (connecting)
    public static final RegistryObject<Item> FUTURA_CONTROLLER_CONNECTING = ITEMS.register("futura_controller_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("futura_controller_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> FUTURA_CONTROLLER_PURPLE_CONNECTING = ITEMS.register("futura_controller_purple_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("futura_controller_purple_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    // Futura block items - Screens (regular)
    public static final RegistryObject<Item> FUTURA_SCREEN_CYAN = ITEMS.register("futura_screen_cyan",
            () -> new BlockItem(ModBlocks.FUTURA_SCREEN_CYAN.get(), new Item.Properties()));
    public static final RegistryObject<Item> FUTURA_SCREEN_GRAY = ITEMS.register("futura_screen_gray",
            () -> new BlockItem(ModBlocks.FUTURA_SCREEN_GRAY.get(), new Item.Properties()));

    // Futura block items - Screens (connecting)
    public static final RegistryObject<Item> FUTURA_SCREEN_CYAN_CONNECTING = ITEMS.register("futura_screen_cyan_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("futura_screen_cyan_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> FUTURA_SCREEN_GRAY_CONNECTING = ITEMS.register("futura_screen_gray_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("futura_screen_gray_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    // Futura block items - Wavy
    public static final RegistryObject<Item> FUTURA_RAINBOWLICIOUSLY_WAVY = ITEMS.register("futura_rainbowliciously_wavy",
            () -> new BlockItem(ModBlocks.FUTURA_RAINBOWLICIOUSLY_WAVY.get(), new Item.Properties()));
    public static final RegistryObject<Item> FUTURA_FABULOUSLY_WAVY = ITEMS.register("futura_fabulously_wavy",
            () -> new BlockItem(ModBlocks.FUTURA_FABULOUSLY_WAVY.get(), new Item.Properties()));
    public static final RegistryObject<Item> FUTURA_FABULOUSLY_WAVY_CONNECTING = ITEMS.register("futura_fabulously_wavy_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("futura_fabulously_wavy_connecting"))
                    .findFirst().get().get(), new Item.Properties()));

    // Technical (factory/technical) - block items in GAMEBUGS order
    public static final RegistryObject<Item> TECHNICAL_RUSTY_SCAFFOLD = ITEMS.register("technical_rusty_scaffold",
            () -> new BlockItem(ModBlocks.TECHNICAL_RUSTY_SCAFFOLD.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_RUSTY_SCAFFOLD_CONNECTING = ITEMS.register("technical_rusty_scaffold_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("technical_rusty_scaffold_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_CAUTION_FRAMED_PLATES = ITEMS.register("technical_caution_framed_plates",
            () -> new BlockItem(ModBlocks.TECHNICAL_CAUTION_FRAMED_PLATES.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_CAUTION_FRAMED_PLATES_CONNECTING = ITEMS.register("technical_caution_framed_plates_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("technical_caution_framed_plates_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_INDUSTRIAL_RELIC = ITEMS.register("technical_industrial_relic",
            () -> new BlockItem(ModBlocks.TECHNICAL_INDUSTRIAL_RELIC.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_LARGE_PIPES = ITEMS.register("technical_large_pipes",
            () -> new BlockItem(ModBlocks.TECHNICAL_LARGE_PIPES.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_LARGE_PIPES_CONNECTING = ITEMS.register("technical_large_pipes_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("technical_large_pipes_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_SMALL_PIPES = ITEMS.register("technical_small_pipes",
            () -> new BlockItem(ModBlocks.TECHNICAL_SMALL_PIPES.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_SMALL_PIPES_CONNECTING = ITEMS.register("technical_small_pipes_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("technical_small_pipes_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_FAN_FAST = ITEMS.register("technical_fan_fast",
            () -> new BlockItem(ModBlocks.TECHNICAL_FAN_FAST.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_FAN_STILL = ITEMS.register("technical_fan_still",
            () -> new BlockItem(ModBlocks.TECHNICAL_FAN_STILL.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_VENT = ITEMS.register("technical_vent",
            () -> new BlockItem(ModBlocks.TECHNICAL_VENT.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_VENT_CONNECTING = ITEMS.register("technical_vent_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("technical_vent_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_GLOWING_VENT = ITEMS.register("technical_glowing_vent",
            () -> new BlockItem(ModBlocks.TECHNICAL_GLOWING_VENT.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_GLOWING_VENT_CONNECTING = ITEMS.register("technical_glowing_vent_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("technical_glowing_vent_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_INSULATION = ITEMS.register("technical_insulation",
            () -> new BlockItem(ModBlocks.TECHNICAL_INSULATION.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_INSULATION_CONNECTING = ITEMS.register("technical_insulation_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("technical_insulation_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_CABLES = ITEMS.register("technical_cables",
            () -> new BlockItem(ModBlocks.TECHNICAL_CABLES.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_CABLES_CONNECTING = ITEMS.register("technical_cables_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("technical_cables_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_GEARS_AND_FLYWHEELS = ITEMS.register("technical_gears_and_flywheels",
            () -> new BlockItem(ModBlocks.TECHNICAL_GEARS_AND_FLYWHEELS.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_GEARS_AND_FLYWHEELS_CONNECTING = ITEMS.register("technical_gears_and_flywheels_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("technical_gears_and_flywheels_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_RUSTY_BOLTED_PLATES = ITEMS.register("technical_rusty_bolted_plates",
            () -> new BlockItem(ModBlocks.TECHNICAL_RUSTY_BOLTED_PLATES.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_RUSTY_SCAFFOLD_TRANSPARENT = ITEMS.register("technical_rusty_scaffold_transparent",
            () -> new BlockItem(ModBlocks.TECHNICAL_RUSTY_SCAFFOLD_TRANSPARENT.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_RUSTY_SCAFFOLD_TRANSPARENT_CONNECTING = ITEMS.register("technical_rusty_scaffold_transparent_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("technical_rusty_scaffold_transparent_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_FAN_FAST_TRANSPARENT = ITEMS.register("technical_fan_fast_transparent",
            () -> new BlockItem(ModBlocks.TECHNICAL_FAN_FAST_TRANSPARENT.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_FAN_STILL_TRANSPARENT = ITEMS.register("technical_fan_still_transparent",
            () -> new BlockItem(ModBlocks.TECHNICAL_FAN_STILL_TRANSPARENT.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_GRATE = ITEMS.register("technical_grate",
            () -> new BlockItem(ModBlocks.TECHNICAL_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_GRATE_CONNECTING = ITEMS.register("technical_grate_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("technical_grate_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_RUSTY_GRATE = ITEMS.register("technical_rusty_grate",
            () -> new BlockItem(ModBlocks.TECHNICAL_RUSTY_GRATE.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_RUSTY_GRATE_CONNECTING = ITEMS.register("technical_rusty_grate_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("technical_rusty_grate_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_STURDY = ITEMS.register("technical_sturdy",
            () -> new BlockItem(ModBlocks.TECHNICAL_STURDY.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_STURDY_CONNECTING = ITEMS.register("technical_sturdy_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("technical_sturdy_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_EXHAUST_PLATING = ITEMS.register("technical_exhaust_plating",
            () -> new BlockItem(ModBlocks.TECHNICAL_EXHAUST_PLATING.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_EXHAUST_PLATING_CONNECTING = ITEMS.register("technical_exhaust_plating_connecting",
            () -> new ConnectingBlockItem(ModBlocks.BLOCKS.getEntries().stream()
                    .filter(e -> e.getId().getPath().equals("technical_exhaust_plating_connecting"))
                    .findFirst().get().get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_FAN_MALFUNCTIONING = ITEMS.register("technical_fan_malfunctioning",
            () -> new BlockItem(ModBlocks.TECHNICAL_FAN_MALFUNCTIONING.get(), new Item.Properties()));
    // Additional simple technical items
    public static final RegistryObject<Item> TECHNICAL_WIRES = ITEMS.register("technical_wires",
            () -> new BlockItem(ModBlocks.TECHNICAL_WIRES.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_OLD = ITEMS.register("technical_old",
            () -> new BlockItem(ModBlocks.TECHNICAL_OLD.get(), new Item.Properties()));
    public static final RegistryObject<Item> TECHNICAL_MEGACELL = ITEMS.register("technical_megacell",
            () -> new BlockItem(ModBlocks.TECHNICAL_MEGACELL.get(), new Item.Properties()));
}
