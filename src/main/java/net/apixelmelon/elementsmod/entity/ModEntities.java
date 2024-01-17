package net.apixelmelon.elementsmod.entity;

import net.apixelmelon.elementsmod.ElementsMod;
import net.apixelmelon.elementsmod.entity.custom.StaffProjectileEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ElementsMod.MOD_ID);

    public static final RegistryObject<EntityType<StaffProjectileEntity>> STAFF_PROJECTILE =
            ENTITY_TYPES.register("staff_projectile",
                    () -> EntityType.Builder.<StaffProjectileEntity>of(StaffProjectileEntity::new, MobCategory.MISC)
                            .sized(0.5f, 0.5f)
                            .clientTrackingRange(4)
                            .updateInterval(20)
                            .build("staff_projectile"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
