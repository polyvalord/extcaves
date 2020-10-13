package com.polyvalord.extcaves.blocks;

import com.polyvalord.extcaves.ExtCaves;
import com.polyvalord.extcaves.Ref;
import com.polyvalord.extcaves.blocks.basic.BlockSlab;
import com.polyvalord.extcaves.blocks.basic.BlockStairs;
import com.polyvalord.extcaves.blocks.decoration.BlockDecorationPot;
import com.polyvalord.extcaves.blocks.decoration.BlockDecorationPotLong;
import com.polyvalord.extcaves.blocks.decoration.BlockDecorationPotQuartzLong;
import com.polyvalord.extcaves.blocks.decoration.BlockDecorationPotQuartzShort;
import com.polyvalord.extcaves.blocks.decoration.BlockDecorationPotShort;
import com.polyvalord.extcaves.blocks.moss.BlockMossDry;
import com.polyvalord.extcaves.blocks.moss.BlockMossFire;
import com.polyvalord.extcaves.blocks.moss.BlockMossFrozen;
import com.polyvalord.extcaves.blocks.moss.BlockMossHangingRoots;
import com.polyvalord.extcaves.blocks.moss.BlockMossHumidCeiling;
import com.polyvalord.extcaves.blocks.moss.BlockMossHumidGround;
import com.polyvalord.extcaves.blocks.mushrooms.BlockFluoshroom;
import com.polyvalord.extcaves.blocks.mushrooms.BlockGoldishroom;
import com.polyvalord.extcaves.blocks.mushrooms.BlockLumishroom;
import com.polyvalord.extcaves.blocks.mushrooms.BlockRockshroom;
import com.polyvalord.extcaves.blocks.mushrooms.BlockShinyshroom;
import com.polyvalord.extcaves.blocks.mushrooms.BlockSweetshroom;
import com.polyvalord.extcaves.blocks.rocks.BlockFlint;
import com.polyvalord.extcaves.blocks.rocks.BlockPebble;
import com.polyvalord.extcaves.blocks.rocks.BlockRockpileThree;
import com.polyvalord.extcaves.blocks.rocks.BlockRockpileTwo;
import com.polyvalord.extcaves.blocks.rocks.BlockStalactite;
import com.polyvalord.extcaves.blocks.rocks.BlockStalactiteTall;
import com.polyvalord.extcaves.blocks.rocks.BlockStalagmite;
import com.polyvalord.extcaves.blocks.rocks.BlockStalagmiteTall;
import com.polyvalord.extcaves.blocks.treasures.BlockTreasurePot;
import com.polyvalord.extcaves.blocks.treasures.BlockTreasurePotLong;
import com.polyvalord.extcaves.blocks.treasures.BlockTreasurePotQuartzLong;
import com.polyvalord.extcaves.blocks.treasures.BlockTreasurePotQuartzShort;
import com.polyvalord.extcaves.blocks.treasures.BlockTreasurePotShort;
import com.polyvalord.extcaves.blocks.vines.BlockCaveVine;
import com.polyvalord.extcaves.blocks.vines.BlockCaveVineEnd;
import com.polyvalord.extcaves.items.FoodList;
import com.polyvalord.extcaves.items.ItemDoubleBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Ref.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Ref.MODID)
public class RegBlocks
{

	// shrooms
    public static final Block mushroom_sweetshroom = null;
    public static final Block mushroom_goldishroom = null;
    public static final Block mushroom_shinyshroom = null;
    public static final Block mushroom_lumishroom = null;
    public static final Block mushroom_fluoshroom = null;
    public static final Block mushroom_rockshroom = null;
    
    // mosses
    public static final Block moss_dry = null;
    public static final Block moss_fire = null;
    public static final Block moss_frozen = null;
    public static final Block moss_hanging_roots = null;
    public static final Block moss_humid_ground = null;
    public static final Block moss_humid_ceiling = null;
    
    // vines
    public static final Block cave_vine = null;
    public static final Block cave_vine_end = null;
    
