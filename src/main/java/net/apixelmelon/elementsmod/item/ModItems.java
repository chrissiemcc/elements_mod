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
    public static final RegistryObject<Item> WOODEN_STAFF = ITEMS.register("wooden_staff",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_DORMANT_STAFF = ITEMS.register("wooden_dormant_staff",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_AIR_STAFF = ITEMS.register("wooden_air_staff",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_WATER_STAFF = ITEMS.register("wooden_water_staff",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_EARTH_STAFF = ITEMS.register("wooden_earth_staff",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_FIRE_STAFF = ITEMS.register("wooden_fire_staff",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
