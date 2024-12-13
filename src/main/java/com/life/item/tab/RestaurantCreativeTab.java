package com.life.item.tab;

import com.life.item.item.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class RestaurantCreativeTab extends CreativeTabs {

    public static final CreativeTabs CREATIVE_TABS = new RestaurantCreativeTab();

    public RestaurantCreativeTab()
    {
        super("CHEF");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.old_kimchi);
    }
}
