package net.apixelmelon.elementsmod.entity;

import net.apixelmelon.elementsmod.ElementsMod;
import net.apixelmelon.elementsmod.entity.custom.AirStaffProjectileEntity;
import net.apixelmelon.elementsmod.entity.custom.EarthStaffProjectileEntity;
import net.apixelmelon.elementsmod.entity.custom.FireStaffProjectileEntity;
import net.apixelmelon.elementsmod.entity.custom.WaterStaffProjectileEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ElementsMod.MOD_ID);

    // Staff Projectiles
    public static final RegistryObject<EntityType<AirStaffProjectileEntity>> AIR_STAFF_PROJECTILE =
            ENTITY_TYPES.register("air_staff_projectile",
                    () -> EntityType.Builder.<AirStaffProjectileEntity>of(AirStaffProjectileEntity::new, MobCategory.MISC)
                            .sized(0.5f, 0.5f)
                            .clientTrackingRange(4)
                            .updateInterval(20)
                            .build("air_staff_projectile"));
    public static final RegistryObject<EntityType<WaterStaffProjectileEntity>> WATER_STAFF_PROJECTILE =
            ENTITY_TYPES.register("water_staff_projectile",
                    () -> EntityType.Builder.<WaterStaffProjectileEntity>of(WaterStaffProjectileEntity::new, MobCategory.MISC)
                            .sized(0.5f, 0.5f)
                            .clientTrackingRange(4)
                            .updateInterval(20)
                            .build("water_staff_projectile"));
    public static final RegistryObject<EntityType<EarthStaffProjectileEntity>> EARTH_STAFF_PROJECTILE =
            ENTITY_TYPES.register("earth_staff_projectile",
                    () -> EntityType.Builder.<EarthStaffProjectileEntity>of(EarthStaffProjectileEntity::new, MobCategory.MISC)
                            .sized(0.5f, 0.5f)
                            .clientTrackingRange(4)
                            .updateInterval(20)
                            .build("earth_staff_projectile"));
    public static final RegistryObject<EntityType<FireStaffProjectileEntity>> FIRE_STAFF_PROJECTILE =
            ENTITY_TYPES.register("fire_staff_projectile",
                    () -> EntityType.Builder.<FireStaffProjectileEntity>of(FireStaffProjectileEntity::new, MobCategory.MISC)
                            .sized(0.5f, 0.5f)
                            .clientTrackingRange(4)
                            .updateInterval(20)
                            .build("fire_staff_projectile"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
