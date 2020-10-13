package com.polyvalord.extcaves.blocks.vines;

import java.util.Random;

import com.polyvalord.extcaves.blocks.RegBlocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractTopPlantBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlockHelper;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShape;

public class BlockCaveVineEnd extends AbstractTopPlantBlock
{
	protected static final VoxelShape SHAPE = Block.makeCuboidShape(4.0D, 2.0D, 4.0D, 12.0D, 16.0D, 12.0D);

	public BlockCaveVineEnd(AbstractBlock.Properties properties) {
		super(properties, Direction.DOWN, SHAPE, false, 0.1D);
	}

	protected int func_230332_a_(Random p_230332_1_) {
		return PlantBlockHelper.func_235515_a_(p_230332_1_);
	}

	protected Block func_230330_d_()
	{
		return RegBlocks.cave_vine;
	}

	protected boolean func_230334_h_(BlockState p_230334_1_)
	{
		return PlantBlockHelper.func_235514_a_(p_230334_1_);
	}
}