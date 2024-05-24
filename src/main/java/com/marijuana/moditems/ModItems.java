package com.marijuana.moditems;

import com.marijuana.Marijuana;
import com.marijuana.block.ModBlocks;
import com.marijuana.moditems.ModToolMaterial;
import com.marijuana.moditems.custom.BluntItem;
import com.marijuana.moditems.custom.BongItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpyglassItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CANNABISSEEDS = registerItem("cannabisseeds", new AliasedBlockItem(ModBlocks.cannabiscrop, new FabricItemSettings()));
    public static final Item BONG = registerItem("bong", new BongItem(new FabricItemSettings()));
    public static final Item WEED = registerItem("weed", new Item(new FabricItemSettings().food(ModFoodComponents.WEED)));
    public static final Item BLUNT = registerItem("blunt", new Item(new FabricItemSettings().food(ModFoodComponents.BLUNT)));
    public static final Item BUD = registerItem("bud", new Item(new FabricItemSettings().food(ModFoodComponents.BUD)));
    public static final Item BROWNIE = registerItem("brownie", new Item(new FabricItemSettings().food(ModFoodComponents.BROWNIE)));
    public static final Item WEEDBROWNIE = registerItem("weedbrownie", new Item(new FabricItemSettings().food(ModFoodComponents.WEEDBROWNIE)));
    public static final Item WEEDCOOKIE = registerItem("weedcookie", new Item(new FabricItemSettings().food(ModFoodComponents.WEEDCOOKIE)));
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CANNABISSEEDS);
        entries.add(BONG);
        entries.add(WEED);
        entries.add(BLUNT);
        entries.add(BUD);
        entries.add(BROWNIE);
        entries.add(WEEDBROWNIE);
        entries.add(WEEDCOOKIE);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Marijuana.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Marijuana.LOGGER.info("Registering Mod Items for" + Marijuana.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
