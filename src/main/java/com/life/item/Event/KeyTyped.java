package com.life.item.Event;


import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

public class KeyTyped {
    public boolean KEY_PRESSED = false;
    private static KeyTyped instance;

    public static KeyTyped getInstance() {
        if (instance==null) instance = new KeyTyped();
        return instance;
    }

    private Minecraft mc = Minecraft.getMinecraft();
    public KeyTyped(){
        instance = this;
    }

    @SubscribeEvent
    public void onKeyPress(TickEvent e) throws Exception {
        if ((Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)||Keyboard.isKeyDown(Keyboard.KEY_RSHIFT))) {
            if (!KEY_PRESSED) KEY_PRESSED = true;
        }
        else if (KEY_PRESSED){
            KEY_PRESSED = false;
        }
    }

}
