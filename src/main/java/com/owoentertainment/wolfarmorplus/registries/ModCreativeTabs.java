package com.owoentertainment.wolfarmorplus.registries;

import com.owoentertainment.wolfarmorplus.WolfArmorPlus;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WolfArmorPlus.MOD_ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MOD_TAB = CREATIVE_MODE_TABS.register("wolf_armors", () -> CreativeModeTab.builder()
        .title(Component.translatable("itemGroup.wolfarmorplus"))
        .withTabsBefore(net.minecraft.world.item.CreativeModeTabs.COMBAT)
        .displayItems((parameters, output) -> {
            output.accept(ModItems.BONE_WOLF_ARMOR);
            output.accept(ModItems.MOSSY_WOLF_ARMOR);
            output.accept(ModItems.TURTLE_WOLF_ARMOR);
            output.accept(ModItems.CHAIN_WOLF_ARMOR);
            output.accept(ModItems.UPGRADE_BLUEPRINT);
            //output.accept(ModItems.LEATHER_WOLF_ARMOR);
            //output.accept(ModItems.COPPER_WOLF_ARMOR);
            //output.accept(ModItems.IRON_WOLF_ARMOR);
            //output.accept(ModItems.GOLD_WOLF_ARMOR);
            //output.accept(ModItems.DIAMOND_WOLF_ARMOR);
            //output.accept(ModItems.NETHERITE_WOLF_ARMOR);
        }).build()
    );
    public static void registerCreativeTabs(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
