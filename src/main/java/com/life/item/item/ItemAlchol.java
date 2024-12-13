package com.life.item.item;

import com.life.item.Event.KeyTyped;
import com.life.item.tab.AlcholCreativeTab;
import java.util.Arrays;

import com.life.item.util.PotionInit;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemChorusFruit;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemAlchol extends ItemBase{
    PotionEffect[] effects;
    int nauseaDuration;
    public ItemAlchol(String name, double nauseaDuration, PotionEffect... effects) {
        super(name, AlcholCreativeTab.CREATIVE_TABS);

        this.effects = effects;
        this.nauseaDuration = (int) (20*nauseaDuration);
        setMaxStackSize(64);
        ItemInit.ITEMS.add(this);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
        if (!worldIn.isRemote) {
            playerIn.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:nausea"), nauseaDuration,1,true,true));
            playerIn.getHeldItem(handIn).shrink(1);
            if (effects==null) return new ActionResult<>(EnumActionResult.SUCCESS,playerIn.getHeldItem(handIn));
            for (int i=0;i<effects.length;i++) {
                if (effects[i].getEffectName().contains("stat_upgrade")) {
                    playerIn.addPotionEffect(new PotionEffect(Potion.getPotionFromResourceLocation("workercrafttable:stat_upgrade"),effects[i].getDuration(),0,true,true));
                }
                else playerIn.addPotionEffect(new PotionEffect(effects[i]));
            }
            playerIn.getCooldownTracker().setCooldown(this,15);
            return new ActionResult<>(EnumActionResult.SUCCESS,playerIn.getHeldItem(handIn));
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        if (tooltip==null) return;
        if (KeyTyped.getInstance().KEY_PRESSED) {
            int a = nauseaDuration / 20;
            int b = a / 60;
            tooltip.add("§7멀미 1 ( " + (b > 0 ? b + "분 " + a % 60 + "초" : a + "초") + " )");
            for (int i = 0; i < effects.length; i++) {
                if (effects[i]!=null) {
                    int c = effects[i].getDuration() / 20;
                    int d = c / 60;
                    tooltip.add("§7" + I18n.translateToLocal(effects[i].getEffectName()) + " " + (effects[i].getAmplifier() + 1) + " ( " + (d > 0 ? d + "분 " + c % 60 + "초" : c + "초") + " )");
                }
            }
        }
        else {
            tooltip.add("§6§lSHIFT§f키를 눌러 효과들을 확인합니다.");
        }
    }
}
