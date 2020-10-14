package com.polyvalord.extcaves.world;

import com.polyvalord.extcaves.Ref;
import com.polyvalord.extcaves.world.features.FeatureCabin;
import com.polyvalord.extcaves.world.features.FeatureDungeon;
import com.polyvalord.extcaves.world.features.FeatureRandomPatch;

import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Ref.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Ref.MODID)
public class RegFeatures
{
	
	// features
	public static final Feature<BlockClusterFeatureConfig> patch_ground = null;
	public static final Feature<BlockClusterFeatureConfig> patch_ceiling = null;
	
	// structures
	public static final Feature<NoFeatureConfig> structure_cabin_oak = null;
	public static final Feature<NoFeatureConfig> structure_cabin_cobblestone = null;
	public static final Feature<NoFeatureConfig> structure_cabin_bricks = null;
	public static final Feature<NoFeatureConfig> structure_cabin_spruce = null;
	public static final Feature<NoFeatureConfig> structure_cabin_jungle = null;
	public static final Feature<NoFeatureConfig> structure_cabin_acacia = null;
	
	public static final Feature<NoFeatureConfig> structure_dungeon_cobblestone = null;
	public static final Feature<NoFeatureConfig> structure_dungeon_tall_cobblestone = null;
	public static final Feature<NoFeatureConfig> structure_dungeon_ice = null;
	public static final Feature<NoFeatureConfig> structure_dungeon_lavastone = null;
	public static final Feature<NoFeatureConfig> structure_dungeon_tall_lavastone = null;
	
	@SubscribeEvent
    public static void registerFeatures(RegistryEvent.Register<Feature<?>> event) 
    {
    	event.getRegistry().registerAll(
    			
    			// features
    			new FeatureRandomPatch(false, BlockClusterFeatureConfig.field_236587_a_).setRegistryName(Ref.MODID, "patch_ground"),
    			new FeatureRandomPatch(true, BlockClusterFeatureConfig.field_236587_a_).setRegistryName(Ref.MODID, "patch_ceiling"),
    			
    			// structures
    			new FeatureCabin(0, NoFeatureConfig.field_236558_a_).setRegistryName(Ref.MODID, "structure_cabin_oak"),
    			new FeatureCabin(1, NoFeatureConfig.field_236558_a_).setRegistryName(Ref.MODID, "structure_cabin_cobblestone"),
    			new FeatureCabin(2, NoFeatureConfig.field_236558_a_).setRegistryName(Ref.MODID, "structure_cabin_bricks"),
    			new FeatureCabin(3, NoFeatureConfig.field_236558_a_).setRegistryName(Ref.MODID, "structure_cabin_spruce"),
    			new FeatureCabin(4, NoFeatureConfig.field_236558_a_).setRegistryName(Ref.MODID, "structure_cabin_jungle"),
    			new FeatureCabin(5, NoFeatureConfig.field_236558_a_).setRegistryName(Ref.MODID, "structure_cabin_acacia"),
    			
    			new FeatureDungeon(0, 0, false, NoFeatureConfig.field_236558_a_).setRegistryName(Ref.MODID, "structure_dungeon_cobblestone"),
    			new FeatureDungeon(1, 0, true, NoFeatureConfig.field_236558_a_).setRegistryName(Ref.MODID, "structure_dungeon_tall_cobblestone"),
    			new FeatureDungeon(2, 1, false, NoFeatureConfig.field_236558_a_).setRegistryName(Ref.MODID, "structure_dungeon_ice"),
    			new FeatureDungeon(3, 2, false, NoFeatureConfig.field_236558_a_).setRegistryName(Ref.MODID, "structure_dungeon_lavastone"),
    			new FeatureDungeon(4, 2, true, NoFeatureConfig.field_236558_a_).setRegistryName(Ref.MODID, "structure_dungeon_tall_lavastone")
    			
    		);
    }

}
