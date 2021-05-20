package com.xoayer.storeofneedfulthings.core.init;

import com.sun.org.apache.xerces.internal.dom.DeferredElementDefinitionImpl;
import com.xoayer.storeofneedfulthings.StoreOfNeedfulThings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, StoreOfNeedfulThings.MOD_ID);

    public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block",
            () -> new Block(AbstractBlock.Properties.of(Material.METAL,
                    MaterialColor.LAPIS)
                    .strength(15.0f)
                    .harvestLevel(3)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.METAL)
            ));
}

