package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class ModBlock extends Block
{
    ModBlock(Material material, String blockName)
    {
        super(material);
        this.setRegistryName(new ResourceLocation(ExampleMod.MODID, blockName));
        this.setUnlocalizedName(blockName);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}