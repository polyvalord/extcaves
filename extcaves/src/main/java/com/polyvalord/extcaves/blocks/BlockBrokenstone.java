package com.polyvalord.extcaves.blocks;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockBrokenstone extends Block
{

	public BlockBrokenstone(Properties properties)
	{
		super(properties);
	}
	
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn)
	{
		if (entityIn.getType() == EntityType.PLAYER)
		{
			worldIn.destroyBlock(pos, false);
		}
	}

}
