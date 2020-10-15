package com.polyvalord.extcaves.blocks;

import com.polyvalord.extcaves.ExtCaves;
import com.polyvalord.extcaves.items.FoodList;
import com.polyvalord.extcaves.items.ItemDoubleBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ExtCaves.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(ExtCaves.MODID)
public class RegBlockItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExtCaves.MODID);

    private static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<T> supplier) {
        return ITEMS.register(name, supplier);
    }

    // TODO: Refactor this:
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                createBlockItem(RegBlocks.MUSHROOM_SWEETSHROOM, new Item.Properties().food(FoodList.FOOD_SWEETSHROOM)),
                createBlockItem(RegBlocks.MUSHROOM_GOLDISHROOM, new Item.Properties().food(FoodList.FOOD_GOLDISHROOM)),
                createBlockItem(RegBlocks.MUSHROOM_SHINYSHROOM, new Item.Properties().food(FoodList.FOOD_SHINYSHROOM)),
                createBlockItem(RegBlocks.MUSHROOM_LUMISHROOM, new Item.Properties().food(FoodList.FOOD_LUMISHROOM)),
                createBlockItem(RegBlocks.MUSHROOM_FLUOSHROOM, new Item.Properties().food(FoodList.FOOD_FLUOSHROOM)),
                createBlockItem(RegBlocks.MUSHROOM_ROCKSHROOM, new Item.Properties().food(FoodList.FOOD_ROCKSHROOM)),

                createBlockItem(RegBlocks.MOSS_DRY, new Item.Properties()),
                createBlockItem(RegBlocks.MOSS_FIRE, new Item.Properties()),
                createBlockItem(RegBlocks.MOSS_FROZEN, new Item.Properties()),
                createBlockItem(RegBlocks.MOSS_HANGING_ROOTS, new Item.Properties()),
                createBlockItem(RegBlocks.MOSS_HUMID_GROUND, new Item.Properties()),
                createBlockItem(RegBlocks.MOSS_HUMID_CEILING, new Item.Properties()),

                createBlockItem(RegBlocks.CAVE_VINE_END, new Item.Properties()),

                createBlockItem(RegBlocks.OLDSTONE, new Item.Properties()),
                createBlockItem(RegBlocks.BROKENSTONE, new Item.Properties()),
                createBlockItem(RegBlocks.SEDIMENT_STONE, new Item.Properties()),
                createBlockItem(RegBlocks.LAVASTONE, new Item.Properties()),
                createBlockItem(RegBlocks.DIRTSTONE, new Item.Properties()),
                createBlockItem(RegBlocks.DIRTSTONE_COBBLE, new Item.Properties()),
                createBlockItem(RegBlocks.MARLSTONE, new Item.Properties()),
                createBlockItem(RegBlocks.MARLSTONE_POWDER, new Item.Properties()),
                createBlockItem(RegBlocks.BRICKS_ICE, new Item.Properties()),
                createBlockItem(RegBlocks.BRICKS_SNOW, new Item.Properties()),
                createBlockItem(RegBlocks.POLISHED_LAVASTONE, new Item.Properties()),

                createBlockItem(RegBlocks.LAVASTONE_SLAB, new Item.Properties()),
                createBlockItem(RegBlocks.DIRTSTONE_SLAB, new Item.Properties()),
                createBlockItem(RegBlocks.DIRTSTONE_COBBLE_SLAB, new Item.Properties()),
                createBlockItem(RegBlocks.BRICKS_ICE_SLAB, new Item.Properties()),
                createBlockItem(RegBlocks.BRICKS_SNOW_SLAB, new Item.Properties()),
                createBlockItem(RegBlocks.POLISHED_LAVASTONE_SLAB, new Item.Properties()),

                createBlockItem(RegBlocks.LAVASTONE_STAIRS, new Item.Properties()),
                createBlockItem(RegBlocks.DIRTSTONE_STAIRS, new Item.Properties()),
                createBlockItem(RegBlocks.DIRTSONE_COBBLE_STAIRS, new Item.Properties()),
                createBlockItem(RegBlocks.BRICKS_ICE_STAIRS, new Item.Properties()),
                createBlockItem(RegBlocks.BRICKS_SNOW_STAIRS, new Item.Properties()),
                createBlockItem(RegBlocks.POLISHED_LAVASTONE_STAIRS, new Item.Properties()),

                createBlockItem(RegBlocks.ROCK_FLINT, new Item.Properties()),
                createBlockItem(RegBlocks.ROCK_PEBBLE_STONE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCK_PEBBLE_SEDIMENTSTONE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCK_PEBBLE_LAVASTONE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCK_PEBBLE_ANDESITE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCK_PEBBLE_DIORITE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCK_PEBBLE_GRANITE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCKPILE_TWO_STONE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCKPILE_TWO_SEDIMENTSTONE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCKPILE_TWO_LAVASTONE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCKPILE_TWO_ANDESITE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCKPILE_TWO_DIORITE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCKPILE_TWO_GRANITE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCKPILE_THREE_STONE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCKPILE_THREE_SEDIMENTSTONE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCKPILE_THREE_LAVASTONE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCKPILE_THREE_ANDESITE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCKPILE_THREE_DIORITE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCKPILE_THREE_GRANITE, new Item.Properties()),

                createBlockItem(RegBlocks.ROCK_STALAGMITE_STONE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCK_STALAGMITE_SEDIMENTSTONE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCK_STALAGMITE_LAVASTONE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCK_STALAGMITE_PACKED_ICE, new Item.Properties()),
                createDoubleBlockItem(true, RegBlocks.ROCK_STALAGMITE_TALL_STONE, new Item.Properties()),
                createDoubleBlockItem(true, RegBlocks.ROCK_STALAGMITE_TALL_SEDIMENTSTONE, new Item.Properties()),
                createDoubleBlockItem(true, RegBlocks.ROCK_STALAGMITE_TALL_LAVASTONE, new Item.Properties()),
                createDoubleBlockItem(true, RegBlocks.ROCK_STALAGMITE_TALL_PACKED_ICE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCK_STALACTITE_STONE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCK_STALACTITE_SEDIMENTSTONE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCK_STALACTITE_LAVASTONE, new Item.Properties()),
                createBlockItem(RegBlocks.ROCK_STALACTITE_PACKED_ICE, new Item.Properties()),
                createDoubleBlockItem(false, RegBlocks.ROCK_STALACTITE_TALL_STONE, new Item.Properties()),
                createDoubleBlockItem(false, RegBlocks.ROCK_STALACTITE_TALL_SEDIMENTSTONE, new Item.Properties()),
                createDoubleBlockItem(false, RegBlocks.ROCK_STALACTITE_TALL_LAVASTONE, new Item.Properties()),
                createDoubleBlockItem(false, RegBlocks.ROCK_STALACTITE_TALL_PACKED_ICE, new Item.Properties()),

                createBlockItem(RegBlocks.TREASURE_POT, new Item.Properties().rarity(Rarity.UNCOMMON)),
                createBlockItem(RegBlocks.TREASURE_POT_SHORT, new Item.Properties().rarity(Rarity.UNCOMMON)),
                createBlockItem(RegBlocks.TREASURE_POT_LONG, new Item.Properties().rarity(Rarity.UNCOMMON)),
                createBlockItem(RegBlocks.TREASURE_POT_QUARTZ_SHORT, new Item.Properties().rarity(Rarity.UNCOMMON)),
                createBlockItem(RegBlocks.TREASURE_POT_QUARTZ_LONG, new Item.Properties().rarity(Rarity.UNCOMMON)),

                createBlockItem(RegBlocks.DECORATION_POT, new Item.Properties()),
                createBlockItem(RegBlocks.DECORATION_POT_SHORT, new Item.Properties()),
                createBlockItem(RegBlocks.DECORATION_POT_LONG, new Item.Properties()),
                createBlockItem(RegBlocks.DECORATION_POT_QUARTZ_SHORT, new Item.Properties()),
                createBlockItem(RegBlocks.DECORATION_POT_QUARTZ_LONG, new Item.Properties())


        );
    }

    private static Item createBlockItem(RegistryObject<Block> block, Item.Properties properties) {
        properties.group(ExtCaves.extcaves_tab);
        properties.maxStackSize(64);
        return new BlockItem(block.get(), properties).setRegistryName(block.get().getRegistryName());
    }

    private static Item createDoubleBlockItem(boolean isup, RegistryObject<Block> block, Item.Properties properties) {
        properties.group(ExtCaves.extcaves_tab);
        properties.maxStackSize(64);
        return new ItemDoubleBlock(isup, block.get(), properties).setRegistryName(block.get().getRegistryName());
    }
}
