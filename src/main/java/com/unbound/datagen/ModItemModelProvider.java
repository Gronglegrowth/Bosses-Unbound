package com.unbound.datagen;

import com.unbound.bossesunbound;
import com.unbound.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, bossesunbound.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheldItem(ModItems.KINGS_MACE);
        handheldItem(ModItems.GOBLIN_HATCHET);
        handheldItem(ModItems.GOBLIN_DAGGER);
        basicItem(ModItems.GOBLIN_SPAWN_EGG.asItem());
        basicItem(ModItems.GOBLIN_KING_SPAWN_EGG.asItem());
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(bossesunbound.MODID,"item/" + item.getId().getPath()));
    }
}