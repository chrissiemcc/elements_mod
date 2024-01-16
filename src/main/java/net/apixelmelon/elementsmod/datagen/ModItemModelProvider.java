package net.apixelmelon.elementsmod.datagen;

import net.apixelmelon.elementsmod.ElementsMod;
import net.apixelmelon.elementsmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ElementsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Orbs
        simpleItem(ModItems.DORMANT_ORB);
        simpleItem(ModItems.AIR_ORB);
        simpleItem(ModItems.WATER_ORB);
        simpleItem(ModItems.EARTH_ORB);
        simpleItem(ModItems.FIRE_ORB);

        // Staves
        simpleItem(ModItems.WOODEN_STAFF);
        simpleItem(ModItems.WOODEN_DORMANT_STAFF);
    }

    private void simpleItem(RegistryObject<Item> item) {
        this.withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ElementsMod.MOD_ID, "item/" + item.getId().getPath()));
    }// Generates item model
}
