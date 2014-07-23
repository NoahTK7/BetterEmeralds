package com.peteydog7.betteremeralds.proxy;

import cpw.mods.fml.client.config.GuiConfigEntries;

public interface IProxy {

    public int addArmor(String armor);

    public Class<? extends GuiConfigEntries.IConfigEntry> getSliderClass();

}
