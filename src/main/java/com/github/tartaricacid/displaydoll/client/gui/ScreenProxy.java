package com.github.tartaricacid.displaydoll.client.gui;

import com.github.tartaricacid.displaydoll.blockentity.PlayerDollBlockEntity;
import net.neoforged.fml.loading.FMLEnvironment;

public class ScreenProxy {
    public static void openPlayerDollScreen(PlayerDollBlockEntity blockEntity) {
        if (FMLEnvironment.getDist().isClient()) {
            PlayerDollScreen.open(blockEntity);
        }
    }
}
