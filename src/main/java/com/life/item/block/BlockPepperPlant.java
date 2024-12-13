package com.life.item.block;

import com.life.item.item.ItemInit;
import com.sun.javafx.sg.prism.NodeEffectInput;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockModelRenderer;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.pipeline.ForgeBlockModelRenderer;

import java.util.Random;

public class BlockPepperPlant extends BlockCrops
{
    public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 7);
    private static final AxisAlignedBB[] CROP_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.15D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.2D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.3D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.35D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D),new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1D, 1.0D)};

    public BlockPepperPlant(String name)
    {
        super();
        this.setUnlocalizedName(name);
        this.setRegistryName(name);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
    @Override
    protected boolean canSustainBush(IBlockState state)
    {
        return state.getBlock() == Blocks.FARMLAND;
    }
    @Override
    public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state) {
        return super.canBlockStay(worldIn, pos, state);
    }
    @Override
    protected PropertyInteger getAgeProperty()
    {
        return AGE;
    }
    @Override
    public int getMaxAge()
    {
        return 7;
    }
    @Override
    protected Item getSeed()
    {
        return ItemInit.seeds_pepper;
    }
    @Override
    protected Item getCrop()
    {
        return ItemInit.pepper;
    }
    @Override
    protected int getBonemealAgeIncrease(World worldIn)
    {
        return MathHelper.getInt(worldIn.rand, 1, 3);
    }
    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {AGE});
    }
    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return CROP_AABB[(state.getValue(getAgeProperty())).intValue()];
    }

    @Override
    public IBlockState withAge(int age) {
        return getDefaultState().withProperty(getAgeProperty(), Integer.valueOf(age));
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote&&(state.getValue(getAgeProperty())).intValue()==7) {
            ItemStack crop = new ItemStack(getCrop(), new Random().nextInt(3) + 1);
            ItemStack seed = new ItemStack(getSeed(),new Random().nextInt(3) + 1);
            EntityItem cropEntity = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), crop);
            EntityItem seedEntity = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), seed);
            worldIn.setBlockState(pos, withAge(0));
            worldIn.spawnEntity(cropEntity);
            worldIn.spawnEntity(seedEntity);
        }
        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
    }
}
