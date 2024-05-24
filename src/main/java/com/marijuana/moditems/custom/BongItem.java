package com.marijuana.moditems.custom;

import com.marijuana.Marijuana;
import com.marijuana.sound.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import javax.naming.Context;

public class BongItem extends Item {

    public BongItem(Settings settings) {
        super(settings);

    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.addStatusEffect(new StatusEffectInstance(Marijuana.HIGH,3000, 0));
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,120, 0));
        user.playSound(ModSounds.BONG_LIT, 0.50F, 1.0F);

        return TypedActionResult.success(user.getStackInHand(hand));

    }

}

