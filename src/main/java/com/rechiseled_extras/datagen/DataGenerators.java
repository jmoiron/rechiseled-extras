package com.rechiseled_extras.datagen;

import com.rechiseled_extras.RechiseledExtras;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = RechiseledExtras.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // Block Tags
        ModBlockTagProvider blockTags = new ModBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTags);

        // Item Tags (depends on block tags)
        generator.addProvider(event.includeServer(), new ModItemTagProvider(packOutput, lookupProvider, blockTags.contentsGetter(), existingFileHelper));

        // Loot Tables
        generator.addProvider(event.includeServer(), new ModLootTableProvider(packOutput));

        // Client-side data generation (commented out for now - requires textures to exist)
        // generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
        // generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
    }
}