package com.github.tartaricacid.displaydoll.client.init;

import com.github.tartaricacid.displaydoll.DisplayDoll;
import com.github.tartaricacid.displaydoll.client.renderer.PlayerDollBlockRenderer;
import com.github.tartaricacid.displaydoll.client.renderer.PlayerDollItemRenderer;
import com.github.tartaricacid.displaydoll.init.ModBlocks;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.resources.Identifier;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterSpecialModelRendererEvent;

@EventBusSubscriber(modid = DisplayDoll.MOD_ID, value = Dist.CLIENT)
public class ClientSetup {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent evt) {
        BlockEntityRenderers.register(ModBlocks.PLAYER_DOLL_BE.get(), PlayerDollBlockRenderer::new);
    }

    @SubscribeEvent
    public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
    }

    @SubscribeEvent
    public static void registerSpecialModel(RegisterSpecialModelRendererEvent event) {
        event.register(Identifier.fromNamespaceAndPath(DisplayDoll.MOD_ID, "player_doll"), PlayerDollItemRenderer.Unbaked.MAP_CODEC);
    }
}
