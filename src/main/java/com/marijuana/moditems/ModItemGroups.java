package com.marijuana.moditems;

import com.marijuana.Marijuana;
import com.marijuana.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup weed_group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Marijuana.MOD_ID, "weed"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.weed"))
                    .icon(() -> new ItemStack(ModItems.WEED)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CANNABISSEEDS);
                        entries.add(ModItems.WEED);
                        entries.add(ModItems.BLUNT);
                        entries.add(ModItems.BUD);
                        entries.add(ModItems.BROWNIE);
                        entries.add(ModItems.WEEDBROWNIE);
                        entries.add(ModItems.WEEDCOOKIE);
                        entries.add(ModItems.BONG);
                    }).build());

    public static void registerItemGroups() {
        Marijuana.LOGGER.info("Registering Mod Items for" + Marijuana.MOD_ID);
    }
}
