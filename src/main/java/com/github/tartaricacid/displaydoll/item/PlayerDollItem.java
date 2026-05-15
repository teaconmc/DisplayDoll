package com.github.tartaricacid.displaydoll.item;

import com.github.tartaricacid.displaydoll.init.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;

public class PlayerDollItem extends BlockItem {
    public PlayerDollItem(Identifier id) {
        var key = ResourceKey.create(Registries.ITEM, id);
        var properties = new Properties().setId(key);
        super(ModBlocks.PLAYER_DOLL.get(), properties);
    }

    @Override
    public boolean canEquip(ItemStack stack, EquipmentSlot armorType, LivingEntity entity) {
        if (armorType == EquipmentSlot.HEAD) {
            return true;
        }
        return super.canEquip(stack, armorType, entity);
    }
}
