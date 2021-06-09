package com.xoayer.storeofneedfulthings.core.init;

import com.xoayer.storeofneedfulthings.StoreOfNeedfulThings;
import com.xoayer.storeofneedfulthings.common.items.Trinket;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =  DeferredRegister.create(ForgeRegistries.ITEMS,
            StoreOfNeedfulThings.MOD_ID);

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties().tab(StoreOfNeedfulThings.SONT_GROUP)));

    public static final RegistryObject<Trinket> TRINKET = ITEMS.register("trinket",
            () -> new Trinket(new Item.Properties().tab(StoreOfNeedfulThings.SONT_GROUP)));

    //Block items
    public static final RegistryObject<BlockItem> TEST_BLOCK = ITEMS.register("test_block", () -> new BlockItem(BlockInit.TEST_BLOCK.get(), new Item.Properties().tab(StoreOfNeedfulThings.SONT_GROUP)));
}
