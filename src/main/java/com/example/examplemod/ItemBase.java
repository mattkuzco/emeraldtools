package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;


public class ItemBase extends Item
{
    ItemBase(String name)
    {
        this.setRegistryName(new ResourceLocation(ExampleMod.MODID, name));
        this.setUnlocalizedName(this.getRegistryName().toString());
        this.setCreativeTab(CreativeTabs.MISC);
    }
}