package com.marijuana.moditems.custom;

import com.marijuana.Marijuana;


import com.marijuana.moditems.ModToolMaterial;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.minecraft.item.ItemUsageContext;

public class BluntItem
        extends Item {
    public BluntItem(ModToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(settings);
    }
    public static final int MAX_USE_TIME = 1200;
   // public static final float field_30922 = 0.1f;

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 1200;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.SPYGLASS;
    }


    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.playSound(SoundEvents.ITEM_SPYGLASS_USE, 1.0f, 1.0f);
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        return ItemUsage.consumeHeldItem(world, user, hand);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        this.playStopUsingSound(user);
        return stack;
    }

    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        this.playStopUsingSound(user);
    }

    private void playStopUsingSound(LivingEntity user) {
        user.playSound(SoundEvents.ITEM_SPYGLASS_STOP_USING, 1.0f, 1.0f);
    }

}

