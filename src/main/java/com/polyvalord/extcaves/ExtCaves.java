package com.polyvalord.extcaves;

import com.polyvalord.extcaves.items.RegItems;
import com.polyvalord.extcaves.world.RegFeatures;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.polyvalord.extcaves.blocks.RegBlocks;
import com.polyvalord.extcaves.config.ConfigBuild;
import com.polyvalord.extcaves.world.GenFeatures;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExtCaves.MODID)
public class ExtCaves
{
    public static final String MODID = "extcaves";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public ExtCaves()
    {
    	// config file
    	ModLoadingContext.get().registerConfig(Type.SERVER, ConfigBuild.server_config);
    	ConfigBuild.loadConfig(ConfigBuild.server_config, FMLPaths.CONFIGDIR.get().resolve("extcaves_config.toml").toString());

        // Register the doClientStuff method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, GenFeatures::onBiomeLoad);

        // Deferred registries
        RegItems.ITEMS.register(eventBus);
        RegFeatures.FEATURES.register(eventBus);
    }
    
    // custom creative tab
    public static ItemGroup extcaves_tab = new ItemGroup(MODID)
    {
    	@Override
        public ItemStack createIcon()
        {
            return new ItemStack(RegBlocks.mushroom_goldishroom);
        }
    };

    private void doClientStuff(final FMLClientSetupEvent event) 
    {
        
        RenderTypeLookup.setRenderLayer(RegBlocks.mushroom_sweetshroom, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegBlocks.mushroom_goldishroom, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegBlocks.mushroom_shinyshroom, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegBlocks.mushroom_lumishroom, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegBlocks.mushroom_fluoshroom, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegBlocks.mushroom_rockshroom, RenderType.getCutout());
        
        RenderTypeLookup.setRenderLayer(RegBlocks.moss_dry, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegBlocks.moss_fire, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegBlocks.moss_frozen, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegBlocks.moss_hanging_roots, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegBlocks.moss_humid_ground, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegBlocks.moss_humid_ceiling, RenderType.getCutout());
        
        RenderTypeLookup.setRenderLayer(RegBlocks.cave_vine, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegBlocks.cave_vine_end, RenderType.getCutout());
        
    }
}
