package com.life.item.item;

import com.life.item.tab.*;
import com.life.item.util.PotionInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Item golden_necklace = new ItemBase("golden_necklace", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item golden_ring = new ItemBase("golden_ring", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item diamond_necklace = new ItemBase("diamond_necklace", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item diamond_ring = new ItemBase("diamond_ring", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item rose_golden_necklace = new ItemBase("rose_golden_necklace", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item rose_golden_ring = new ItemBase("rose_golden_ring", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item ruby_necklace = new ItemBase("ruby_necklace", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item ruby_ring = new ItemBase("ruby_ring", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item aqua_marin_necklace = new ItemBase("aqua_marin_necklace", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item aqua_marin_ring = new ItemBase("aqua_marin_ring", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item silver_necklace = new ItemBase("silver_necklace", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item silver_ring = new ItemBase("silver_ring", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item normal_necklace = new ItemBase("normal_necklace", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item normal_ring = new ItemBase("normal_ring", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item topaz_necklace = new ItemBase("topaz_necklace", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item topaz_ring = new ItemBase("topaz_ring", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item chung_necklace = new ItemBase("chung_necklace", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item lemon_ring = new ItemBase("lemon_ring", JewelerCreativeTab.CREATIVE_TABS);
    public static final Item rose_necklace = new ItemBase("rose_necklace", JewelerCreativeTab.CREATIVE_TABS);

    public static final Item luxury_daisy_sac = new ItemBase("luxury_daisy_sac", ShamanCreativeTab.CREATIVE_TABS);
    public static final Item luxury_lavender_sac = new ItemBase("luxury_lavender_sac", ShamanCreativeTab.CREATIVE_TABS);
    public static final Item luxury_rose_sac = new ItemBase("luxury_rose_sac", ShamanCreativeTab.CREATIVE_TABS);
    public static final Item daisy_sac = new ItemBase("daisy_sac", ShamanCreativeTab.CREATIVE_TABS);
    public static final Item lavender_sac = new ItemBase("lavender_sac", ShamanCreativeTab.CREATIVE_TABS);
    public static final Item rose_sac = new ItemBase("rose_sac", ShamanCreativeTab.CREATIVE_TABS);
    public static final Item beads = new ItemBase("beads", ShamanCreativeTab.CREATIVE_TABS);
    public static final Item beads_ball = new ItemBase("beads_ball", ShamanCreativeTab.CREATIVE_TABS);
    public static final Item shaman_bubble = new ItemBase("shaman_bubble", ShamanCreativeTab.CREATIVE_TABS);
    public static final Item bubble = new ItemBase("bubble", ShamanCreativeTab.CREATIVE_TABS);
    public static final Item pocket = new ItemBase("pocket", ShamanCreativeTab.CREATIVE_TABS);
    public static final Item charm = new ItemBase("charm", ShamanCreativeTab.CREATIVE_TABS);
    public static final Item korean_paper = new ItemBase("korean_paper", ShamanCreativeTab.CREATIVE_TABS);
    public static final Item fan = new ItemBase("fan", ShamanCreativeTab.CREATIVE_TABS);
    public static final Item dream_catcher = new ItemBase("dream_catcher", ShamanCreativeTab.CREATIVE_TABS);
    public static final ItemLore favor_charm = new ItemLore("favor_charm", ShamanCreativeTab.CREATIVE_TABS,"§f우클릭 시 무당은 특정 플레이어가 오늘 획득한 호감도 점수를 확인할수 있습니다.","§f","§f다른 플레이어는 오늘 본인이 획득한 호감도 점수를 확인 합니다.");
    public static final Item lemon_diffuser = new ItemBase("lemon_diffuser", ShamanCreativeTab.CREATIVE_TABS);
    public static final ItemLore manneung_charm = new ItemLore("manneung_charm", ShamanCreativeTab.CREATIVE_TABS,"§f가장 최근에 본인에게 적용된 §c호감도 쿠폰§f 결과를 알수 있습니다.");
    public static final Item luxury_beads = new ItemBase("luxury_beads", ShamanCreativeTab.CREATIVE_TABS);
    public static final Item luxury_beads_ball = new ItemBase("luxury_beads_ball", ShamanCreativeTab.CREATIVE_TABS);
    public static final Item mubok = new ItemBase("mubok", ShamanCreativeTab.CREATIVE_TABS);
    public static final ItemLore curse_doll = new ItemLore("curse_doll", ShamanCreativeTab.CREATIVE_TABS,"§f우클릭 시 특정 플레이어에게 §c§kas d§f양 저주를 걸 수 있습니다.");
    public static final Item bread = new ItemBase("bread", SuperCreativeTab.CREATIVE_TABS);
    public static final Item egg_bread = new ItemBase("egg_bread", SuperCreativeTab.CREATIVE_TABS);
    public static final Item chocolate_bread = new ItemBase("chocolate_bread", SuperCreativeTab.CREATIVE_TABS);
    public static final Item hot_bread = new ItemBase("hot_bread", SuperCreativeTab.CREATIVE_TABS);
    public static final Item noodle = new ItemBase("noodle", SuperCreativeTab.CREATIVE_TABS);
    public static final Item hot_noodle = new ItemBase("hot_noodle", SuperCreativeTab.CREATIVE_TABS);
    public static final Item sampo_flour = new ItemBase("sampo_flour", SuperCreativeTab.CREATIVE_TABS);
    public static final Item rice = new ItemBase("rice", SuperCreativeTab.CREATIVE_TABS);
    public static final Item chocolate = new ItemBase("chocolate", SuperCreativeTab.CREATIVE_TABS);
    public static final Item chocolate_milk = new ItemBase("chocolate_milk", SuperCreativeTab.CREATIVE_TABS);
    public static final Item chocolate_seal = new ItemBase("chocolate_seal", SuperCreativeTab.CREATIVE_TABS);
    public static final Item hot_seal = new ItemBase("hot_seal", SuperCreativeTab.CREATIVE_TABS);
    public static final Item Dding_seal = new ItemBase("dding_seal", SuperCreativeTab.CREATIVE_TABS);
    public static final Item plastic_bag = new ItemBase("plastic_bag", SuperCreativeTab.CREATIVE_TABS);
    public static final Item egg_bread_bundle = new ItemBase("egg_bread_bundle", SuperCreativeTab.CREATIVE_TABS);
    public static final Item hot_bread_bundle = new ItemBase("hot_bread_bundle", SuperCreativeTab.CREATIVE_TABS);
    public static final Item hot_bread_box = new ItemBase("hot_bread_box", SuperCreativeTab.CREATIVE_TABS);
    public static final Item hot_kimchi_box = new ItemBase("hot_kimchi_box", SuperCreativeTab.CREATIVE_TABS);
    public static final Item hot_noodle_edition = new ItemBase("hot_noodle_edition", SuperCreativeTab.CREATIVE_TABS);
    public static final Item hot_noodle_box = new ItemBase("hot_noodle_box", SuperCreativeTab.CREATIVE_TABS);
    public static final Item box = new ItemBase("box", SuperCreativeTab.CREATIVE_TABS);
    public static final Item small_box = new ItemBase("small_box", SuperCreativeTab.CREATIVE_TABS);
    public static final Item charm_box = new ItemBase("charm_box", SuperCreativeTab.CREATIVE_TABS);
    public static final Item chocolate_bread_bundle = new ItemBase("chocolate_bread_bundle", SuperCreativeTab.CREATIVE_TABS);
    public static final Item chocolate_bread_box = new ItemBase("chocolate_bread_box", SuperCreativeTab.CREATIVE_TABS);
    public static final Item chocolate_milk_bundle = new ItemBase("chocolate_milk_bundle", SuperCreativeTab.CREATIVE_TABS);
    public static final Item dding_seal_box = new ItemBase("dding_seal_box", SuperCreativeTab.CREATIVE_TABS);


    public static final ItemCookFood instance_kimchi = new ItemCookFood("instance_kimchi", 8
            ,RestaurantCreativeTab.CREATIVE_TABS);
    public static final ItemCookFood kimchi_rice = new ItemCookFood("kimchi_rice",14, RestaurantCreativeTab.CREATIVE_TABS);
    public static final ItemCookFood fried_kimchi = new ItemCookFood("fried_kimchi",14, RestaurantCreativeTab.CREATIVE_TABS);
    public static final ItemCookFood old_kimchi = new ItemCookFood("old_kimchi",8, RestaurantCreativeTab.CREATIVE_TABS);
    public static final ItemCookFood fried_old_kimchi = new ItemCookFood("fried_old_kimchi",14, RestaurantCreativeTab.CREATIVE_TABS,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:resistance"),60*20,1),new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:strength"),60*20,0));
    public static final ItemCookFood pork_old_kimchi = new ItemCookFood("pork_old_kimchi", 14,RestaurantCreativeTab.CREATIVE_TABS,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:resistance"),50*20,1),new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:strength"),50*20,1));
    public static final ItemCookFood sour_kimchi = new ItemCookFood("sour_kimchi",8, RestaurantCreativeTab.CREATIVE_TABS);
    public static final ItemCookFood korean_meal = new ItemCookFood("korean_meal", 12,RestaurantCreativeTab.CREATIVE_TABS,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:resistance"),60*20,0),new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:strength"),60*20,0));
    public static final ItemCookFood chicken_soup = new ItemCookFood("chicken_soup", 7,RestaurantCreativeTab.CREATIVE_TABS,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:resistance"),60*20,0));
    public static final ItemCookFood meat_rice = new ItemCookFood("meat_rice", 10,RestaurantCreativeTab.CREATIVE_TABS,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:resistance"),60*20,0),new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:strength"),60*20,0));
    public static final ItemCookFood meat_bul = new ItemCookFood("meat_bul", 8,RestaurantCreativeTab.CREATIVE_TABS,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:resistance"),60*20,0));
    public static final ItemCookFood pork = new ItemCookFood("pork",7, RestaurantCreativeTab.CREATIVE_TABS,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:resistance"),60*20,0));
    public static final ItemCookFood jmt_rice = new ItemCookFood("jmt_rice",6, RestaurantCreativeTab.CREATIVE_TABS,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:resistance"),60*20,0));
    public static final ItemCookFood chicken = new ItemCookFood("chicken",10, RestaurantCreativeTab.CREATIVE_TABS,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:strength"),40*20,1));
    public static final ItemCookFood bossam = new ItemCookFood("bossam", 12,RestaurantCreativeTab.CREATIVE_TABS,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:strength"),70*20,1));
    public static final ItemCookFood chicken_beer = new ItemCookFood("chicken_beer", 20,RestaurantCreativeTab.CREATIVE_TABS);
    public static final ItemCookFood dding_grand_bossam = new ItemCookFood("dding_grand_bossam",20, RestaurantCreativeTab.CREATIVE_TABS);
    public static final ItemCookFood donut_fried_kimchi = new ItemCookFood("donut_fried_kimchi", 20,RestaurantCreativeTab.CREATIVE_TABS);
    public static final ItemCookFood kimchi_soup = new ItemCookFood("kimchi_soup", 14,RestaurantCreativeTab.CREATIVE_TABS,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:resistance"),90*20,1));

    public static final Item empty_cd = new ItemBase("empty_cd", ArtistCreativeTab.CREATIVE_TABS);
    public static final ItemArtistCD cd1 = new ItemArtistCD("cd1", ArtistCreativeTab.CREATIVE_TABS);
    public static final ItemArtistCD cd2 = new ItemArtistCD("cd2", ArtistCreativeTab.CREATIVE_TABS);
    public static final ItemArtistCD cd3 = new ItemArtistCD("cd3", ArtistCreativeTab.CREATIVE_TABS);
    public static final ItemArtistCD cd4 = new ItemArtistCD("cd4", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item picture = new ItemBase("picture", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item drawing_paper = new ItemBase("drawing_paper", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item story_book = new ItemBase("story_book", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item paint_tube = new ItemBase("paint_tube", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item red_paint = new ItemBase("red_paint", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item green_paint = new ItemBase("green_paint", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item blue_paint = new ItemBase("blue_paint", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item music1 = new ItemBase("music1", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item music2 = new ItemBase("music2", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item music3 = new ItemBase("music3", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item music4 = new ItemBase("music4", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item album1 = new ItemBase("album1", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item album2 = new ItemBase("album2", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item album3 = new ItemBase("album3", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item album4 = new ItemBase("album4", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item music_box = new ItemBase("music_box", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item red_apron = new ItemBase("red_apron", ArtistCreativeTab.CREATIVE_TABS);
    public static final Item special_sticker = new ItemBase("special_sticker", ArtistCreativeTab.CREATIVE_TABS);


    public static final Item leather_jacket = new ItemBase("leather_jacket", DesignCreativeTab.CREATIVE_TABS);
    public static final Item leather = new ItemBase("artificial_leather", DesignCreativeTab.CREATIVE_TABS);
    public static final Item black_leather = new ItemBase("black_leather", DesignCreativeTab.CREATIVE_TABS);
    public static final Item white_leather = new ItemBase("white_leather", DesignCreativeTab.CREATIVE_TABS);
    public static final Item cloth = new ItemBase("cloth", DesignCreativeTab.CREATIVE_TABS);
    public static final Item shoes = new ItemBase("shoes", DesignCreativeTab.CREATIVE_TABS);
    public static final Item exercise_shoes = new ItemBase("exercise_shoes", DesignCreativeTab.CREATIVE_TABS);
    public static final Item lace = new ItemBase("lace", DesignCreativeTab.CREATIVE_TABS);
    public static final Item string_bunch = new ItemBase("string_bunch", DesignCreativeTab.CREATIVE_TABS);
    public static final Item red_fabric = new ItemBase("red_fabric", DesignCreativeTab.CREATIVE_TABS);
    public static final Item red_tshirt = new ItemBase("red_tshirt", DesignCreativeTab.CREATIVE_TABS);
    public static final Item blue_fabric = new ItemBase("blue_fabric", DesignCreativeTab.CREATIVE_TABS);
    public static final Item blue_jeans = new ItemBase("blue_jeans", DesignCreativeTab.CREATIVE_TABS);
    public static final Item blue_tshirt = new ItemBase("blue_tshirt", DesignCreativeTab.CREATIVE_TABS);
    public static final Item aquamarine_shirt = new ItemBase("aquamarine_shirt", DesignCreativeTab.CREATIVE_TABS);
    public static final Item flower_shoes = new ItemBase("flower_shoes", DesignCreativeTab.CREATIVE_TABS);
    public static final Item wine_dress = new ItemBase("wine_dress", DesignCreativeTab.CREATIVE_TABS);


    public static final ItemAlchol god_thing = new ItemAlchol("god_thing",10,
            new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:speed"),400,2,true,true));
    public static final Item glass = new ItemBase("glass", AlcholCreativeTab.CREATIVE_TABS);
    public static final Item makgeolli = new ItemBase("makgeolli",AlcholCreativeTab.CREATIVE_TABS);
    public static final Item three_makgeolli = new ItemBase("three_makgeolli", AlcholCreativeTab.CREATIVE_TABS);
    public static final ItemAlchol coffee_makgeolli = new ItemAlchol("coffee_makgeolli",10,
            new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:haste"),20*30,1,true,true));
    public static final Item beer = new ItemBase("beer", AlcholCreativeTab.CREATIVE_TABS);
    public static final Item three_beer = new ItemBase("three_beer", AlcholCreativeTab.CREATIVE_TABS);
    public static final ItemAlchol milk_punch = new ItemAlchol("milk_punch",8,
            new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:speed"),15*20,1,true,true));
    public static final Item board_car = new ItemBase("board_car", AlcholCreativeTab.CREATIVE_TABS);
    public static final ItemAlchol blue_hawaii = new ItemAlchol("blue_hawaii",8,
            new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:water_breathing"),400,0,true,true));
    public static final ItemAlchol shangria = new ItemAlchol("shangria",10,
            new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:haste"),400,2,true,true));
    public static final ItemAlchol wine = new ItemAlchol("wine",8,
            new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:haste"),200,0,true,true));
    public static final Item whiskey = new ItemBase("whiskey", AlcholCreativeTab.CREATIVE_TABS);
    public static final ItemAlchol choco_mat = new ItemAlchol("choco_mat", 8,
            new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:speed"),200,2,true,true));
    public static final ItemAlchol fish_tear = new ItemAlchol("fish_tear",10,
            new PotionEffect(PotionInit.STAT_UPGRADE_EFFECT,600,1,true,true));
    public static final Item flower_shangria = new ItemBase("flower_shangria", AlcholCreativeTab.CREATIVE_TABS);
    public static final ItemAlchol lemon_drop = new ItemAlchol("lemon_drop",10,
            new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:water_breathing"),20*40,1,true,true));
    public static final Item makgeolli_jeongsik = new ItemBase("makgeolli_jeongsik", AlcholCreativeTab.CREATIVE_TABS);


    public static final Item oak_chair = new ItemBase("oak_chair", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item oak_shelf = new ItemBase("oak_shelf", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item oak_table = new ItemBase("oak_table", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item darkoak_cupboard = new ItemBase("darkoak_cupboard", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item acacia_bird = new ItemBase("acacia_bird", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item spruce_clock = new ItemBase("spruce_clock", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item birch_fan = new ItemBase("birch_fan", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item jungle_rocking_chair = new ItemBase("jungle_rocking_chair", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item oak_food_table = new ItemBase("oak_food_table", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item darkoak_jagaejang = new ItemBase("darkoak_jagaejang", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item wonang_pair = new ItemBase("wonang_pair", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item cuckoo_clock = new ItemBase("cuckoo_clock", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item birch_folding_screen = new ItemBase("birch_folding_screen", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item jungle_swing = new ItemBase("jungle_swing", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item lacquer_tree_resin = new ItemBase("lacquer_tree_resin", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item special_oak_chair = new ItemBase("special_oak_chair", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item special_oak_shelf = new ItemBase("special_oak_shelf", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item special_oak_table = new ItemBase("special_oak_table", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item special_darkoak_cupboard = new ItemBase("special_darkoak_cupboard", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item special_acacia_bird = new ItemBase("special_acacia_bird", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item special_spruce_clock = new ItemBase("special_spruce_clock", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item special_birch_fan = new ItemBase("special_birch_fan", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item special_jungle_rocking_chair = new ItemBase("special_jungle_rocking_chair", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item special_oak_food_table = new ItemBase("special_oak_food_table", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item special_darkoak_jagaejang = new ItemBase("special_darkoak_jagaejang", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item special_wonang_pair = new ItemBase("special_wonang_pair", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item special_cuckoo_clock = new ItemBase("special_cuckoo_clock", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item special_birch_folding_screen = new ItemBase("special_birch_folding_screen", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item special_jungle_swing = new ItemBase("special_jungle_swing", FurnitureMakerCreativeTab.CREATIVE_TABS);

    public static final Item ruby_jagaejang = new ItemBase("ruby_jagaejang", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item leather_partion = new ItemBase("leather_partion", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item wine_table = new ItemBase("wine_table", FurnitureMakerCreativeTab.CREATIVE_TABS);
    public static final Item burin = new ItemBase("burin", FurnitureMakerCreativeTab.CREATIVE_TABS);



    public static final ItemNatureFood cabbage = new ItemNatureFood("cabbage", HarvestCreativeTab.CREATIVE_TABS);
    public static final ItemNatureFood pepper = new ItemNatureFood("pepper", HarvestCreativeTab.CREATIVE_TABS);
    public static final Item rice_crop = new ItemBase("rice_crop", HarvestCreativeTab.CREATIVE_TABS);
    public static final Item vulgare = new ItemBase("vulgare", HarvestCreativeTab.CREATIVE_TABS);

    public static final Item seeds_cabbage = new ItemCabbageSeeds("seeds_cabbage");
    public static final Item seeds_pepper = new ItemPepperSeeds("seeds_pepper");
    public static final Item seeds_rice = new ItemRiceSeeds("seeds_rice");
    public static final Item seeds_barley = new ItemBarelySeeds("seeds_barley");

    public static final Item aquamarine_ingot = new ItemBase("aquamarine_ingot", HarvestCreativeTab.CREATIVE_TABS);
    public static final ItemNatureFood gra_fru = new ItemNatureFood("gra_fru", HarvestCreativeTab.CREATIVE_TABS);
    public static final ItemNatureFood lemon_fru = new ItemNatureFood("lemon_fru", HarvestCreativeTab.CREATIVE_TABS);
    public static final Item iron_ingot = new ItemBase("iron_ingot", HarvestCreativeTab.CREATIVE_TABS);
    public static final Item note = new ItemBase("note", HarvestCreativeTab.CREATIVE_TABS);
    public static final ItemNatureFood oran_fru = new ItemNatureFood("oran_fru", HarvestCreativeTab.CREATIVE_TABS);
    public static final Item rosegold_ingot = new ItemBase("rosegold_ingot", HarvestCreativeTab.CREATIVE_TABS);
    public static final Item ruby_ingot = new ItemBase("ruby_ingot", HarvestCreativeTab.CREATIVE_TABS);
    public static final Item topaz_ingot = new ItemBase("topaz_ingot", HarvestCreativeTab.CREATIVE_TABS);
    public static final Item upcore = new ItemBase("upcore", HarvestCreativeTab.CREATIVE_TABS);

    public static final Item phone = new ItemBase("phone", CreativeTabs.MATERIALS);
    public static final LandSelector landSelector = new LandSelector();

}
