package com.peteydog7.betteremeralds.proxy;

import com.peteydog7.betteremeralds.utility.LogHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

    public int addArmor(String armor){

        return RenderingRegistry.addNewArmourRendererPrefix(armor);

    }

}