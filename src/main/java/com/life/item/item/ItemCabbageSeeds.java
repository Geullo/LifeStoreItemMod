package com.life.item.item;

import com.life.item.Main;
import com.life.item.block.BlockInit;
import com.life.item.tab.HarvestCreativeTab;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class ItemCabbageSeeds extends Item implements IPlantable, IHasModel {

    public ItemCabbageSeeds(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(HarvestCreativeTab.CREATIVE_TABS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registeModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack stack = player.getHeldItem(hand);
        IBlockState state = worldIn.getBlockState(pos);
        if(facing == EnumFacing.UP && player.canPlayerEdit(pos.offset(facing), facing, stack) && state.getBlock().canSustainPlant(state, worldIn, pos, EnumFacing.UP, this) && worldIn.isAirBlock(pos.up()))
        {
            worldIn.setBlockState(pos.up(), BlockInit.cabbage_plant.getDefaultState());
            if(player.capabilities.isCreativeMode || !worldIn.isRemote)
                stack.shrink(1);
            return EnumActionResult.SUCCESS;
        }

        return EnumActionResult.FAIL;
    }

    @Override
    public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
        return EnumPlantType.Crop;
    }

    @Override
    public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
        return BlockInit.cabbage_plant.getDefaultState();
    }
}
