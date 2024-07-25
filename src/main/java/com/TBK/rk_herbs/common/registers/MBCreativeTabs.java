package com.TBK.rk_herbs.common.registers;

import com.TBK.rk_herbs.RKHerbs;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class MBCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RKHerbs.MODID);

    public static final RegistryObject<CreativeModeTab> MB_MOBS_TAB = TABS.register(RKHerbs.MODID,()-> CreativeModeTab.builder()
            .icon(()->new ItemStack(MBItems.ARNICA.get()))
            .title(Component.translatable("itemGroup.rk_herbs"))
            .displayItems((s,a)-> {
                a.accept(MBItems.YARROW.get());
                a.accept(MBItems.SAGE.get());
                a.accept(MBItems.YELLOW_WOOD_SORREL.get());
                a.accept(MBItems.LEMON_BALM.get());
                a.accept(MBItems.ARNICA.get());
                a.accept(MBItems.COMFREY.get());
            })
            .build());
}
