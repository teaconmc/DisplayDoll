package com.github.tartaricacid.swapadoll.init;

import com.github.tartaricacid.swapadoll.SwapADoll;
import com.github.tartaricacid.swapadoll.block.PlayerDollBlock;
import com.github.tartaricacid.swapadoll.blockentity.PlayerDollBlockEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public interface ModBlocks {
    DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SwapADoll.MOD_ID);
    DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, SwapADoll.MOD_ID);

    DeferredBlock<Block> PLAYER_DOLL = BLOCKS.register("player_doll", PlayerDollBlock::new);

    Supplier<BlockEntityType<PlayerDollBlockEntity>> PLAYER_DOLL_BE = BLOCK_ENTITIES.register("player_doll",
            () -> new BlockEntityType<>(PlayerDollBlockEntity::new, PLAYER_DOLL.get()));
}
