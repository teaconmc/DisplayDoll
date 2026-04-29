package com.github.tartaricacid.swapadoll.client.renderer;

import com.github.tartaricacid.swapadoll.blockentity.PlayerDollBlockEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.state.level.CameraRenderState;

public class PlayerDollBlockRenderer implements BlockEntityRenderer<PlayerDollBlockEntity, PlayerDollRenderState> {
    @Override
    public PlayerDollRenderState createRenderState() {
        return null;
    }

    @Override
    public void submit(PlayerDollRenderState state, PoseStack poseStack, SubmitNodeCollector submitNodeCollector, CameraRenderState camera) {
    }
}