package com.marijuana.moditems;

import com.marijuana.Marijuana;
import com.marijuana.effect.HighEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent WEED = new FoodComponent.Builder().hunger(1).saturationModifier(1f).alwaysEdible().build();
    public static final FoodComponent BROWNIE = new FoodComponent.Builder().hunger(4).saturationModifier(1f).build();
    public static final FoodComponent WEEDBROWNIE = new FoodComponent.Builder().hunger(4).saturationModifier(1f).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 150), 0.5f)
            .statusEffect(new StatusEffectInstance(Marijuana.HIGH, 5000),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2000),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 150), 0.15f)
    .build();
    public static final FoodComponent WEEDCOOKIE = new FoodComponent.Builder().hunger(3).saturationModifier(1f).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 150), 0.5f)
            .statusEffect(new StatusEffectInstance(Marijuana.HIGH, 5000),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2000),1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 150), 0.15f)
            .build();
    public static final FoodComponent BLUNT = new FoodComponent.Builder().hunger(4).saturationModifier(1f).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 2000), 1f)
            .statusEffect(new StatusEffectInstance(Marijuana.HIGH, 5000), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2000), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 150), 0.15f).build();
    public static final FoodComponent BUD = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 250), 1f).build();
}
