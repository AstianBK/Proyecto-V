package com.TBK.rk_herbs;

import com.TBK.rk_herbs.common.registers.MBBlocks;
import com.TBK.rk_herbs.common.registers.MBCreativeTabs;
import com.TBK.rk_herbs.common.registers.MBItems;
import com.TBK.rk_herbs.server.world.BKBlockStateProvider;
import com.TBK.rk_herbs.server.world.BKLootTableProvider;
import com.mojang.logging.LogUtils;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(RKHerbs.MODID)
public class RKHerbs
{
    public static final String MODID = "rk_herbs";
    private static final Logger LOGGER = LogUtils.getLogger();
    public RKHerbs()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MBItems.ITEMS.register(modEventBus);
        MBBlocks.BLOCKS.register(modEventBus);
        MBCreativeTabs.TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::dataSetup);
    }
    private void dataSetup(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        PackOutput packOutput = generator.getPackOutput();
        boolean includeServer = event.includeServer();
        generator.addProvider(includeServer, BKLootTableProvider.create(packOutput));
        generator.addProvider(includeServer, new BKBlockStateProvider(packOutput, existingFileHelper));
    }

}