    // blocks
    public static final Block oldstone = null;
    public static final Block brokenstone = null;
    public static final Block sedimentstone = null;
    public static final Block lavastone = null;
    public static final Block dirtstone = null;
    public static final Block dirtstone_cobble = null;
    public static final Block marlstone = null;
    public static final Block marlstone_powder = null;
    public static final Block bricks_ice = null;
    public static final Block bricks_snow = null;
    public static final Block polished_lavastone = null;
    
    public static final Block lavastone_slab = null;
    public static final Block dirtstone_slab = null;
    public static final Block dirtstone_cobble_slab = null;
    public static final Block bricks_ice_slab = null;
    public static final Block bricks_snow_slab = null;
    public static final Block polished_lavastone_slab = null;
    
    public static final Block lavastone_stairs = null;
    public static final Block dirtstone_stairs = null;
    public static final Block dirtstone_cobble_stairs = null;
    public static final Block bricks_ice_stairs = null;
    public static final Block bricks_snow_stairs = null;
    public static final Block polished_lavastone_stairs = null;
    
    // rocks
    public static final Block rock_flint = null;
    public static final Block rock_pebble_stone = null;
    public static final Block rock_pebble_sedimentstone = null;
    public static final Block rock_pebble_lavastone = null;
    public static final Block rock_pebble_andesite = null;
    public static final Block rock_pebble_diorite = null;
    public static final Block rock_pebble_granite = null;
    public static final Block rockpile_two_stone = null;
    public static final Block rockpile_two_sedimentstone = null;
    public static final Block rockpile_two_lavastone = null;
    public static final Block rockpile_two_andesite = null;
    public static final Block rockpile_two_diorite = null;
    public static final Block rockpile_two_granite = null;
    public static final Block rockpile_three_stone = null;
    public static final Block rockpile_three_sedimentstone = null;
    public static final Block rockpile_three_lavastone = null;
    public static final Block rockpile_three_andesite = null;
    public static final Block rockpile_three_diorite = null;
    public static final Block rockpile_three_granite = null;
    
    // speleothems
    public static final Block rock_stalagmite_stone = null;
    public static final Block rock_stalagmite_sedimentstone = null;
    public static final Block rock_stalagmite_lavastone = null;
    public static final Block rock_stalagmite_packed_ice = null;
    public static final Block rock_stalagmite_tall_stone = null;
    public static final Block rock_stalagmite_tall_sedimentstone = null;
    public static final Block rock_stalagmite_tall_lavastone = null;
    public static final Block rock_stalagmite_tall_packed_ice = null;
    public static final Block rock_stalactite_stone = null;
    public static final Block rock_stalactite_sedimentstone = null;
    public static final Block rock_stalactite_lavastone = null;
    public static final Block rock_stalactite_packed_ice = null;
    public static final Block rock_stalactite_tall_stone = null;
    public static final Block rock_stalactite_tall_sedimentstone = null;
    public static final Block rock_stalactite_tall_lavastone = null;
    public static final Block rock_stalactite_tall_packed_ice = null;
    
    // treasures
    public static final Block treasure_pot = null;
    public static final Block treasure_pot_short = null;
    public static final Block treasure_pot_long = null;
    public static final Block treasure_pot_quartz_short = null;
    public static final Block treasure_pot_quartz_long = null;
    
    // decorations
    public static final Block decoration_pot = null;
    public static final Block decoration_pot_short = null;
    public static final Block decoration_pot_long = null;
    public static final Block decoration_pot_quartz_short = null;
    public static final Block decoration_pot_quartz_long = null;

