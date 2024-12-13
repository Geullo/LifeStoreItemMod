package com.life.item.tab;

import com.life.item.item.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class AlcholCreativeTab extends CreativeTabs {

    public static final CreativeTabs CREATIVE_TABS = new AlcholCreativeTab();

    public AlcholCreativeTab()
    {
        super("BARKEEPER");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.shangria);
    }
}
