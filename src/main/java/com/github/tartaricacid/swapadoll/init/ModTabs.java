package com.github.tartaricacid.swapadoll.init;

import com.github.tartaricacid.swapadoll.SwapADoll;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public interface ModTabs {
    DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SwapADoll.MOD_ID);

    DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN_TAB = TABS.register("swapadoll", () -> CreativeModeTab.builder()
            .title(Component.translatable("item_group.swapadoll"))
            .icon(() -> new ItemStack(ModItems.PLAYER_DOLL.get()))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.PLAYER_DOLL.get());
            }).build());
}
