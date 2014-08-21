package com.peteydog7.betteremeralds.proxy;

import cpw.mods.fml.client.config.GuiConfigEntries;

public interface IProxy {

    public abstract int addArmor(String armor);

    public abstract Class<? extends GuiConfigEntries.IConfigEntry> getSliderClass();

    public abstract void registerKeyBindings();

}
