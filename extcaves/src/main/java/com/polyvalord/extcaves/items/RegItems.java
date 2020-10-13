package com.polyvalord.extcaves.items;

import com.polyvalord.extcaves.ExtCaves;
import com.polyvalord.extcaves.Ref;
import com.polyvalord.extcaves.config.Config;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Ref.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Ref.MODID)
public class RegItems
{

	// items
	public static final Item mushroom_sweetshroom_cooked = null;
	public static final Item stew_sticky = null;
	public static final Item stew_fluorescent = null;
	public static final Item stew_hard = null;
	
	public static final Item medecine_bandage = null;
	
	public static final Item pebble_stone = null;
	public static final Item pebble_sedimentstone = null;
	public static final Item pebble_lavastone = null;
	public static final Item pebble_andesite = null;
	public static final Item pebble_diorite = null;
	public static final Item pebble_granite = null;
	public static final Item clay_lump = null;
	public static final Item brick_half = null;
	public static final Item plant_fiber = null;
	
	public static final Item surface_crystal = null;
	
	public static final Item picker_stone = null;
	public static final Item picker_flint = null;
	
	public static final Item butcher_knife = null;
	public static final Item chef_knife = null;
	public static final Item gourmet_fork = null;
	public static final Item gourmet_spoon = null;
	public static final Item iron_dagger = null;
	public static final Item rusty_sword = null;
	public static final Item rusty_pickaxe = null;
	public static final Item wooden_cane = null;
	
	@SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
    	event.getRegistry().registerAll(
    		// items
    		new Item(new Item.Properties().group(ExtCaves.extcaves_tab).food(FoodList.food_sweetshroom_cooked)).setRegistryName(Ref.MODID, "mushroom_sweetshroom_cooked"),
    		new ItemStew(new Item.Properties().group(ExtCaves.extcaves_tab).food(FoodList.food_stew_sticky)).setRegistryName(Ref.MODID, "stew_sticky"),
    		new ItemStew(new Item.Properties().group(ExtCaves.extcaves_tab).food(FoodList.food_stew_fluorescent)).setRegistryName(Ref.MODID, "stew_fluorescent"),
    		new ItemStew(new Item.Properties().group(ExtCaves.extcaves_tab).food(FoodList.food_stew_hard)).setRegistryName(Ref.MODID, "stew_hard"),
    		
    		new ItemMedecine(Config.item_bandage_health.get(), new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "medecine_bandage"),
    		
    		new Item(new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "pebble_stone"),
    		new Item(new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "pebble_sedimentstone"),
    		new Item(new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "pebble_lavastone"),
    		new Item(new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "pebble_andesite"),
    		new Item(new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "pebble_diorite"),
    		new Item(new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "pebble_granite"),
    		new Item(new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "clay_lump"),
    		new Item(new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "brick_half"),
    		new Item(new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "plant_fiber"),
    		
    		new ItemSurfaceCrystal(new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "surface_crystal"),
    		
    		new PickaxeItem(ItemTiers.STONE_WEAK, 1, -2.2F, new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "picker_stone"),
    		new PickaxeItem(ItemTiers.FLINT, 1, -2.2F, new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "picker_flint"),
    		
    		new SwordItem(ItemTier.IRON, 4, -2.2F, new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "butcher_knife"),
    		new SwordItem(ItemTier.IRON, 3, -2.2F, new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "chef_knife"),
    		new SwordItem(ItemTier.IRON, 2, -2.2F, new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "gourmet_fork"),
    		new SwordItem(ItemTier.IRON, 1, -2.2F, new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "gourmet_spoon"),
    		new SwordItem(ItemTier.IRON, 2, -2.2F, new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "iron_dagger"),
    		new SwordItem(ItemTiers.RUSTY, 3, -2.4F, new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "rusty_sword"),
    		new PickaxeItem(ItemTiers.RUSTY, 1, -2.8F, new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "rusty_pickaxe"),
    		new SwordItem(ItemTier.WOOD, 3, -2.0F, new Item.Properties().group(ExtCaves.extcaves_tab)).setRegistryName(Ref.MODID, "wooden_cane")
    		
    		
    			);
    }
		
}
