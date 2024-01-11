package net.apixelmelon.elementsmod.datagen;

import net.apixelmelon.elementsmod.ElementsMod;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, ElementsMod.MOD_ID);
    }

    @Override
    protected void start() {

    }
}
