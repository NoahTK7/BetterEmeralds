package com.peteydog7.betteremeralds;

import com.peteydog7.betteremeralds.handler.ConfigHandler;
import com.peteydog7.betteremeralds.init.ModItems;
import com.peteydog7.betteremeralds.proxy.IProxy;
import com.peteydog7.betteremeralds.reference.Reference;
import com.peteydog7.betteremeralds.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class BetterEmeralds {

    @Mod.Instance(Reference.MOD_ID)
    public static BetterEmeralds instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        LogHelper.info("Begin Pre-Intialization Stage");

        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        ModItems.init();
        //ModBlocks.init();

        LogHelper.info("Pre-Intialization Stage Complete");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        LogHelper.info("Begin Intialization Stage");



        LogHelper.info("Intialization Stage Complete");

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        LogHelper.info("Begin Post-Intialization Stage");



        LogHelper.info("Post-Intialization Stage Complete");

    }

}
