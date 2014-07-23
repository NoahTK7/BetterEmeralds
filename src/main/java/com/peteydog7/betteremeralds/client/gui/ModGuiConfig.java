package com.peteydog7.betteremeralds.client.gui;

import com.peteydog7.betteremeralds.handler.ConfigHandler;
import com.peteydog7.betteremeralds.reference.Reference;
import cpw.mods.fml.client.config.*;
import net.minecraft.client.audio.SoundList;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import scala.Int;

import java.util.ArrayList;
import java.util.List;

public class ModGuiConfig extends GuiConfig{

    public ModGuiConfig(GuiScreen guiScreen){

        List<IConfigElement> elements = buildGui();

        super(
                guiScreen,
                new ConfigElement(elements),
                Reference.MOD_ID,
                false,
                true,
                Reference.MOD_NAME + " Configuration"
                //GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString())
            );

    }

    protected List<IConfigElement> buildGui() {

        List<IConfigElement> list = getConfigElements();
        List<IConfigElement> gui = new ArrayList();

        for (IConfigElement element : list){

            gui.add(new DummyConfigElement<Integer>(element.getName(), Integer.parseInt((String) element.getDefault()), ConfigGuiType.INTEGER, element.getName(), Integer.parseInt((String) element.getMinValue()), Integer.parseInt((String) element.getMaxValue())).setCustomListEntryClass(GuiConfigEntries.NumberSliderEntry.class));

        }

        return gui;

    }

    private static List<IConfigElement> getConfigElements(){

        List<IConfigElement> list = new ArrayList<IConfigElement>();

        list.addAll(new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements());

        return list;

    }

}
