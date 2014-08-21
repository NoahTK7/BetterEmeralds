package com.peteydog7.betteremeralds.handler;

import com.peteydog7.betteremeralds.BetterEmeralds;
import com.peteydog7.betteremeralds.reference.Configs;
import com.peteydog7.betteremeralds.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static Configuration configuration;

    public static int toolDurability;
    public static int armorDurability;
    public static int toolSpeed;
    public static int armorStrength;

    public static void init(File configFile){

        if(configuration == null) {
            configuration = new Configuration(configFile);
            loadConfig();
        }

    }

    private static void loadConfig(){

        /*
        toolDurability = configuration.getInt("Tool Durability", Configuration.CATEGORY_GENERAL, 2000, 1000, 4000, "Emerald Tool Durability (Diamond = 1561)");
        armorDurability = configuration.getInt("Armor Durability", Configuration.CATEGORY_GENERAL, 50, 30, 70, "Emerald Armor Durability Factor (Diamond = 33");
        toolSpeed = configuration.getInt("Tool Speed", Configuration.CATEGORY_GENERAL, 16, 10, 20, "Emerald Tool Speed (Diamond = 12)");
        armorStrength = configuration.getInt("Armor Strength", Configuration.CATEGORY_GENERAL, 4, 1, 5, "Armor Strength Factor (Diamond = 3)");
        */

        toolDurability = (int) configuration.get(Configuration.CATEGORY_GENERAL, "Tool Durability", 2000, "Emerald Tool Durability (Diamond = 1561)", 1000, 4000).setConfigEntryClass(BetterEmeralds.proxy.getSliderClass()).getInt();
        armorDurability = (int) configuration.get(Configuration.CATEGORY_GENERAL, "Armor Durability", 50, "Emerald Armor Durability Factor (Diamond = 33)", 30, 70).setConfigEntryClass(BetterEmeralds.proxy.getSliderClass()).getInt();
        toolSpeed = (int) configuration.get(Configuration.CATEGORY_GENERAL, "Tool Speed", 16, "Emerald Tool Speed (Diamond = 12)", 10, 20).setConfigEntryClass(BetterEmeralds.proxy.getSliderClass()).getInt();
        armorStrength = (int) configuration.get(Configuration.CATEGORY_GENERAL, "Armor Strength", 4, "Armor Strength Factor (Diamond = 3)", 1, 5).setConfigEntryClass(BetterEmeralds.proxy.getSliderClass()).getInt();


        if(configuration.hasChanged()){

            configuration.save();
            updateConfigReference();

        }

    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            loadConfig();
        }
    }

    private static void updateConfigReference(){

        Configs.toolDurability = toolDurability;
        Configs.armorDurability = armorDurability;
        Configs.toolSpeed = toolSpeed;
        Configs.armorStrength = armorStrength;

    }

}