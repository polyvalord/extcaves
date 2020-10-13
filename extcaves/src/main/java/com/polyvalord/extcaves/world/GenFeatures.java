package com.polyvalord.extcaves.world;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.polyvalord.extcaves.blocks.RegBlocks;
import com.polyvalord.extcaves.config.Config;
import com.polyvalord.extcaves.world.placers.PlacerDoubleCeiling;
import com.polyvalord.extcaves.world.placers.PlacerDoubleGround;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class GenFeatures 
{

	/**
	 * placements
	 */
	
	// structures
	
	// dungeons
	
	private static final int dungeon_cobblestone_chance = 1 + (10 - Config.spawnrate_structure_dungeons_cobblestone.get());
	private static final ChanceConfig placement_dungeon_cobblestone = new ChanceConfig(dungeon_cobblestone_chance);
	private static final int dungeon_tall_cobblestone_chance = 1 + (10 - Config.spawnrate_structure_dungeons_tall_cobblestone.get());
	private static final ChanceConfig placement_dungeon_tall_cobblestone = new ChanceConfig(dungeon_tall_cobblestone_chance);
	private static final int dungeon_ice_chance = 1 + (10 - Config.spawnrate_structure_dungeons_ice.get());
	private static final ChanceConfig placement_dungeon_ice = new ChanceConfig(dungeon_ice_chance);
	private static final int dungeon_lavastone_chance = 1 + (10 - Config.spawnrate_structure_dungeons_lavastone.get());
	private static final ChanceConfig placement_dungeon_lavastone = new ChanceConfig(dungeon_lavastone_chance);
	private static final int dungeon_tall_lavastone_chance = 1 + (10 - Config.spawnrate_structure_dungeons_tall_lavastone.get());
	private static final ChanceConfig placement_dungeon_tall_lavastone = new ChanceConfig(dungeon_tall_lavastone_chance);
	
	// cabins
	
	private static final int cabin_oak_chance = 1 + (10 - Config.spawnrate_structure_cabins_oak.get());
	private static final ChanceConfig placement_cabin_oak = new ChanceConfig(cabin_oak_chance);
	private static final int cabin_cobblestone_chance = 1 + (10 - Config.spawnrate_structure_cabins_cobblestone.get());
	private static final ChanceConfig placement_cabin_cobblestone = new ChanceConfig(cabin_cobblestone_chance);
	private static final int cabin_bricks_chance = 1 + (10 - Config.spawnrate_structure_cabins_bricks.get());
	private static final ChanceConfig placement_cabin_bricks = new ChanceConfig(cabin_bricks_chance);
	private static final int cabin_spruce_chance = 1 + (10 - Config.spawnrate_structure_cabins_spruce.get());
	private static final ChanceConfig placement_cabin_spruce = new ChanceConfig(cabin_spruce_chance);
	private static final int cabin_jungle_chance = 1 + (10 - Config.spawnrate_structure_cabins_jungle.get());
	private static final ChanceConfig placement_cabin_jungle = new ChanceConfig(cabin_jungle_chance);
	private static final int cabin_acacia_chance = 1 + (10 - Config.spawnrate_structure_cabins_acacia.get());
	private static final ChanceConfig placement_cabin_acacia = new ChanceConfig(cabin_acacia_chance);
	
	// dungeons
	
	
	
	// blocks
	
	private static final CountRangeConfig placement_oldstone = new CountRangeConfig(Config.spawnrate_block_oldstone.get(), 16, 16, 64);
	private static final CountRangeConfig placement_brokenstone = new CountRangeConfig(Config.spawnrate_block_brokenstone.get(), 16, 16, 54);
	private static final CountRangeConfig placement_sedimentstone = new CountRangeConfig(Config.spawnrate_block_sedimentstone.get(), 16, 16, 54);
	private static final CountRangeConfig placement_lavastone = new CountRangeConfig(Config.spawnrate_block_lavastone.get(), 0, 0, 15);
	private static final CountRangeConfig placement_dirt = new CountRangeConfig(Config.spawnrate_block_dirt.get(), 16, 16, 64);
	private static final CountRangeConfig placement_dirtstone = new CountRangeConfig(Config.spawnrate_block_dirtstone.get(), 16, 16, 64);
	private static final CountRangeConfig placement_marlstone = new CountRangeConfig(Config.spawnrate_block_marlstone.get(), 16, 16, 64);
	private static final CountRangeConfig placement_packed_ice = new CountRangeConfig(Config.spawnrate_block_packed_ice.get(), 16, 16, 64);
	
	// rocks
	
	private static final CountRangeConfig placement_flint = new CountRangeConfig(Config.spawnrate_rock_flints.get(), 16, 16, 64);
	private static final CountRangeConfig placement_pebble = new CountRangeConfig(Config.spawnrate_rock_pebbles.get(), 16, 16, 64);
	private static final CountRangeConfig placement_rockpile = new CountRangeConfig(Config.spawnrate_rock_rockpiles.get(), 16, 16, 64);
	private static final CountRangeConfig placement_stalagmite = new CountRangeConfig(Config.spawnrate_rock_stalagmites.get(), 16, 16, 54);
	private static final CountRangeConfig placement_stalactite = new CountRangeConfig(Config.spawnrate_rock_stalactites.get(), 16, 16, 54);
	
	private static final CountRangeConfig placement_pebble_lavastone = new CountRangeConfig(Config.spawnrate_rock_pebbles.get(), 0, 0, 15);
	private static final CountRangeConfig placement_rockpile_lavastone = new CountRangeConfig(Config.spawnrate_rock_rockpiles.get(), 0, 0, 15);
	private static final CountRangeConfig placement_stalagmite_lavastone = new CountRangeConfig(Config.spawnrate_rock_stalagmites.get(), 0, 0, 15);
	private static final CountRangeConfig placement_stalactite_lavastone = new CountRangeConfig(Config.spawnrate_rock_stalactites.get(), 0, 0, 15);
	
	// mushrooms
	
	private static final CountRangeConfig placement_mushroom_sweetshroom = new CountRangeConfig(Config.spawnrate_mushroom_sweetshroom.get(), 16, 16, 54);
	private static final CountRangeConfig placement_mushroom_goldishroom = new CountRangeConfig(Config.spawnrate_mushroom_goldishroom.get(), 16, 16, 32);
	private static final CountRangeConfig placement_mushroom_shinyshroom = new CountRangeConfig(Config.spawnrate_mushroom_shinyshroom.get(), 0, 0, 15);
	private static final CountRangeConfig placement_mushroom_lumishroom = new CountRangeConfig(Config.spawnrate_mushroom_lumishroom.get(), 16, 16, 54);
	private static final CountRangeConfig placement_mushroom_fluoshroom = new CountRangeConfig(Config.spawnrate_mushroom_fluoshroom.get(), 16, 16, 54);
	private static final CountRangeConfig placement_mushroom_rockshroom = new CountRangeConfig(Config.spawnrate_mushroom_rockshroom.get(), 0, 0, 15);
	
	// mosses
	
	private static final CountRangeConfig placement_moss_dry = new CountRangeConfig(Config.spawnrate_moss_dry.get(), 16, 16, 54);
	private static final CountRangeConfig placement_moss_fire = new CountRangeConfig(Config.spawnrate_moss_fire.get(), 0, 0, 15);
	private static final CountRangeConfig placement_moss_frozen = new CountRangeConfig(Config.spawnrate_moss_frozen.get(), 16, 16, 54);
	private static final CountRangeConfig placement_moss_hanging_roots = new CountRangeConfig(Config.spawnrate_moss_hanging_roots.get(), 16, 16, 54);
	private static final CountRangeConfig placement_moss_humid = new CountRangeConfig(Config.spawnrate_moss_humid.get(), 16, 16, 54);
	
	// vines
	
	private static final CountRangeConfig placement_cave_vine = new CountRangeConfig(Config.spawnrate_cave_vine.get(), 16, 16, 54);
	
	
	/**
	 * configs
	 */
	
	public static final int spread_i = 8;
	public static final int spread_j = 16;
	public static final int spread_k = 4;
	
	// rocks
	
	// flint
	
	private static final BlockClusterFeatureConfig config_flint = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_flint.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(8)
			.blacklist(ImmutableSet.of(Blocks.GRASS_BLOCK.getDefaultState()))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	// stone
	
	private static final BlockClusterFeatureConfig config_rock_pebble_stone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_pebble_stone.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(32)
			.whitelist(ImmutableSet.of(RegBlocks.oldstone, RegBlocks.brokenstone))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rockpile_two_stone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rockpile_two_stone.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(32)
			.whitelist(ImmutableSet.of(RegBlocks.oldstone, RegBlocks.brokenstone))
			.xSpread(spread_j).ySpread(spread_j).zSpread(spread_j)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rockpile_three_stone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rockpile_three_stone.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(16)
			.whitelist(ImmutableSet.of(RegBlocks.oldstone, RegBlocks.brokenstone))
			.xSpread(spread_j).ySpread(spread_j).zSpread(spread_j)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rock_stalagmite_stone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_stalagmite_stone.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(64)
			.whitelist(ImmutableSet.of(RegBlocks.oldstone, RegBlocks.brokenstone))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rock_stalactite_stone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_stalactite_stone.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(64)
			.whitelist(ImmutableSet.of(RegBlocks.oldstone, RegBlocks.brokenstone))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rock_stalagmite_tall_stone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_stalagmite_tall_stone.getDefaultState()), PlacerDoubleGround.field_236444_c_)).tries(64)
			.whitelist(ImmutableSet.of(RegBlocks.oldstone, RegBlocks.brokenstone))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rock_stalactite_tall_stone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_stalactite_tall_stone.getDefaultState()), PlacerDoubleCeiling.field_236444_c_)).tries(64)
			.whitelist(ImmutableSet.of(RegBlocks.oldstone, RegBlocks.brokenstone))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	// sedimentstone
	
	private static final BlockClusterFeatureConfig config_rock_pebble_sedimentstone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_pebble_sedimentstone.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(16)
			.whitelist(ImmutableSet.of(RegBlocks.sedimentstone))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rockpile_two_sedimentstone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rockpile_two_sedimentstone.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(16)
			.whitelist(ImmutableSet.of(RegBlocks.sedimentstone))
			.xSpread(spread_j).ySpread(spread_j).zSpread(spread_j)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rockpile_three_sedimentstone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rockpile_three_sedimentstone.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(8)
			.whitelist(ImmutableSet.of(RegBlocks.sedimentstone))
			.xSpread(spread_j).ySpread(spread_j).zSpread(spread_j)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rock_stalagmite_sedimentstone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_stalagmite_sedimentstone.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(32)
			.whitelist(ImmutableSet.of(RegBlocks.sedimentstone))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rock_stalactite_sedimentstone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_stalactite_sedimentstone.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(32)
			.whitelist(ImmutableSet.of(RegBlocks.sedimentstone))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rock_stalagmite_tall_sedimentstone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_stalagmite_tall_sedimentstone.getDefaultState()), PlacerDoubleGround.field_236444_c_)).tries(32)
			.whitelist(ImmutableSet.of(RegBlocks.sedimentstone))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rock_stalactite_tall_sedimentstone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_stalactite_tall_sedimentstone.getDefaultState()), PlacerDoubleCeiling.field_236444_c_)).tries(32)
			.whitelist(ImmutableSet.of(RegBlocks.sedimentstone))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	// lavastone
	
	private static final BlockClusterFeatureConfig config_rock_pebble_lavastone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_pebble_lavastone.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(16)
			.whitelist(ImmutableSet.of(RegBlocks.lavastone))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rockpile_two_lavastone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rockpile_two_lavastone.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(16)
			.whitelist(ImmutableSet.of(RegBlocks.lavastone))
			.xSpread(spread_j).ySpread(spread_j).zSpread(spread_j)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rockpile_three_lavastone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rockpile_three_lavastone.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(8)
			.whitelist(ImmutableSet.of(RegBlocks.lavastone))
			.xSpread(spread_j).ySpread(spread_j).zSpread(spread_j)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rock_stalagmite_lavastone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_stalagmite_lavastone.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(32)
			.whitelist(ImmutableSet.of(RegBlocks.lavastone))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rock_stalactite_lavastone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_stalactite_lavastone.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(32)
			.whitelist(ImmutableSet.of(RegBlocks.lavastone))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rock_stalagmite_tall_lavastone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_stalagmite_tall_lavastone.getDefaultState()), PlacerDoubleGround.field_236444_c_)).tries(32)
			.whitelist(ImmutableSet.of(RegBlocks.lavastone))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rock_stalactite_tall_lavastone = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_stalactite_tall_lavastone.getDefaultState()), PlacerDoubleCeiling.field_236444_c_)).tries(32)
			.whitelist(ImmutableSet.of(RegBlocks.lavastone))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	// packed ice
	
	private static final BlockClusterFeatureConfig config_rock_stalagmite_packed_ice = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_stalagmite_packed_ice.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(32)
			.whitelist(ImmutableSet.of(Blocks.PACKED_ICE))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rock_stalactite_packed_ice = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_stalactite_packed_ice.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(32)
			.whitelist(ImmutableSet.of(Blocks.PACKED_ICE))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rock_stalagmite_tall_packed_ice = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_stalagmite_tall_packed_ice.getDefaultState()), PlacerDoubleGround.field_236444_c_)).tries(32)
			.whitelist(ImmutableSet.of(Blocks.PACKED_ICE))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_rock_stalactite_tall_packed_ice = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.rock_stalactite_tall_packed_ice.getDefaultState()), PlacerDoubleCeiling.field_236444_c_)).tries(32)
			.whitelist(ImmutableSet.of(Blocks.PACKED_ICE))
			.xSpread(spread_i).ySpread(spread_i).zSpread(spread_i)
			.func_227317_b_().build();
	
	// mushrooms
	
	private static final BlockClusterFeatureConfig config_mushroom_sweetshroom = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.mushroom_sweetshroom.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(64)
			.blacklist(ImmutableSet.of(Blocks.PACKED_ICE.getDefaultState(), RegBlocks.dirtstone.getDefaultState(),
					RegBlocks.marlstone.getDefaultState()))
			.xSpread(spread_i).ySpread(spread_k).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_mushroom_goldishroom = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.mushroom_goldishroom.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(16)
			.blacklist(ImmutableSet.of(Blocks.PACKED_ICE.getDefaultState(), RegBlocks.dirtstone.getDefaultState(),
					RegBlocks.marlstone.getDefaultState()))
			.xSpread(spread_i).ySpread(spread_k).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_mushroom_shinyshroom = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.mushroom_shinyshroom.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(16)
			.blacklist(ImmutableSet.of(Blocks.PACKED_ICE.getDefaultState(), RegBlocks.dirtstone.getDefaultState(),
					RegBlocks.marlstone.getDefaultState()))
			.xSpread(spread_i).ySpread(spread_k).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_mushroom_lumishroom = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.mushroom_lumishroom.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(64)
			.blacklist(ImmutableSet.of(Blocks.PACKED_ICE.getDefaultState(), RegBlocks.dirtstone.getDefaultState(),
					RegBlocks.marlstone.getDefaultState()))
			.xSpread(spread_i).ySpread(spread_k).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_mushroom_fluoshroom = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.mushroom_fluoshroom.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(64)
			.whitelist(ImmutableSet.of(Blocks.DIRT, RegBlocks.dirtstone))
			.xSpread(spread_i).ySpread(spread_k).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_mushroom_rockshroom = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.mushroom_rockshroom.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(16)
			.blacklist(ImmutableSet.of(Blocks.PACKED_ICE.getDefaultState(), RegBlocks.dirtstone.getDefaultState(),
					RegBlocks.marlstone.getDefaultState()))
			.xSpread(spread_i).ySpread(spread_k).zSpread(spread_i)
			.func_227317_b_().build();
	
	// mosses
	
	private static final BlockClusterFeatureConfig config_moss_dry = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.moss_dry.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(8)
			.xSpread(spread_i).ySpread(spread_k).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_moss_fire = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.moss_fire.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(16)
			.whitelist(ImmutableSet.of(RegBlocks.lavastone))
			.xSpread(spread_i).ySpread(spread_k).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_moss_frozen = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.moss_frozen.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(32)
			.whitelist(ImmutableSet.of(Blocks.PACKED_ICE))
			.xSpread(spread_i).ySpread(spread_k).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_moss_hanging_roots = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.moss_hanging_roots.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(8)
			.xSpread(spread_i).ySpread(spread_k).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_moss_humid_ground = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.moss_humid_ground.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(32)
			.whitelist(ImmutableSet.of(RegBlocks.dirtstone, Blocks.DIRT))
			.xSpread(spread_i).ySpread(spread_k).zSpread(spread_i)
			.func_227317_b_().build();
	
	private static final BlockClusterFeatureConfig config_moss_humid_ceiling = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.moss_humid_ceiling.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(32)
			.whitelist(ImmutableSet.of(RegBlocks.dirtstone, Blocks.DIRT))
			.xSpread(spread_i).ySpread(spread_k).zSpread(spread_i)
			.func_227317_b_().build();
	
	// vines
	
	private static final BlockClusterFeatureConfig config_cave_vine = (new BlockClusterFeatureConfig.Builder(
			new SimpleBlockStateProvider(RegBlocks.cave_vine_end.getDefaultState()), SimpleBlockPlacer.field_236447_c_)).tries(8)
			.xSpread(spread_i).ySpread(spread_k).zSpread(spread_i)
			.func_227317_b_().build();
	
	/**
	 * biomes types sets
	 */
	
	private static final Set<Biome.Category> IN_OVERWORLD = ImmutableSet.of(
			Biome.Category.BEACH, Biome.Category.DESERT, Biome.Category.EXTREME_HILLS, Biome.Category.FOREST,
			Biome.Category.ICY, Biome.Category.JUNGLE, Biome.Category.MESA, Biome.Category.MUSHROOM,
			Biome.Category.OCEAN, Biome.Category.PLAINS, Biome.Category.RIVER, Biome.Category.SAVANNA,
			Biome.Category.SWAMP, Biome.Category.TAIGA);
	
	private static final Set<Biome.Category> IN_HUMID = ImmutableSet.of(
			Biome.Category.JUNGLE, Biome.Category.MUSHROOM, Biome.Category.SWAMP);
	
	private static final Set<Biome.Category> IN_DRY = ImmutableSet.of(
			Biome.Category.DESERT, Biome.Category.MESA, Biome.Category.SAVANNA);
	
	private static final Set<Biome.Category> IN_COLD = ImmutableSet.of(
			Biome.Category.ICY, Biome.Category.TAIGA);
	
	
	// gen features
	
	public static void setupFeaturesGen() 
	{
		for (Biome biome : ForgeRegistries.BIOMES) 
		{
			if (IN_OVERWORLD.contains(biome.getCategory()))
			{
				
				/**
				 * structures
				 */
				
				if (Config.gen_structure_dungeons.get() == true)
				{
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, RegFeatures.structure_dungeon_cobblestone
							.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.withPlacement(Placement.CHANCE_PASSTHROUGH.configure(placement_dungeon_cobblestone)));
					
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, RegFeatures.structure_dungeon_tall_cobblestone
							.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.withPlacement(Placement.CHANCE_PASSTHROUGH.configure(placement_dungeon_tall_cobblestone)));
					
					if (IN_COLD.contains(biome.getCategory()))
					{
						biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, RegFeatures.structure_dungeon_ice
								.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.CHANCE_PASSTHROUGH.configure(placement_dungeon_ice)));
					}
					
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, RegFeatures.structure_dungeon_lavastone
							.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.withPlacement(Placement.CHANCE_PASSTHROUGH.configure(placement_dungeon_lavastone)));
					
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, RegFeatures.structure_dungeon_tall_lavastone
							.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.withPlacement(Placement.CHANCE_PASSTHROUGH.configure(placement_dungeon_tall_lavastone)));
				}
				
				if (Config.gen_structure_cabins.get() == true)
				{
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, RegFeatures.structure_cabin_oak
							.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.withPlacement(Placement.CHANCE_PASSTHROUGH.configure(placement_cabin_oak)));
					
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, RegFeatures.structure_cabin_cobblestone
							.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.withPlacement(Placement.CHANCE_PASSTHROUGH.configure(placement_cabin_cobblestone)));
					
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, RegFeatures.structure_cabin_bricks
							.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
							.withPlacement(Placement.CHANCE_PASSTHROUGH.configure(placement_cabin_bricks)));
					
					if (biome.getCategory() == Biome.Category.TAIGA)
					{
						biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, RegFeatures.structure_cabin_spruce
								.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.CHANCE_PASSTHROUGH.configure(placement_cabin_spruce)));
					}
					
					if (biome.getCategory() == Biome.Category.JUNGLE)
					{
						biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, RegFeatures.structure_cabin_jungle
								.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.CHANCE_PASSTHROUGH.configure(placement_cabin_jungle)));
					}
					
					if (biome.getCategory() == Biome.Category.SAVANNA)
					{
						biome.addFeature(GenerationStage.Decoration.UNDERGROUND_STRUCTURES, RegFeatures.structure_cabin_acacia
								.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
								.withPlacement(Placement.CHANCE_PASSTHROUGH.configure(placement_cabin_acacia)));
					}
					
				}
				
				/**
				 * blocks
				 */
				
				if (Config.gen_block_brokenstone.get() == true)
				{
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
							.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
									RegBlocks.brokenstone.getDefaultState(), Config.patch_size_brokenstone.get()))
							.withPlacement(Placement.COUNT_RANGE.configure(placement_brokenstone)));
				}
				
				if (Config.gen_block_oldstone.get() == true)
				{
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
							.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
									RegBlocks.oldstone.getDefaultState(), Config.patch_size_oldstone.get()))
							.withPlacement(Placement.COUNT_RANGE.configure(placement_oldstone)));
				}
				
				if (Config.gen_block_sedimentstone.get() == true)
				{
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
							.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
									RegBlocks.sedimentstone.getDefaultState(), Config.patch_size_sedimentstone.get()))
							.withPlacement(Placement.COUNT_RANGE.configure(placement_sedimentstone)));
				}
				
				if (Config.gen_block_lavastone.get() == true)
				{
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
							.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
									RegBlocks.lavastone.getDefaultState(), Config.patch_size_lavastone.get()))
							.withPlacement(Placement.COUNT_RANGE.configure(placement_lavastone)));
				}
				
				if (IN_HUMID.contains(biome.getCategory()))
				{
					if (Config.gen_block_dirt.get() == true)
					{
						biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
								.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
										Blocks.DIRT.getDefaultState(), Config.patch_size_dirt.get()))
								.withPlacement(Placement.COUNT_RANGE.configure(placement_dirt)));
					}
					
					if (Config.gen_block_dirtstone.get() == true)
					{
						biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
								.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
										RegBlocks.dirtstone.getDefaultState(), Config.patch_size_dirtstone.get()))
								.withPlacement(Placement.COUNT_RANGE.configure(placement_dirtstone)));
					}
				}
				
				if (IN_DRY.contains(biome.getCategory()))
				{
					if (Config.gen_block_marlstone.get() == true)
					{
						biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
								.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
										RegBlocks.marlstone.getDefaultState(), Config.patch_size_marlstone.get()))
								.withPlacement(Placement.COUNT_RANGE.configure(placement_marlstone)));
					}
				}
				
				if (IN_COLD.contains(biome.getCategory()))
				{
					if (Config.gen_block_packed_ice.get() == true)
					{
						biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
								.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
										Blocks.PACKED_ICE.getDefaultState(), Config.patch_size_packed_ice.get()))
								.withPlacement(Placement.COUNT_RANGE.configure(placement_packed_ice)));
					}
				}
				
				/**
				 * rocks
				 */
				
				if (Config.gen_rock_flints.get() == true)
				{
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_flint)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_flint)));
				}
				
				if (Config.gen_rock_pebbles.get() == true)
				{
					// stone
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_rock_pebble_stone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_pebble)));
					
					// sedimentstone
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_rock_pebble_sedimentstone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_pebble)));
					
					// lavastone
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_rock_pebble_lavastone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_pebble_lavastone)));
				}
				
				if (Config.gen_rock_rockpiles.get() == true)
				{
					// stone
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_rockpile_two_stone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_rockpile)));
					
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_rockpile_three_stone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_rockpile)));
					
					// sedimentstone
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_rockpile_two_sedimentstone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_rockpile)));
					
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_rockpile_three_sedimentstone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_rockpile)));
					
					// lavastone
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_rockpile_two_lavastone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_rockpile_lavastone)));
					
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_rockpile_three_lavastone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_rockpile_lavastone)));
				}
				
				if (Config.gen_rock_stalagmites.get() == true)
				{
					// stone
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_rock_stalagmite_stone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_stalagmite)));
					
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_rock_stalagmite_tall_stone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_stalagmite)));
					
					// sedimentstone
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_rock_stalagmite_sedimentstone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_stalagmite)));
					
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_rock_stalagmite_tall_sedimentstone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_stalagmite)));
					
					// lavastone
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_rock_stalagmite_lavastone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_stalagmite_lavastone)));
					
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_rock_stalagmite_tall_lavastone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_stalagmite_lavastone)));
					
					// packed ice
					if (IN_COLD.contains(biome.getCategory()))
					{
						biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
								.withConfiguration(config_rock_stalagmite_packed_ice)
								.withPlacement(Placement.COUNT_RANGE.configure(placement_stalagmite)));
						
						biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ground
								.withConfiguration(config_rock_stalagmite_tall_packed_ice)
								.withPlacement(Placement.COUNT_RANGE.configure(placement_stalagmite)));
					}
				}
				
				if (Config.gen_rock_stalactites.get() == true)
				{
					// stone
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ceiling
							.withConfiguration(config_rock_stalactite_stone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_stalactite)));
					
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ceiling
							.withConfiguration(config_rock_stalactite_tall_stone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_stalactite)));
					
					// sedimentstone
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ceiling
							.withConfiguration(config_rock_stalactite_sedimentstone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_stalactite)));
					
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ceiling
							.withConfiguration(config_rock_stalactite_tall_sedimentstone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_stalactite)));
					
					// lavastone
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ceiling
							.withConfiguration(config_rock_stalactite_lavastone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_stalactite_lavastone)));
					
					biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ceiling
							.withConfiguration(config_rock_stalactite_tall_lavastone)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_stalactite_lavastone)));
					
					// packed ice
					if (IN_COLD.contains(biome.getCategory()))
					{
						biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ceiling
								.withConfiguration(config_rock_stalactite_packed_ice)
								.withPlacement(Placement.COUNT_RANGE.configure(placement_stalactite)));
						
						biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, RegFeatures.patch_ceiling
								.withConfiguration(config_rock_stalactite_tall_packed_ice)
								.withPlacement(Placement.COUNT_RANGE.configure(placement_stalactite)));
					}
				}
				
				/**
				 * mushrooms
				 */
				
				if (Config.gen_mushrooms.get() == true)
				{
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_mushroom_sweetshroom)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_mushroom_sweetshroom)));
					
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_mushroom_goldishroom)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_mushroom_goldishroom)));
					
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_mushroom_shinyshroom)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_mushroom_shinyshroom)));
					
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_mushroom_lumishroom)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_mushroom_lumishroom)));
					
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_mushroom_rockshroom)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_mushroom_rockshroom)));
				
					if (IN_HUMID.contains(biome.getCategory()))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, RegFeatures.patch_ground
								.withConfiguration(config_mushroom_fluoshroom)
								.withPlacement(Placement.COUNT_RANGE.configure(placement_mushroom_fluoshroom)));
					}
					
				}
				
				/**
				 * mosses
				 */
				
				if (Config.gen_mosses.get() == true)
				{
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_moss_dry)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_moss_dry)));
					
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_moss_fire)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_moss_fire)));
					
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, RegFeatures.patch_ground
							.withConfiguration(config_moss_hanging_roots)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_moss_hanging_roots)));
				
					if (IN_HUMID.contains(biome.getCategory()))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, RegFeatures.patch_ground
								.withConfiguration(config_moss_humid_ground)
								.withPlacement(Placement.COUNT_RANGE.configure(placement_moss_humid)));
						
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, RegFeatures.patch_ceiling
								.withConfiguration(config_moss_humid_ceiling)
								.withPlacement(Placement.COUNT_RANGE.configure(placement_moss_humid)));
					}
					
					if (IN_COLD.contains(biome.getCategory()))
					{
						biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, RegFeatures.patch_ground
								.withConfiguration(config_moss_frozen)
								.withPlacement(Placement.COUNT_RANGE.configure(placement_moss_frozen)));
					}
					
				}
				
				/**
				 * vines
				 */
				
				if (Config.gen_vines.get() == true)
				{
					biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, RegFeatures.patch_ceiling
							.withConfiguration(config_cave_vine)
							.withPlacement(Placement.COUNT_RANGE.configure(placement_cave_vine)));
					
				}
			
			}

		}
	}

}
