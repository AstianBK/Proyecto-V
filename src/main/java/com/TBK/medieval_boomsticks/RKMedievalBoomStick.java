package com.TBK.medieval_boomsticks;

import com.TBK.medieval_boomsticks.common.registers.MBBlocks;
import com.TBK.medieval_boomsticks.common.registers.MBCreativeTabs;
import com.TBK.medieval_boomsticks.common.registers.MBItems;
import com.TBK.medieval_boomsticks.server.world.BKBlockStateProvider;
import com.TBK.medieval_boomsticks.server.world.BKLootTableProvider;
import com.mojang.logging.LogUtils;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(RKMedievalBoomStick.MODID)
public class RKMedievalBoomStick
{
    public static final String MODID = "medieval_boomsticks";
    private static final Logger LOGGER = LogUtils.getLogger();
    public RKMedievalBoomStick()
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
