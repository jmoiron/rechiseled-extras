package com.rechiseledextras;

import com.rechiseledextras.registry.ModBlocks;
import com.rechiseledextras.registry.ModCreativeTabs;
import com.rechiseledextras.registry.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(RechiseledExtras.MOD_ID)
public class RechiseledExtras {
    public static final String MOD_ID = "rechiseled_extras";
    public static final Logger LOGGER = LogUtils.getLogger();

    public RechiseledExtras() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register deferred registers
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.CREATIVE_MODE_TABS.register(modEventBus);

        LOGGER.info("Rechiseled Extras is loading!");
    }
}
