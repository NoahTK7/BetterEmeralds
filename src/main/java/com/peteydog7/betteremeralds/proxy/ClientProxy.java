package com.peteydog7.betteremeralds.proxy;

import com.peteydog7.betteremeralds.client.settings.Keybindings;
import com.peteydog7.betteremeralds.utility.LogHelper;
import cpw.mods.fml.client.config.GuiConfigEntries;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    public int addArmor(String armor){

        return RenderingRegistry.addNewArmourRendererPrefix(armor);

    }

    @Override
    public void registerKeyBindings() {

        ClientRegistry.registerKeyBinding(Keybindings.charge);
        ClientRegistry.registerKeyBinding(Keybindings.release);

    }


}