package com.life.item.tab;

import com.life.item.item.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DesignCreativeTab extends CreativeTabs {

    public static final CreativeTabs CREATIVE_TABS = new DesignCreativeTab();

    public DesignCreativeTab()
    {
        super("DESIGNER");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.leather_jacket);
    }
}
