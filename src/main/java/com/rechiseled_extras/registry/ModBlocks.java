package com.rechiseled_extras.registry;

import com.rechiseled_extras.RechiseledExtras;
import com.rechiseled_extras.item.ConnectingBlockItem;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RechiseledExtras.MOD_ID);

    // Standard block properties for decorative blocks
    private static final BlockBehaviour.Properties DECORATIVE_BLOCK = BlockBehaviour.Properties.of()
            .strength(2.0f, 10.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE);

    // Valentines blocks
    public static final RegistryObject<Block> VALENTINES_PINK_MARKER = simpleBlock("valentines_pink_marker", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VALENTINES_GRAY_ROCKY = simpleBlock("valentines_gray_rocky", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VALENTINES_PINK_HEART = simpleBlock("valentines_pink_heart", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VALENTINES_PINK_ROCKY = simpleBlock("valentines_pink_rocky", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VALENTINES_PINK_TILE = simpleBlock("valentines_pink_tile", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VALENTINES_PINK_CRACKS = simpleBlock("valentines_pink_cracks", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VALENTINES_PINK_STUDDED = simpleBlock("valentines_pink_studded", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VALENTINES_FLAME = simpleBlock("valentines_flame", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VALENTINES_PINK_STEEL = simpleBlock("valentines_pink_steel", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VALENTINES_COMPANION = simpleBlock("valentines_companion", DECORATIVE_BLOCK);

    // Tyrian blocks
    public static final RegistryObject<Block> TYRIAN_DISORDERED_METAL_BITS = simpleBlock("tyrian_disordered_metal_bits", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> TYRIAN_METAL_PLATES = simpleBlock("tyrian_metal_plates", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> TYRIAN_DISORDERED_PURPLE_BITS = simpleBlock("tyrian_disordered_purple_bits", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> TYRIAN_PURPLE_PLATES = simpleBlock("tyrian_purple_plates", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> TYRIAN_RUST = simpleBlock("tyrian_rust", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> TYRIAN_SHINY_PLATES = simpleBlock("tyrian_shiny_plates", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> TYRIAN_ROUTES = simpleBlock("tyrian_routes", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> TYRIAN_PLATFORM = simpleBlock("tyrian_platform", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> TYRIAN_SMALL_UNEVEN_TILES = simpleBlock("tyrian_small_uneven_tiles", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> TYRIAN_DIAGONAL_PLATES = simpleBlock("tyrian_diagonal_plates", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> TYRIAN_DENT = simpleBlock("tyrian_dent", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> TYRIAN_BLUE_PLATES = simpleBlock("tyrian_blue_plates", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> TYRIAN_BLACK_SCALED_PLATES = simpleBlock("tyrian_black_scaled_plates", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> TYRIAN_BLACK_STRIPS = simpleBlock("tyrian_black_strips", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> TYRIAN_OPENING = simpleBlock("tyrian_opening", DECORATIVE_BLOCK);

    // Voidstone blocks - simple variants
    public static final RegistryObject<Block> VOIDSTONE_RAW = simpleBlock("voidstone_raw", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_MEDIUM_TILES = simpleBlock("voidstone_medium_tiles", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_PANEL = simpleBlock("voidstone_panel", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_SKULLS = simpleBlock("voidstone_skulls", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_RUNE = simpleBlock("voidstone_rune", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_EYE = simpleBlock("voidstone_eye", DECORATIVE_BLOCK);

    // Voidstone primal variants (same order as base blocks)
    public static final RegistryObject<Block> VOIDSTONE_PRIMAL_RAW = simpleBlock("voidstone_primal_raw", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_PRIMAL_MEDIUM_TILES = simpleBlock("voidstone_primal_medium_tiles", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_PRIMAL_PANEL = simpleBlock("voidstone_primal_panel", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_PRIMAL_SKULLS = simpleBlock("voidstone_primal_skulls", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_PRIMAL_RUNE = simpleBlock("voidstone_primal_rune", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_PRIMAL_EYE = simpleBlock("voidstone_primal_eye", DECORATIVE_BLOCK);

    // Voidstone rune variants (15 colors in correct order)
    public static final RegistryObject<Block> VOIDSTONE_RUNE_BLACK = simpleBlock("voidstone_runed_black", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_RUNE_RED = simpleBlock("voidstone_runed_red", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_RUNE_GREEN = simpleBlock("voidstone_runed_green", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_RUNE_BROWN = simpleBlock("voidstone_runed_brown", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_RUNE_BLUE = simpleBlock("voidstone_runed_blue", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_RUNE_PURPLE = simpleBlock("voidstone_runed_purple", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_RUNE_CYAN = simpleBlock("voidstone_runed_cyan", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_RUNE_LIGHTGRAY = simpleBlock("voidstone_runed_lightgray", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_RUNE_GRAY = simpleBlock("voidstone_runed_gray", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_RUNE_PINK = simpleBlock("voidstone_runed_pink", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_RUNE_LIME = simpleBlock("voidstone_runed_lime", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_RUNE_YELLOW = simpleBlock("voidstone_runed_yellow", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_RUNE_LIGHTBLUE = simpleBlock("voidstone_runed_lightblue", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_RUNE_MAGENTA = simpleBlock("voidstone_runed_magenta", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_RUNE_ORANGE = simpleBlock("voidstone_runed_orange", DECORATIVE_BLOCK);

    // Laboratory blocks - simple tile variants
    public static final RegistryObject<Block> LABORATORY_CHECKERED_TILES = simpleBlock("laboratory_checkered_tiles", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> LABORATORY_DARK_MEDIUM_TILES = simpleBlock("laboratory_dark_medium_tiles", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> LABORATORY_LARGE_TILES = simpleBlock("laboratory_large_tiles", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> LABORATORY_MEDIUM_TILES = simpleBlock("laboratory_medium_tiles", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> LABORATORY_LARGE_STEEL = simpleBlock("laboratory_large_steel", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> LABORATORY_SMALL_STEEL = simpleBlock("laboratory_small_steel", DECORATIVE_BLOCK);

    // Laboratory blocks - CTM variants
    public static final RegistryObject<Block> LABORATORY_SCREEN = connecting("laboratory_screen", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> LABORATORY_FUZZY_SCREEN = connecting("laboratory_fuzzy_screen", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> LABORATORY_TILE = connecting("laboratory_tile", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> LABORATORY_ROUNDEL = connecting("laboratory_roundel", DECORATIVE_BLOCK);

    // Laboratory blocks - directional CTM variants (horizontal/vertical)
    public static final RegistryObject<Block> LABORATORY_LEFT_FACED_ARROWS = connecting("laboratory_left_faced_arrows", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> LABORATORY_RIGHT_FACED_ARROWS = connecting("laboratory_right_faced_arrows", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> LABORATORY_DOTTED_PANEL = connecting("laboratory_dotted_panel", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> LABORATORY_DOTTED_PANEL_WALL_CONNECTING = BLOCKS.register("laboratory_dotted_panel_wall_connecting",
            () -> new Block(DECORATIVE_BLOCK));
    public static final RegistryObject<Block> LABORATORY_CONSOLE = connecting("laboratory_console", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> LABORATORY_WHITE_PANEL = connecting("laboratory_white_panel", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> LABORATORY_WHITE_PANEL_WALL_CONNECTING = BLOCKS.register("laboratory_white_panel_wall_connecting",
            () -> new Block(DECORATIVE_BLOCK));
    public static final RegistryObject<Block> LABORATORY_VENTS = connecting("laboratory_vents", DECORATIVE_BLOCK);

    // Voidstone blocks - CTM variants
    public static final RegistryObject<Block> VOIDSTONE_DENT = connecting("voidstone_dent", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_METALLIC = connecting("voidstone_metallic", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_PRIMAL_DENT = connecting("voidstone_primal_dent", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> VOIDSTONE_PRIMAL_METALLIC = connecting("voidstone_primal_metallic", DECORATIVE_BLOCK);

    // Tyrian blocks - CTM variants
    public static final RegistryObject<Block> TYRIAN_SHINY_PLATE = connecting("tyrian_shiny_plate", DECORATIVE_BLOCK);

    // Factory blocks - simple variants (non-connecting)
    public static final RegistryObject<Block> FACTORY_OLD_VENTS = simpleBlock("factory_old_vents", DECORATIVE_BLOCK);

    // Factory blocks - CTM variants (connecting)
    public static final RegistryObject<Block> FACTORY_DOTTED_RUSTY_PLATE = connecting("factory_dotted_rusty_plate", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_RUSTY_PLATE = connecting("factory_rusty_plate", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_VERY_RUSTY_PLATE = connecting("factory_very_rusty_plate", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_SLIGHTLY_RUSTY_PLATE = connecting("factory_slightly_rusty_plate", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_WIREFRAME = connecting("factory_wireframe", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_PURPLE_WIREFRAME = connecting("factory_purple_wireframe", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_YELLOW_BLACK_CAUTION_STRIPES = connecting("factory_yellow_black_caution_stripes", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_ORANGE_WHITE_CAUTION_STRIPES = connecting("factory_orange_white_caution_stripes", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_CIRCUIT = connecting("factory_circuit", DECORATIVE_BLOCK);
    // metal box (missing)
    public static final RegistryObject<Block> FACTORY_GOLD_PLATED_CIRCUIT = connecting("factory_gold_plated_circuit", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_GOLD_FRAMED_PURPLE_PLATES = connecting("factory_gold_framed_purple_plates", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_GRINDER = connecting("factory_grinder", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_SEGMENTED_RUSTY_PLATES = connecting("factory_segmented_rusty_plates", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_METAL_COLUMN = connecting("factory_metal_column", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_BLUE_FRAMED_CIRCUIT = connecting("factory_blue_framed_circuit", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_ICE_ICE_ICE = connecting("factory_ice_ice_ice", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_BLUE_CIRCUITS = connecting("factory_blue_circuits", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_VENTS = connecting("factory_vents", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_BLUE_WIREFRAME = connecting("factory_blue_wireframe", DECORATIVE_BLOCK);

    // Futura blocks - ME Controllers (composite animated blocks with CTM)
    public static final RegistryObject<Block> FUTURA_CONTROLLER = connecting("futura_controller", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FUTURA_CONTROLLER_PURPLE = connecting("futura_controller_purple", DECORATIVE_BLOCK);

    // Futura blocks - Screens (composite animated blocks with CTM)
    public static final RegistryObject<Block> FUTURA_SCREEN_CYAN = connecting("futura_screen_cyan", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FUTURA_SCREEN_GRAY = connecting("futura_screen_gray", DECORATIVE_BLOCK);

    // Futura blocks - Wavy (composite animated blocks)
    public static final RegistryObject<Block> FUTURA_RAINBOWLICIOUSLY_WAVY = simpleBlock("futura_rainbowliciously_wavy", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FUTURA_FABULOUSLY_WAVY = connecting("futura_fabulously_wavy", DECORATIVE_BLOCK);

    /**
     * Registers a simple block (no CTM)
     * Note: BlockItems must be registered separately in ModItems
     */
    private static RegistryObject<Block> simpleBlock(String name, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name, () -> new Block(properties));
    }

    /**
     * Registers a block with a connecting variant (for CTM)
     * Creates two blocks: regular and _connecting
     * Note: BlockItems must be registered separately in ModItems
     */
    private static RegistryObject<Block> connecting(String name, BlockBehaviour.Properties properties) {
        // Regular block
        RegistryObject<Block> block = BLOCKS.register(name, () -> new Block(properties));

        // Connecting variant (for CTM)
        BLOCKS.register(name + "_connecting", () -> new Block(properties));

        return block;
    }
}
