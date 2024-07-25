package com.TBK.rk_herbs.common.registers;

import com.TBK.rk_herbs.RKHerbs;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MBItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RKHerbs.MODID);

    //SEEDS
    public static final RegistryObject<Item> SAGE = ITEMS.register("sage",
            ()-> new ItemNameBlockItem(MBBlocks.SAGE_CROP_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> YARROW = ITEMS.register("yarrow",
            ()-> new ItemNameBlockItem(MBBlocks.YARROW_CROP_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> ARNICA = ITEMS.register("arnica",
            ()-> new ItemNameBlockItem(MBBlocks.ARNICA_CROP_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> LEMON_BALM = ITEMS.register("lemon_balm",
            ()-> new ItemNameBlockItem(MBBlocks.LEMON_BALM_CROP_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> COMFREY = ITEMS.register("comfrey",
            ()-> new ItemNameBlockItem(MBBlocks.COMFREY_CROP_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> YELLOW_WOOD_SORREL = ITEMS.register("yellow_wood_sorrel",
            ()-> new ItemNameBlockItem(MBBlocks.YELLOW_WOOD_SORREL_CROP_BLOCK.get(), new Item.Properties()));

}
