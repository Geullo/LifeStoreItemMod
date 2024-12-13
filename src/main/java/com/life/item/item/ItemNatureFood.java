package com.life.item.item;

import com.life.item.Main;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

public class ItemNatureFood extends ItemFood implements IHasModel{
    public ItemNatureFood(String name, CreativeTabs tab)
    {
        super(1,0.1f,false);
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
