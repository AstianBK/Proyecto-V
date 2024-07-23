package com.TBK.medieval_boomsticks.server.world;

import com.TBK.medieval_boomsticks.common.blocks.*;
import com.TBK.medieval_boomsticks.common.registers.MBBlocks;
import com.TBK.medieval_boomsticks.common.registers.MBItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class BKBlockLootTables extends BlockLootSubProvider {
    public BKBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(MBBlocks.SAGE_CROP_BLOCK.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SageCropBlock.AGE, 4));

        LootItemCondition.Builder lootitemcondition$builder1 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(MBBlocks.YARROW_CROP_BLOCK.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(YarrowCropBlock.AGE, 4));

        LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(MBBlocks.COMFREY_CROP_BLOCK.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(ComfreyCropBlock.AGE, 4));

        LootItemCondition.Builder lootitemcondition$builder3 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(MBBlocks.ARNICA_CROP_BLOCK.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(ArnicaCropBlock.AGE, 4));

        LootItemCondition.Builder lootitemcondition$builder4 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(MBBlocks.LEMON_BALM_CROP_BLOCK.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(LemonBalmCropBlock.AGE, 4));

        LootItemCondition.Builder lootitemcondition$builder5 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(MBBlocks.YELLOW_WOOD_SORREL_CROP_BLOCK.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(YellowWoodSorrelCropBlock.AGE, 3));

        this.add(MBBlocks.SAGE_CROP_BLOCK.get(), createCropDrops(MBBlocks.SAGE_CROP_BLOCK.get(),MBItems.SAGE.get(), MBItems.SAGE_SEEDS.get(),
                 lootitemcondition$builder));

        this.add(MBBlocks.YARROW_CROP_BLOCK.get(), createCropDrops(MBBlocks.YARROW_CROP_BLOCK.get(),MBItems.YARROW.get(), MBItems.YARROW_SEEDS.get(),
                 lootitemcondition$builder1));

        this.add(MBBlocks.SAGE_CROP_BLOCK.get(), createCropDrops(MBBlocks.COMFREY_CROP_BLOCK.get(),MBItems.COMFREY.get(), MBItems.COMFREY_SEEDS.get(),
                 lootitemcondition$builder2));

        this.add(MBBlocks.ARNICA_CROP_BLOCK.get(), createCropDrops(MBBlocks.ARNICA_CROP_BLOCK.get(),MBItems.ARNICA.get(), MBItems.ARNICA_SEEDS.get(),
                 lootitemcondition$builder3));

        this.add(MBBlocks.LEMON_BALM_CROP_BLOCK.get(), createCropDrops(MBBlocks.LEMON_BALM_CROP_BLOCK.get(),MBItems.LEMON_BALM.get(), MBItems.LEMON_BALM_SEEDS.get(),
                 lootitemcondition$builder4));

        this.add(MBBlocks.YELLOW_WOOD_SORREL_CROP_BLOCK.get(), createCropDrops(MBBlocks.YELLOW_WOOD_SORREL_CROP_BLOCK.get(),MBItems.YELLOW_WOOD_SORREL.get(), MBItems.YELLOW_WOOD_SORREL_SEEDS.get(),
                 lootitemcondition$builder5));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MBBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
