package com.life.item.util;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.registries.IForgeRegistry;


@SuppressWarnings("WeakerAccess")
public class SoundEffect {
    public static SoundEvent CD1 = registerSound("artist.cd.1");
    public static SoundEvent CD2 = registerSound("artist.cd.2");
    public static SoundEvent CD3 = registerSound("artist.cd.3");
    public static SoundEvent CD4 = registerSound("artist.cd.4");




    public static void registerSounds(IForgeRegistry<SoundEvent> e){
        e.registerAll(CD1,CD2,CD3,CD4);
    }
    public static SoundEvent getCD(String record) {
        if (record.contains("cd1")) return CD1;
        else if (record.contains("cd2")) return CD2;
        else if (record.contains("cd3")) return CD3;
        else if (record.contains("cd4")) return CD4;
        return SoundEvent.REGISTRY.getObjectById(0);
    }

    private static SoundEvent registerSound(String soundName){
        ResourceLocation soundId = new ResourceLocation(Reference.MOD_ID,soundName);
        SoundEvent soundEvent = new SoundEvent(soundId).setRegistryName(soundName);
        return soundEvent;
    }
}
