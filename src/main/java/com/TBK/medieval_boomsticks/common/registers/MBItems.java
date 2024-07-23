package com.TBK.medieval_boomsticks.common.registers;

import com.TBK.medieval_boomsticks.RKMedievalBoomStick;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MBItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RKMedievalBoomStick.MODID);

    //SEEDS
    public static final RegistryObject<Item> SAGE_SEEDS = ITEMS.register("sage_seeds",
            ()-> new ItemNameBlockItem(MBBlocks.SAGE_CROP_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> YARROW_SEEDS = ITEMS.register("yarrow_seeds",
            ()-> new ItemNameBlockItem(MBBlocks.YARROW_CROP_BLOCK.get(), new Item.Properties()));


    public static final RegistryObject<Item> ARNICA_SEEDS = ITEMS.register("arnica_seeds",
            ()-> new ItemNameBlockItem(MBBlocks.ARNICA_CROP_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> LEMON_BALM_SEEDS = ITEMS.register("lemon_balm_seeds",
            ()-> new ItemNameBlockItem(MBBlocks.LEMON_BALM_CROP_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> COMFREY_SEEDS = ITEMS.register("comfrey_seeds",
            ()-> new ItemNameBlockItem(MBBlocks.COMFREY_CROP_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> YELLOW_WOOD_SORREL_SEEDS = ITEMS.register("yellow_wood_sorrel_seeds",
            ()-> new ItemNameBlockItem(MBBlocks.YELLOW_WOOD_SORREL_CROP_BLOCK.get(), new Item.Properties()));

    //FOOD
    public static final RegistryObject<Item> SAGE = ITEMS.register("sage",
            ()->new Item(new Item.Properties().food((new FoodProperties.Builder().nutrition(12).saturationMod(0.1F).build()))));
    public static final RegistryObject<Item> YARROW = ITEMS.register("yarrow",
            ()->new Item(new Item.Properties().food((new FoodProperties.Builder().nutrition(12).saturationMod(0.1F).build()))));

    public static final RegistryObject<Item> ARNICA = ITEMS.register("arnica",
            ()->new Item(new Item.Properties().food((new FoodProperties.Builder().nutrition(12).saturationMod(0.1F).build()))));
    public static final RegistryObject<Item> LEMON_BALM = ITEMS.register("lemon_balm",
            ()->new Item(new Item.Properties().food((new FoodProperties.Builder().nutrition(12).saturationMod(0.1F).build()))));

    public static final RegistryObject<Item> COMFREY = ITEMS.register("comfrey",
            ()->new Item(new Item.Properties().food((new FoodProperties.Builder().nutrition(12).saturationMod(0.1F).build()))));
    public static final RegistryObject<Item> YELLOW_WOOD_SORREL = ITEMS.register("yellow_wood_sorrel",
            ()->new Item(new Item.Properties().food((new FoodProperties.Builder().nutrition(12).saturationMod(0.1F).build()))));

}
