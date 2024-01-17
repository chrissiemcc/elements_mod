package net.apixelmelon.elementsmod.event;

import net.apixelmelon.elementsmod.ElementsMod;
import net.apixelmelon.elementsmod.entity.client.StaffProjectileModel;
import net.apixelmelon.elementsmod.entity.layer.ModModelLayers;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ElementsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.STAFF_PROJECTILE_LAYER, StaffProjectileModel::createBodyLayer);
    }
}
