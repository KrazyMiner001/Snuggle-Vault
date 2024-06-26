package tech.krazyminer001;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import tech.krazyminer001.block.SnuggleVaultBlocks;
import tech.krazyminer001.screen.SnuggleVaultScreens;

public class SnuggleVaultClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        SnuggleVaultScreens.registerScreens();

        BlockRenderLayerMap.INSTANCE.putBlocks(
                RenderLayer.getCutout(),
                SnuggleVaultBlocks.SNUGGLE_VAULT
        );

        BlockRenderLayerMap.INSTANCE.putBlocks(
                RenderLayer.getTranslucent(),
                SnuggleVaultBlocks.GACHA_MACHINE
        );

    }
}
