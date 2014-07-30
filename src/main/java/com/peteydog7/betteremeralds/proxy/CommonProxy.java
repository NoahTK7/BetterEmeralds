package com.peteydog7.betteremeralds.proxy;

import cpw.mods.fml.client.config.GuiConfigEntries;

public abstract class CommonProxy implements IProxy {

    @Override
    public Class<? extends GuiConfigEntries.IConfigEntry> getSliderClass()
    {
        return GuiConfigEntries.NumberSliderEntry.class;
    }

}