	@SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
    	event.getRegistry().registerAll(
    		// shrooms
    		new BlockSweetshroom(8, 5, Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).tickRandomly().doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName(Ref.MODID, "mushroom_sweetshroom"),
    		new BlockGoldishroom(12, 3, Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).tickRandomly().doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName(Ref.MODID, "mushroom_goldishroom"),
    		new BlockShinyshroom(15, 3, Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).tickRandomly().doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName(Ref.MODID, "mushroom_shinyshroom"),
    		new BlockLumishroom(10, 4, Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).tickRandomly().doesNotBlockMovement().sound(SoundType.PLANT).func_235838_a_((p_235470_0_) -> {return 9;})).setRegistryName(Ref.MODID, "mushroom_lumishroom"),
    		new BlockFluoshroom(10, 5, Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).tickRandomly().doesNotBlockMovement().sound(SoundType.PLANT).func_235838_a_((p_235470_0_) -> {return 8;})).setRegistryName(Ref.MODID, "mushroom_fluoshroom"),
    		new BlockRockshroom(18, 2, Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).tickRandomly().doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName(Ref.MODID, "mushroom_rockshroom"),
    		
    		// mosses
    		new BlockMossDry(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName(Ref.MODID, "moss_dry"),
    		new BlockMossFire(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).doesNotBlockMovement().sound(SoundType.PLANT).func_235838_a_((p_235470_0_) -> {return 12;})).setRegistryName(Ref.MODID, "moss_fire"),
    		new BlockMossFrozen(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName(Ref.MODID, "moss_frozen"),
    		new BlockMossHangingRoots(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName(Ref.MODID, "moss_hanging_roots"),
    		new BlockMossHumidGround(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName(Ref.MODID, "moss_humid_ground"),
    		new BlockMossHumidCeiling(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0F).doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName(Ref.MODID, "moss_humid_ceiling"),
    		
    		// vines
    		new BlockCaveVine(AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT)).setRegistryName(Ref.MODID, "cave_vine"),
    		new BlockCaveVineEnd(AbstractBlock.Properties.create(Material.PLANTS).tickRandomly().doesNotBlockMovement().zeroHardnessAndResistance().sound(SoundType.PLANT)).setRegistryName(Ref.MODID, "cave_vine_end"),
    		
    		// blocks
    		new BlockOldstone(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 4.5F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "oldstone"),
    		new BlockBrokenstone(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.75F, 1.5F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "brokenstone"),
    		new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.0F, 3.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "sedimentstone"),
    		new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 8.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "lavastone"),
    		new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 3.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "dirtstone"),
    		new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "dirtstone_cobble"),
    		new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 3.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "marlstone"),
    		new SandBlock(6901053, Block.Properties.create(Material.SAND).hardnessAndResistance(0.5F).harvestTool(ToolType.SHOVEL).sound(SoundType.SAND)).setRegistryName(Ref.MODID, "marlstone_powder"),
    		new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "bricks_ice"),
    		new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "bricks_snow"),
    		new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 8.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "polished_lavastone"),
    		
    		new BlockSlab(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 8.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "lavastone_slab"),
    		new BlockSlab(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 3.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "dirtstone_slab"),
    		new BlockSlab(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "dirtstone_cobble_slab"),
    		new BlockSlab(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "bricks_ice_slab"),
    		new BlockSlab(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "bricks_snow_slab"),
    		new BlockSlab(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 8.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "polished_lavastone_slab"),
    		
    		new BlockStairs(Blocks.COBBLESTONE.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 8.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "lavastone_stairs"),
    		new BlockStairs(Blocks.COBBLESTONE.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.2F, 3.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "dirtstone_stairs"),
    		new BlockStairs(Blocks.COBBLESTONE.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "dirtstone_cobble_stairs"),
    		new BlockStairs(Blocks.COBBLESTONE.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "bricks_ice_stairs"),
    		new BlockStairs(Blocks.COBBLESTONE.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 6.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "bricks_snow_stairs"),
    		new BlockStairs(Blocks.COBBLESTONE.getDefaultState(), Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 8.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "polished_lavastone_stairs"),
    		
    		// rocks
    		new BlockFlint(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.0F)).setRegistryName(Ref.MODID, "rock_flint"),
    		new BlockPebble(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.0F)).setRegistryName(Ref.MODID, "rock_pebble_stone"),
    		new BlockPebble(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.0F)).setRegistryName(Ref.MODID, "rock_pebble_sedimentstone"),
    		new BlockPebble(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.0F)).setRegistryName(Ref.MODID, "rock_pebble_lavastone"),
    		new BlockPebble(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.0F)).setRegistryName(Ref.MODID, "rock_pebble_andesite"),
    		new BlockPebble(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.0F)).setRegistryName(Ref.MODID, "rock_pebble_diorite"),
    		new BlockPebble(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.0F)).setRegistryName(Ref.MODID, "rock_pebble_granite"),
    		new BlockRockpileTwo(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.3F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rockpile_two_stone"),
    		new BlockRockpileTwo(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.2F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rockpile_two_sedimentstone"),
    		new BlockRockpileTwo(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.4F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rockpile_two_lavastone"),
    		new BlockRockpileTwo(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.3F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rockpile_two_andesite"),
    		new BlockRockpileTwo(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.3F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rockpile_two_diorite"),
    		new BlockRockpileTwo(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.3F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rockpile_two_granite"),
    		new BlockRockpileThree(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.45F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rockpile_three_stone"),
    		new BlockRockpileThree(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.3F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rockpile_three_sedimentstone"),
    		new BlockRockpileThree(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.6F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rockpile_three_lavastone"),
    		new BlockRockpileThree(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.45F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rockpile_three_andesite"),
    		new BlockRockpileThree(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.45F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rockpile_three_diorite"),
    		new BlockRockpileThree(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.45F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rockpile_three_granite"),
    		
    		// speleothems
    		new BlockStalagmite(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.45F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rock_stalagmite_stone"),
    		new BlockStalagmite(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.3F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rock_stalagmite_sedimentstone"),
    		new BlockStalagmite(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.6F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rock_stalagmite_lavastone"),
    		new BlockStalagmite(Block.Properties.create(Material.PACKED_ICE).slipperiness(0.98F).hardnessAndResistance(0.15F).harvestTool(ToolType.PICKAXE).sound(SoundType.GLASS)).setRegistryName(Ref.MODID, "rock_stalagmite_packed_ice"),
    		new BlockStalagmiteTall(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.75F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rock_stalagmite_tall_stone"),
    		new BlockStalagmiteTall(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rock_stalagmite_tall_sedimentstone"),
    		new BlockStalagmiteTall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rock_stalagmite_tall_lavastone"),
    		new BlockStalagmiteTall(Block.Properties.create(Material.PACKED_ICE).slipperiness(0.98F).hardnessAndResistance(0.25F).harvestTool(ToolType.PICKAXE).sound(SoundType.GLASS)).setRegistryName(Ref.MODID, "rock_stalagmite_tall_packed_ice"),
    		new BlockStalactite(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.45F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rock_stalactite_stone"),
    		new BlockStalactite(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.3F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rock_stalactite_sedimentstone"),
    		new BlockStalactite(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.6F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rock_stalactite_lavastone"),
    		new BlockStalactite(Block.Properties.create(Material.PACKED_ICE).slipperiness(0.98F).hardnessAndResistance(0.15F).harvestTool(ToolType.PICKAXE).sound(SoundType.GLASS)).setRegistryName(Ref.MODID, "rock_stalactite_packed_ice"),
    		new BlockStalactiteTall(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.75F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rock_stalactite_tall_stone"),
    		new BlockStalactiteTall(Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rock_stalactite_tall_sedimentstone"),
    		new BlockStalactiteTall(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.0F).harvestTool(ToolType.PICKAXE)).setRegistryName(Ref.MODID, "rock_stalactite_tall_lavastone"),
    		new BlockStalactiteTall(Block.Properties.create(Material.PACKED_ICE).slipperiness(0.98F).hardnessAndResistance(0.25F).harvestTool(ToolType.PICKAXE).sound(SoundType.GLASS)).setRegistryName(Ref.MODID, "rock_stalactite_tall_packed_ice"),
    		
    		new BlockTreasurePot(Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.2F).sound(SoundType.STONE)).setRegistryName(Ref.MODID, "treasure_pot"),
    		new BlockTreasurePotShort(Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.2F).sound(SoundType.STONE)).setRegistryName(Ref.MODID, "treasure_pot_short"),
    		new BlockTreasurePotLong(Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.2F).sound(SoundType.STONE)).setRegistryName(Ref.MODID, "treasure_pot_long"),
    		new BlockTreasurePotQuartzShort(Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.2F).sound(SoundType.STONE)).setRegistryName(Ref.MODID, "treasure_pot_quartz_short"),
    		new BlockTreasurePotQuartzLong(Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.2F).sound(SoundType.STONE)).setRegistryName(Ref.MODID, "treasure_pot_quartz_long"),
    		
    		new BlockDecorationPot(Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.2F).sound(SoundType.STONE)).setRegistryName(Ref.MODID, "decoration_pot"),
    		new BlockDecorationPotShort(Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.2F).sound(SoundType.STONE)).setRegistryName(Ref.MODID, "decoration_pot_short"),
    		new BlockDecorationPotLong(Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.2F).sound(SoundType.STONE)).setRegistryName(Ref.MODID, "decoration_pot_long"),
    		new BlockDecorationPotQuartzShort(Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.2F).sound(SoundType.STONE)).setRegistryName(Ref.MODID, "decoration_pot_quartz_short"),
    		new BlockDecorationPotQuartzLong(Block.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.2F).sound(SoundType.STONE)).setRegistryName(Ref.MODID, "decoration_pot_quartz_long")
    		
    		
    			);
    	
    }

	@SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
    	event.getRegistry().registerAll(
    		createBlockItem(mushroom_sweetshroom, new Item.Properties().food(FoodList.food_sweetshroom)),
    		createBlockItem(mushroom_goldishroom, new Item.Properties().food(FoodList.food_goldishroom)),
    		createBlockItem(mushroom_shinyshroom, new Item.Properties().food(FoodList.food_shinyshroom)),
    		createBlockItem(mushroom_lumishroom, new Item.Properties().food(FoodList.food_lumishroom)),
    		createBlockItem(mushroom_fluoshroom, new Item.Properties().food(FoodList.food_fluoshroom)),
    		createBlockItem(mushroom_rockshroom, new Item.Properties().food(FoodList.food_rockshroom)),
    		
    		createBlockItem(moss_dry, new Item.Properties()),
    		createBlockItem(moss_fire, new Item.Properties()),
    		createBlockItem(moss_frozen, new Item.Properties()),
    		createBlockItem(moss_hanging_roots, new Item.Properties()),
    		createBlockItem(moss_humid_ground, new Item.Properties()),
    		createBlockItem(moss_humid_ceiling, new Item.Properties()),
    		
    		createBlockItem(cave_vine_end, new Item.Properties()),
    		
    		createBlockItem(oldstone, new Item.Properties()),
    		createBlockItem(brokenstone, new Item.Properties()),
    		createBlockItem(sedimentstone, new Item.Properties()),
    		createBlockItem(lavastone, new Item.Properties()),
    		createBlockItem(dirtstone, new Item.Properties()),
    		createBlockItem(dirtstone_cobble, new Item.Properties()),
    		createBlockItem(marlstone, new Item.Properties()),
    		createBlockItem(marlstone_powder, new Item.Properties()),
    		createBlockItem(bricks_ice, new Item.Properties()),
    		createBlockItem(bricks_snow, new Item.Properties()),
    		createBlockItem(polished_lavastone, new Item.Properties()),
    		
    		createBlockItem(lavastone_slab, new Item.Properties()),
    		createBlockItem(dirtstone_slab, new Item.Properties()),
    		createBlockItem(dirtstone_cobble_slab, new Item.Properties()),
    		createBlockItem(bricks_ice_slab, new Item.Properties()),
    		createBlockItem(bricks_snow_slab, new Item.Properties()),
    		createBlockItem(polished_lavastone_slab, new Item.Properties()),
    		
    		createBlockItem(lavastone_stairs, new Item.Properties()),
    		createBlockItem(dirtstone_stairs, new Item.Properties()),
    		createBlockItem(dirtstone_cobble_stairs, new Item.Properties()),
    		createBlockItem(bricks_ice_stairs, new Item.Properties()),
    		createBlockItem(bricks_snow_stairs, new Item.Properties()),
    		createBlockItem(polished_lavastone_stairs, new Item.Properties()),
    		
    		createBlockItem(rock_flint, new Item.Properties()),
    		createBlockItem(rock_pebble_stone, new Item.Properties()),
    		createBlockItem(rock_pebble_sedimentstone, new Item.Properties()),
    		createBlockItem(rock_pebble_lavastone, new Item.Properties()),
    		createBlockItem(rock_pebble_andesite, new Item.Properties()),
    		createBlockItem(rock_pebble_diorite, new Item.Properties()),
    		createBlockItem(rock_pebble_granite, new Item.Properties()),
    		createBlockItem(rockpile_two_stone, new Item.Properties()),
    		createBlockItem(rockpile_two_sedimentstone, new Item.Properties()),
    		createBlockItem(rockpile_two_lavastone, new Item.Properties()),
    		createBlockItem(rockpile_two_andesite, new Item.Properties()),
    		createBlockItem(rockpile_two_diorite, new Item.Properties()),
    		createBlockItem(rockpile_two_granite, new Item.Properties()),
    		createBlockItem(rockpile_three_stone, new Item.Properties()),
    		createBlockItem(rockpile_three_sedimentstone, new Item.Properties()),
    		createBlockItem(rockpile_three_lavastone, new Item.Properties()),
    		createBlockItem(rockpile_three_andesite, new Item.Properties()),
    		createBlockItem(rockpile_three_diorite, new Item.Properties()),
    		createBlockItem(rockpile_three_granite, new Item.Properties()),
    		
    		createBlockItem(rock_stalagmite_stone, new Item.Properties()),
    		createBlockItem(rock_stalagmite_sedimentstone, new Item.Properties()),
    		createBlockItem(rock_stalagmite_lavastone, new Item.Properties()),
    		createBlockItem(rock_stalagmite_packed_ice, new Item.Properties()),
    		createDoubleBlockItem(true, rock_stalagmite_tall_stone, new Item.Properties()),
    		createDoubleBlockItem(true, rock_stalagmite_tall_sedimentstone, new Item.Properties()),
    		createDoubleBlockItem(true, rock_stalagmite_tall_lavastone, new Item.Properties()),
    		createDoubleBlockItem(true, rock_stalagmite_tall_packed_ice, new Item.Properties()),
    		createBlockItem(rock_stalactite_stone, new Item.Properties()),
    		createBlockItem(rock_stalactite_sedimentstone, new Item.Properties()),
    		createBlockItem(rock_stalactite_lavastone, new Item.Properties()),
    		createBlockItem(rock_stalactite_packed_ice, new Item.Properties()),
    		createDoubleBlockItem(false, rock_stalactite_tall_stone, new Item.Properties()),
    		createDoubleBlockItem(false, rock_stalactite_tall_sedimentstone, new Item.Properties()),
    		createDoubleBlockItem(false, rock_stalactite_tall_lavastone, new Item.Properties()),
    		createDoubleBlockItem(false, rock_stalactite_tall_packed_ice, new Item.Properties()),
    		
    		createBlockItem(treasure_pot, new Item.Properties().rarity(Rarity.UNCOMMON)),
    		createBlockItem(treasure_pot_short, new Item.Properties().rarity(Rarity.UNCOMMON)),
    		createBlockItem(treasure_pot_long, new Item.Properties().rarity(Rarity.UNCOMMON)),
    		createBlockItem(treasure_pot_quartz_short, new Item.Properties().rarity(Rarity.UNCOMMON)),
    		createBlockItem(treasure_pot_quartz_long, new Item.Properties().rarity(Rarity.UNCOMMON)),
    		
    		createBlockItem(decoration_pot, new Item.Properties()),
    		createBlockItem(decoration_pot_short, new Item.Properties()),
    		createBlockItem(decoration_pot_long, new Item.Properties()),
    		createBlockItem(decoration_pot_quartz_short, new Item.Properties()),
    		createBlockItem(decoration_pot_quartz_long, new Item.Properties())
    		
    		
    			);
    }
	
	private static Item createBlockItem(Block block, Item.Properties properties)
	{
		properties.group(ExtCaves.extcaves_tab);
		properties.maxStackSize(64);
		return new BlockItem(block, properties).setRegistryName(block.getRegistryName());
	}
	
	private static Item createDoubleBlockItem(boolean isup, Block block, Item.Properties properties)
	{
		properties.group(ExtCaves.extcaves_tab);
		properties.maxStackSize(64);
		return new ItemDoubleBlock(isup, block, properties).setRegistryName(block.getRegistryName());
	}

}