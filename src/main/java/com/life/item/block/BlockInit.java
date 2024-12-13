package com.life.item.block;

import com.life.item.tab.HarvestCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block aquamarine_ore = new BlockBase("aquamarine_ore", Material.IRON,HarvestCreativeTab.CREATIVE_TABS, 1.5f);
    public static final Block ruby_ore = new BlockBase("lifeitem_rubys_ore", Material.IRON,HarvestCreativeTab.CREATIVE_TABS, 1.5f);
    public static final Block silver_ore = new BlockBase("silver_ore", Material.IRON,HarvestCreativeTab.CREATIVE_TABS, 1.5f);
    public static final Block topaz_ore = new BlockBase("topaz_ore", Material.IRON,HarvestCreativeTab.CREATIVE_TABS, 1.5f);
    public static final BlockRicePlant rice_plant = new BlockRicePlant("rice_plant");
    public static final BlockCabbagePlant cabbage_plant = new BlockCabbagePlant("cabbage_plant");
    public static final BlockChiliPlant chili_plant = new BlockChiliPlant("chili_plant");
    public static final BlockChiliPlant pepper_plant = new BlockChiliPlant("pepper_plant");
    public static final BlockBarelyPlant barely_plant = new BlockBarelyPlant("barely_plant");
}
