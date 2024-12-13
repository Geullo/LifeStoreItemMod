package com.life.item;

import com.life.item.Event.KeyTyped;
import com.life.item.item.ItemCookFood;
import com.life.item.item.ItemInit;
import com.life.item.item.ItemNatureFood;
import com.life.item.proxy.CommonProxy;
import com.life.item.util.Reference;
import com.life.item.util.SoundEffect;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraft.util.FoodStats;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import net.minecraftforge.registries.ForgeRegistry;

import javax.jws.soap.SOAPBinding;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

@Mod(name = Reference.NAME, modid = Reference.MOD_ID, version = Reference.VERSION)
public class Main {

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        proxy.init();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) throws NoSuchFieldException, IllegalAccessException {
        itemSaturation(Items.APPLE);
        itemSaturation(Items.GOLDEN_APPLE);
        itemSaturation(Items.MUSHROOM_STEW);
        itemSaturation(Items.BREAD);
        itemSaturation(Items.PORKCHOP);
        itemSaturation(Items.COOKED_PORKCHOP);
        itemSaturation(Items.FISH);
        itemSaturation(Items.COOKED_FISH);
        itemSaturation(Items.CAKE);
        itemSaturation(Items.COOKIE);
        itemSaturation(Items.MELON);
        itemSaturation(Items.BEEF);
        itemSaturation(Items.COOKED_BEEF);
        itemSaturation(Items.CHICKEN);
        itemSaturation(Items.COOKED_CHICKEN);
        itemSaturation(Items.ROTTEN_FLESH);
        itemSaturation(Items.SPIDER_EYE);
        itemSaturation(Items.CARROT);
        itemSaturation(Items.POTATO);
        itemSaturation(Items.BAKED_POTATO);
        itemSaturation(Items.COOKED_PORKCHOP);
        itemSaturation(Items.POISONOUS_POTATO);
        itemSaturation(Items.PUMPKIN_PIE);
        itemSaturation(Items.RABBIT);
        itemSaturation(Items.COOKED_RABBIT);
        itemSaturation(Items.RABBIT_STEW);
        itemSaturation(Items.MUTTON);
        itemSaturation(Items.COOKED_MUTTON);
        itemSaturation(Items.BEETROOT);
        itemSaturation(Items.BEETROOT_SOUP);
        itemSaturation(Items.CHORUS_FRUIT);
        itemSaturation(Items.SPIDER_EYE);
        itemSaturation(Items.GOLDEN_CARROT);
        itemSaturation(Items.SPECKLED_MELON);

    }

    public void itemSaturation(Item item1) throws NoSuchFieldException, IllegalAccessException {
        int amt = 1,amt2=3,amt3=2;
        if (item1 instanceof ItemAppleGold) {
            ItemAppleGold item = (ItemAppleGold) item1;
            Field field = item.getClass().getSuperclass().getDeclaredField("field_77853_b");
            field.setAccessible(true);
            field.set(item, 4);
            field.setAccessible(false);
        }
        else if (item1 instanceof ItemChorusFruit) {
            ItemChorusFruit item = (ItemChorusFruit) item1;
            Field field = item.getClass().getSuperclass().getDeclaredField("field_77853_b");
            field.setAccessible(true);
            field.set(item, amt);
            field.setAccessible(false);
        }
        else if (item1 instanceof ItemFishFood) {
            Field unCookedfield = ItemFishFood.FishType.SALMON.getClass().getDeclaredField("field_150991_j");
            Field cookedHealAmount = ItemFishFood.FishType.SALMON.getClass().getDeclaredField("field_150989_l");
            unCookedfield.setAccessible(true);
            unCookedfield.set(ItemFishFood.FishType.COD,amt);
            unCookedfield.set(ItemFishFood.FishType.SALMON,amt);
            unCookedfield.set(ItemFishFood.FishType.CLOWNFISH,amt);
            unCookedfield.set(ItemFishFood.FishType.PUFFERFISH,amt);
            unCookedfield.setAccessible(false);
            cookedHealAmount.setAccessible(true);
            cookedHealAmount.set(ItemFishFood.FishType.COD,amt2);
            cookedHealAmount.set(ItemFishFood.FishType.SALMON,amt2);
            cookedHealAmount.set(ItemFishFood.FishType.CLOWNFISH,amt2);
            cookedHealAmount.set(ItemFishFood.FishType.PUFFERFISH,amt2);
            cookedHealAmount.setAccessible(false);
        }
        else if (item1 instanceof ItemSoup) {
            ItemSoup item = (ItemSoup) item1;
            Field field = item.getClass().getSuperclass().getDeclaredField("field_77853_b");
            field.setAccessible(true);
            field.set(item, amt3);
            field.setAccessible(false);
        }
        else if (item1 instanceof ItemSeedFood) {
            ItemSeedFood item = (ItemSeedFood) item1;
            Field field = item.getClass().getSuperclass().getDeclaredField("field_77853_b");
            field.setAccessible(true);
            field.set(item, amt);
            field.setAccessible(false);
        } else if ((item1 instanceof ItemCookFood)||(item1 instanceof ItemNatureFood)) {
        } else if ((item1 instanceof ItemFood)) {
            ItemFood item = (ItemFood) item1;
            Field field = item.getClass().getDeclaredField("field_77853_b");
            if (item1.getUnlocalizedName().contains("Cooked")) {
                field.setAccessible(true);
                field.set(item, amt2);
                field.setAccessible(false);
            }
            else {
                field.setAccessible(true);
                field.set(item, amt);
                field.setAccessible(false);
            }
        }
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {

    }
}
