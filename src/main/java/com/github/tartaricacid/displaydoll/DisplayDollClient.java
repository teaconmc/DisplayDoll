package com.github.tartaricacid.displaydoll;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(value = DisplayDoll.MOD_ID, dist = Dist.CLIENT)
public class DisplayDollClient {
    public DisplayDollClient(IEventBus modEventBus, ModContainer modContainer) {
    }
}