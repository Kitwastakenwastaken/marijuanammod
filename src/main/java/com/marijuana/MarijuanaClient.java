package com.marijuana;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import com.marijuana.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class MarijuanaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.cannabiscrop, RenderLayer.getCutout());
    }
}
