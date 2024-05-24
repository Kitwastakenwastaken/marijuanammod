package com.marijuana.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import com.marijuana.block.ModBlocks;
import com.marijuana.block.custom.cannabiscropblock;
import com.marijuana.moditems.ModItems;

import net.minecraft.loot.condition.BlockStatePropertyLootCondition;

import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.cannabiscrop).properties(StatePredicate.Builder.create()
                .exactMatch(cannabiscropblock.AGE, 7));
        addDrop(ModBlocks.cannabiscrop, cropDrops(ModBlocks.cannabiscrop, ModItems.WEED, ModItems.CANNABISSEEDS, builder));
    }
}

