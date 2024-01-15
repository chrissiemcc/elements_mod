package net.apixelmelon.elementsmod.item;

import net.apixelmelon.elementsmod.ElementsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ElementsMod.MOD_ID);

    // Orbs
    public static final RegistryObject<Item> DORMANT_ORB = ITEMS.register("dormant_orb",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AIR_ORB = ITEMS.register("air_orb",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WATER_ORB = ITEMS.register("water_orb",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EARTH_ORB = ITEMS.register("earth_orb",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRE_ORB = ITEMS.register("fire_orb",
            () -> new Item(new Item.Properties()));

    // Staves
    public static final RegistryObject<Item> WOODEN_MAGIC_STAFF = ITEMS.register("wooden_magic_staff",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
