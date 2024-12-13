package com.life.item.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class LandSelector extends ItemBase implements IHasModel{

    public LandSelector() {
        super("land_selector",CreativeTabs.TOOLS);
        setMaxStackSize(1);
    }

    @Nullable
    @Override
    public CreativeTabs getCreativeTab() {
        return CreativeTabs.TOOLS;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add("§7손에 들시 구매 혹은 업그레이드 가능한 땅이 보이며,");
        tooltip.add("§7땅을 보고 좌클릭시 UI가 뜨게 됩니다.");
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
