package net.zia.sunkenbiomes.item;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties JUNGLE_SPORES = new FoodProperties.Builder().nutrition(2).fast().alwaysEat()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 250, 8), 1f).build();

}
