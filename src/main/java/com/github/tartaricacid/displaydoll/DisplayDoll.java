package com.github.tartaricacid.displaydoll;

import com.github.tartaricacid.displaydoll.init.ModBlocks;
import com.github.tartaricacid.displaydoll.init.ModItems;
import com.github.tartaricacid.displaydoll.init.ModTabs;
import com.github.tartaricacid.displaydoll.network.NetworkHandler;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(DisplayDoll.MOD_ID)
public class DisplayDoll {
    public static final String MOD_ID = "displaydoll";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public DisplayDoll(IEventBus eventBus, ModContainer modContainer) {
        ModBlocks.BLOCKS.register(eventBus);
        ModBlocks.BLOCK_ENTITIES.register(eventBus);
        ModItems.ITEMS.register(eventBus);
        ModTabs.TABS.register(eventBus);

        eventBus.addListener(NetworkHandler::registerPacket);
    }
}