package net.apixelmelon.elementsmod.item;

import net.apixelmelon.elementsmod.ElementsMod;
import net.apixelmelon.elementsmod.item.custom.staves.AirStaffItem;
import net.apixelmelon.elementsmod.item.custom.staves.EarthStaffItem;
import net.apixelmelon.elementsmod.item.custom.staves.FireStaffItem;
import net.apixelmelon.elementsmod.item.custom.staves.WaterStaffItem;
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
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WOODEN_AIR_STAFF = ITEMS.register("wooden_air_staff",
            () -> new AirStaffItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WOODEN_WATER_STAFF = ITEMS.register("wooden_water_staff",
            () -> new WaterStaffItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WOODEN_EARTH_STAFF = ITEMS.register("wooden_earth_staff",
            () -> new EarthStaffItem(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WOODEN_FIRE_STAFF = ITEMS.register("wooden_fire_staff",
            () -> new FireStaffItem(new Item.Properties().stacksTo(1)));

    // Runes
    public static final RegistryObject<Item> EMPTY_RUNE = ITEMS.register("empty_rune",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AIR_RUNE = ITEMS.register("air_rune",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WATER_RUNE = ITEMS.register("water_rune",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EARTH_RUNE = ITEMS.register("earth_rune",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIRE_RUNE = ITEMS.register("fire_rune",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
