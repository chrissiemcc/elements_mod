package net.apixelmelon.elementsmod;

import com.mojang.logging.LogUtils;
import net.apixelmelon.elementsmod.entity.ModEntities;
import net.apixelmelon.elementsmod.entity.client.AirStaffProjectileRenderer;
import net.apixelmelon.elementsmod.entity.client.EarthStaffProjectileRenderer;
import net.apixelmelon.elementsmod.entity.client.FireStaffProjectileRenderer;
import net.apixelmelon.elementsmod.entity.client.WaterStaffProjectileRenderer;
import net.apixelmelon.elementsmod.item.ModCreativeModeTabs;
import net.apixelmelon.elementsmod.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ElementsMod.MOD_ID)
public class ElementsMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "elementsmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public ElementsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModEntities.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // Staff Projectiles
            EntityRenderers.register(ModEntities.AIR_STAFF_PROJECTILE.get(), AirStaffProjectileRenderer::new);
            EntityRenderers.register(ModEntities.WATER_STAFF_PROJECTILE.get(), WaterStaffProjectileRenderer::new);
            EntityRenderers.register(ModEntities.EARTH_STAFF_PROJECTILE.get(), EarthStaffProjectileRenderer::new);
            EntityRenderers.register(ModEntities.FIRE_STAFF_PROJECTILE.get(), FireStaffProjectileRenderer::new);
        }
    }
}
