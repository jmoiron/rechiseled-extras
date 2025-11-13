package com.rechiseled_extras.datagen;

import com.rechiseled_extras.RechiseledExtras;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, RechiseledExtras.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Block items are automatically handled by BlockStateProvider
        // This provider would be used for custom items, tools, etc.
        // Currently this mod only has blocks, so no custom item models needed
    }
}