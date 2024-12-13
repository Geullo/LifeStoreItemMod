package com.life.item.item;

import com.life.item.Main;
import com.life.item.util.SoundEffect;
import net.minecraft.block.BlockJukebox;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemArtistCD extends ItemRecord implements IHasModel
{
    protected SoundEvent sound;
    public ItemArtistCD(String name, CreativeTabs tab) {
        super(name, SoundEffect.getCD(name));
        this.sound = SoundEffect.getCD(name);
        setCreativeTab(tab);
        setUnlocalizedName(name);
        setRegistryName(name);
        setMaxStackSize(64);
        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registeModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
