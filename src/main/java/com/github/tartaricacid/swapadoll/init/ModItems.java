package com.github.tartaricacid.swapadoll.init;

import com.github.tartaricacid.swapadoll.SwapADoll;
import com.github.tartaricacid.swapadoll.item.PlayerDollItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public interface ModItems {
    DeferredRegister.Items ITEMS = DeferredRegister.createItems(SwapADoll.MOD_ID);

    DeferredItem<Item> PLAYER_DOLL = ITEMS.register("player_doll", PlayerDollItem::new);
}
