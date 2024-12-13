package com.life.item.item;

import com.life.item.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name, CreativeTabs tab)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registeModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
