package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EmeraldItems extends ItemBase {
    public EmeraldItems(String itemName, String toolType, int toolStrength)
    {
        super(itemName);
        this.setCreativeTab(CreativeTabs.TOOLS);
        this.setHarvestLevel(toolType, toolStrength);
    }
}
