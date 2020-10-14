package com.polyvalord.extcaves.items;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

@SuppressWarnings("deprecation")
public class FoodList
{
	
	public static Food food_sweetshroom = (new Food.Builder()).hunger(2).saturation(0.2F).build();
	public static Food food_sweetshroom_cooked = (new Food.Builder()).hunger(6).saturation(0.6F).build();
	public static Food food_goldishroom = (new Food.Builder()).hunger(2).saturation(0.2F).setAlwaysEdible().effect(new EffectInstance(Effects.HASTE, 600, 0), 1.0F).build();
	public static Food food_shinyshroom = (new Food.Builder()).hunger(2).saturation(0.2F).setAlwaysEdible().effect(new EffectInstance(Effects.HASTE, 1200, 0), 1.0F).build();
	public static Food food_lumishroom = (new Food.Builder()).hunger(2).saturation(0.2F).setAlwaysEdible().effect(new EffectInstance(Effects.BLINDNESS, 300, 0), 1.0F).build();
	public static Food food_fluoshroom = (new Food.Builder()).hunger(2).saturation(0.2F).setAlwaysEdible().effect(new EffectInstance(Effects.NAUSEA, 300, 0), 1.0F).build();
	public static Food food_rockshroom = (new Food.Builder()).hunger(2).saturation(0.2F).setAlwaysEdible().effect(new EffectInstance(Effects.RESISTANCE, 600, 0), 1.0F).build();
	public static Food food_stew_sticky = (new Food.Builder()).hunger(6).saturation(0.6F).setAlwaysEdible().effect(new EffectInstance(Effects.HASTE, 3600, 1), 1.0F).build();
	public static Food food_stew_fluorescent = (new Food.Builder()).hunger(6).saturation(0.6F).setAlwaysEdible().effect(new EffectInstance(Effects.NIGHT_VISION, 6000, 0), 1.0F).build();
	public static Food food_stew_hard = (new Food.Builder()).hunger(6).saturation(0.6F).setAlwaysEdible().effect(new EffectInstance(Effects.RESISTANCE, 3600, 0), 1.0F).build();
	
}
