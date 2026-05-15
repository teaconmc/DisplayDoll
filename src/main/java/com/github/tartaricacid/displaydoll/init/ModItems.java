package com.github.tartaricacid.displaydoll.init;

import com.github.tartaricacid.displaydoll.DisplayDoll;
import com.github.tartaricacid.displaydoll.item.PlayerDollItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public interface ModItems {
    DeferredRegister.Items ITEMS = DeferredRegister.createItems(DisplayDoll.MOD_ID);

    DeferredItem<Item> PLAYER_DOLL = ITEMS.register("player_doll", PlayerDollItem::new);
}
