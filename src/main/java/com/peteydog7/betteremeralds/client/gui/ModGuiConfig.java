package com.peteydog7.betteremeralds.client.gui;

import com.peteydog7.betteremeralds.handler.ConfigHandler;
import com.peteydog7.betteremeralds.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

public class ModGuiConfig extends GuiConfig{

    public ModGuiConfig(GuiScreen guiScreen){

        super(
                guiScreen,
                new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                true,
                Reference.MOD_NAME + " Configuration"
                //GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString())
            );

    }
}
