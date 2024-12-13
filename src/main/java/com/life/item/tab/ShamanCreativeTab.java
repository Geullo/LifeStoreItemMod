package com.life.item.tab;

import com.life.item.item.ItemInit;
import com.life.item.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ShamanCreativeTab extends CreativeTabs {

    public static final CreativeTabs CREATIVE_TABS = new ShamanCreativeTab();

    public ShamanCreativeTab()
    {
        super("SHAMAN");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.fan);
    }
}
