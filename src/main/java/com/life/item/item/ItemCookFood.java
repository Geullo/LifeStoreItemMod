package com.life.item.item;

import com.life.item.Event.KeyTyped;
import com.life.item.Main;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemCookFood extends ItemFood implements IHasModel {
    PotionEffect[] effects;
    public ItemCookFood(String name, int healHunger, CreativeTabs tab, PotionEffect... potionEffects)
    {
        super(healHunger,0.1f,false);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        ItemInit.ITEMS.add(this);
        this.effects = potionEffects;
    }

    @Override
    public void registeModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        if (worldIn.isRemote) return;
        if (effects==null) return;
        for (int i=0;i<effects.length;i++) player.addPotionEffect(new PotionEffect(effects[i]));
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        if (tooltip==null) return;
        if (KeyTyped.getInstance().KEY_PRESSED) {
            for (int i = 0; i < effects.length; i++) {
                int c = effects[i].getDuration() / 20;
                int d = c / 60;
                tooltip.add("§7" + I18n.translateToLocal(effects[i].getEffectName()) + " " + (effects[i].getAmplifier() + 1) + " ( " + (d > 0 ? d + "분 " + c % 60 + "초" : c + "초") + " )");
            }
        }
        else {
            if (effects.length<1) return;
            tooltip.add("§6§lSHIFT§f키를 눌러 효과들을 확인합니다.");
        }
    }
}
