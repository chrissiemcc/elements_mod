package net.apixelmelon.elementsmod.item;

import net.apixelmelon.elementsmod.ElementsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    // Deals with the creative mode tabs
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ElementsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ELEMENTS_TAB = CREATIVE_MODE_TABS.register("elements_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AIR_ORB.get()))
                    .title(Component.translatable("creativetab.elements_tab"))
                    .displayItems(((pParameters, pOutput) -> {

                        // Orbs
                        pOutput.accept(ModItems.DORMANT_ORB.get());
                        pOutput.accept(ModItems.AIR_ORB.get());
                        pOutput.accept(ModItems.WATER_ORB.get());
                        pOutput.accept(ModItems.EARTH_ORB.get());
                        pOutput.accept(ModItems.FIRE_ORB.get());

                        // Staves
                        pOutput.accept(ModItems.WOODEN_MAGIC_STAFF.get());

                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
