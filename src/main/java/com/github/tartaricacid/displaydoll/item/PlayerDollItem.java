package com.github.tartaricacid.displaydoll.item;

import com.github.tartaricacid.displaydoll.init.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;

public class PlayerDollItem extends BlockItem {
    public PlayerDollItem(Identifier id) {
        var key = ResourceKey.create(Registries.ITEM, id);
        var properties = new Properties().setId(key);
        super(ModBlocks.PLAYER_DOLL.get(), properties);
    }
}
