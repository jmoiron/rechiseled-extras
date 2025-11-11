package com.rechiseledextras.registry;

import com.rechiseledextras.RechiseledExtras;
import com.rechiseledextras.item.ConnectingBlockItem;
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

    // Valentines blocks
    public static final RegistryObject<Block> VALENTINES_PINK_MARKER = BLOCKS.register("valentines_pink_marker",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VALENTINES_GRAY_ROCKY = BLOCKS.register("valentines_gray_rocky",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VALENTINES_PINK_HEART = BLOCKS.register("valentines_pink_heart",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VALENTINES_PINK_ROCKY = BLOCKS.register("valentines_pink_rocky",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VALENTINES_PINK_TILE = BLOCKS.register("valentines_pink_tile",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VALENTINES_PINK_CRACKS = BLOCKS.register("valentines_pink_cracks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VALENTINES_PINK_STUDDED = BLOCKS.register("valentines_pink_studded",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VALENTINES_FLAME = BLOCKS.register("valentines_flame",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VALENTINES_PINK_STEEL = BLOCKS.register("valentines_pink_steel",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VALENTINES_COMPANION = BLOCKS.register("valentines_companion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    // Tyrian blocks
    public static final RegistryObject<Block> TYRIAN_DISORDERED_METAL_BITS = BLOCKS.register("tyrian_disordered_metal_bits",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> TYRIAN_METAL_PLATES = BLOCKS.register("tyrian_metal_plates",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> TYRIAN_DISORDERED_PURPLE_BITS = BLOCKS.register("tyrian_disordered_purple_bits",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> TYRIAN_PURPLE_PLATES = BLOCKS.register("tyrian_purple_plates",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> TYRIAN_RUST = BLOCKS.register("tyrian_rust",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> TYRIAN_SHINY_PLATES = BLOCKS.register("tyrian_shiny_plates",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> TYRIAN_ROUTES = BLOCKS.register("tyrian_routes",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> TYRIAN_PLATFORM = BLOCKS.register("tyrian_platform",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> TYRIAN_SMALL_UNEVEN_TILES = BLOCKS.register("tyrian_small_uneven_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> TYRIAN_DIAGONAL_PLATES = BLOCKS.register("tyrian_diagonal_plates",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> TYRIAN_DENT = BLOCKS.register("tyrian_dent",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> TYRIAN_BLUE_PLATES = BLOCKS.register("tyrian_blue_plates",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> TYRIAN_BLACK_SCALED_PLATES = BLOCKS.register("tyrian_black_scaled_plates",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> TYRIAN_BLACK_STRIPS = BLOCKS.register("tyrian_black_strips",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> TYRIAN_OPENING = BLOCKS.register("tyrian_opening",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    // Voidstone blocks - simple variants
    public static final RegistryObject<Block> VOIDSTONE_RAW = BLOCKS.register("voidstone_raw",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_MEDIUM_TILES = BLOCKS.register("voidstone_medium_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_PANEL = BLOCKS.register("voidstone_panel",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_SKULLS = BLOCKS.register("voidstone_skulls",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_RUNE = BLOCKS.register("voidstone_rune",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_EYE = BLOCKS.register("voidstone_eye",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    // Voidstone primal variants (same order as base blocks)
    public static final RegistryObject<Block> VOIDSTONE_PRIMAL_RAW = BLOCKS.register("voidstone_primal_raw",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_PRIMAL_MEDIUM_TILES = BLOCKS.register("voidstone_primal_medium_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_PRIMAL_PANEL = BLOCKS.register("voidstone_primal_panel",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_PRIMAL_SKULLS = BLOCKS.register("voidstone_primal_skulls",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_PRIMAL_RUNE = BLOCKS.register("voidstone_primal_rune",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_PRIMAL_EYE = BLOCKS.register("voidstone_primal_eye",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    // Voidstone rune variants (15 colors in correct order)
    public static final RegistryObject<Block> VOIDSTONE_RUNE_BLACK = BLOCKS.register("voidstone_runed_black",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_RUNE_RED = BLOCKS.register("voidstone_runed_red",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_RUNE_GREEN = BLOCKS.register("voidstone_runed_green",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_RUNE_BROWN = BLOCKS.register("voidstone_runed_brown",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_RUNE_BLUE = BLOCKS.register("voidstone_runed_blue",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_RUNE_PURPLE = BLOCKS.register("voidstone_runed_purple",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_RUNE_CYAN = BLOCKS.register("voidstone_runed_cyan",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_RUNE_LIGHTGRAY = BLOCKS.register("voidstone_runed_lightgray",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_RUNE_GRAY = BLOCKS.register("voidstone_runed_gray",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_RUNE_PINK = BLOCKS.register("voidstone_runed_pink",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_RUNE_LIME = BLOCKS.register("voidstone_runed_lime",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_RUNE_YELLOW = BLOCKS.register("voidstone_runed_yellow",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_RUNE_LIGHTBLUE = BLOCKS.register("voidstone_runed_lightblue",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_RUNE_MAGENTA = BLOCKS.register("voidstone_runed_magenta",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> VOIDSTONE_RUNE_ORANGE = BLOCKS.register("voidstone_runed_orange",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    // Laboratory blocks - simple tile variants
    public static final RegistryObject<Block> LABORATORY_CHECKERED_TILES = BLOCKS.register("laboratory_checkered_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> LABORATORY_DARK_MEDIUM_TILES = BLOCKS.register("laboratory_dark_medium_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> LABORATORY_LARGE_TILES = BLOCKS.register("laboratory_large_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> LABORATORY_MEDIUM_TILES = BLOCKS.register("laboratory_medium_tiles",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> LABORATORY_LARGE_STEEL = BLOCKS.register("laboratory_large_steel",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    public static final RegistryObject<Block> LABORATORY_SMALL_STEEL = BLOCKS.register("laboratory_small_steel",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.0f, 10.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)));

    // Standard block properties for decorative blocks
    private static final BlockBehaviour.Properties DECORATIVE_BLOCK = BlockBehaviour.Properties.of()
            .strength(2.0f, 10.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE);

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

    // Factory blocks
    public static final RegistryObject<Block> FACTORY_CIRCUIT = connecting("factory_circuit", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_DOTS = connecting("factory_dots", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_FRAMEBLUE = connecting("factory_frameblue", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_GOLDPLATE = connecting("factory_goldplate", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_GOLDPLATING = connecting("factory_goldplating", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_GRINDER = connecting("factory_grinder", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_HAZARD = connecting("factory_hazard", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_HAZARDORANGE = connecting("factory_hazardorange", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_ICEICEICE = connecting("factory_iceiceice", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_PLATEX = connecting("factory_platex", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_PLATING = simpleBlock("factory_plating", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_RUST = connecting("factory_rust", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_RUST2 = connecting("factory_rust2", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_RUSTPLATES = connecting("factory_rustplates", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_TILEMOSAIC = connecting("factory_tilemosaic", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_WIREFRAME = connecting("factory_wireframe", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_WIREFRAMEBLUE = connecting("factory_wireframeblue", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_WIREFRAMEWHITE = connecting("factory_wireframewhite", DECORATIVE_BLOCK);

    // Factory blocks - vertical CTM variants
    public static final RegistryObject<Block> FACTORY_COLUMN = connecting("factory_column", DECORATIVE_BLOCK);
    public static final RegistryObject<Block> FACTORY_VENT = connecting("factory_vent", DECORATIVE_BLOCK);

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
