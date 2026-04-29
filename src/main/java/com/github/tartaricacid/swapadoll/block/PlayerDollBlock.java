package com.github.tartaricacid.swapadoll.block;

import com.github.tartaricacid.swapadoll.blockentity.PlayerDollBlockEntity;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.Nullable;

public class PlayerDollBlock extends HorizontalDirectionalBlock implements EntityBlock {
    public static final MapCodec<PlayerDollBlock> CODEC = simpleCodec(PlayerDollBlock::new);

    public PlayerDollBlock(Properties properties) {
        super(properties);
        BlockState state = this.stateDefinition.any()
                .setValue(FACING, Direction.NORTH);
        this.registerDefaultState(state);
    }

    public PlayerDollBlock(Identifier id) {
        Properties properties = Properties.of()
                .setId(ResourceKey.create(Registries.BLOCK, id))
                .sound(SoundType.STONE)
                .strength(0.5f)
                .noOcclusion();
        this(properties);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    @Nullable
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new PlayerDollBlockEntity(blockPos, blockState);
    }
}
