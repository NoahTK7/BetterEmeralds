package com.peteydog7.betteremeralds.init;

import com.peteydog7.betteremeralds.BetterEmeralds;
import com.peteydog7.betteremeralds.item.armor.*;
import com.peteydog7.betteremeralds.item.tools.*;
import com.peteydog7.betteremeralds.reference.Material;
import com.peteydog7.betteremeralds.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {

    //Instantiate Tools
    public static final Item emeraldPickaxe = new ItemEmeraldPickaxe(Material.Tools.M_EMERALD);
    public static final Item emeraldShovel = new ItemEmeraldShovel(Material.Tools.M_EMERALD);
    public static final Item emeraldAxe = new ItemEmeraldAxe(Material.Tools.M_EMERALD);
    public static final Item emeraldHoe = new ItemEmeraldHoe(Material.Tools.M_EMERALD);

    //Instantiate Armor
    public static final ItemArmorBE emeraldHelmet = new ItemEmeraldHelmet(Material.Armor.M_EMERALD, BetterEmeralds.proxy.addArmor("emerald"), 0);
    public static final ItemArmorBE emeraldChestplate = new ItemEmeraldChestplate(Material.Armor.M_EMERALD, BetterEmeralds.proxy.addArmor("emerald"), 1);
    public static final ItemArmorBE emeraldLeggings = new ItemEmeraldLeggings(Material.Armor.M_EMERALD, BetterEmeralds.proxy.addArmor("emerald"), 2);
    public static final ItemArmorBE emeraldBoots = new ItemEmeraldBoots(Material.Armor.M_EMERALD, BetterEmeralds.proxy.addArmor("emerald"), 3);

    //Instantiate Weapons
    public static final Item emeraldSword = new ItemEmeraldSword(Material.Tools.M_EMERALD);

    //Init Function
    public static void init(){

        //Init Tools
        GameRegistry.registerItem(emeraldShovel, Names.Tools.EMERALD_SHOVEL);
        GameRegistry.registerItem(emeraldPickaxe, Names.Tools.EMERALD_PICKAXE);
        GameRegistry.registerItem(emeraldAxe, Names.Tools.EMERALD_AXE);
        GameRegistry.registerItem(emeraldHoe, Names.Tools.EMERALD_HOE);

        //Init Armor
        GameRegistry.registerItem(emeraldHelmet, Names.Armor.EMERALD_HELMET);
        GameRegistry.registerItem(emeraldChestplate, Names.Armor.EMERALD_CHESTPLATE);
        GameRegistry.registerItem(emeraldLeggings, Names.Armor.EMERALD_LEGGINGS);
        GameRegistry.registerItem(emeraldBoots, Names.Armor.EMERALD_BOOTS);

        //Init Weapons
        GameRegistry.registerItem(emeraldSword, Names.Weapons.EMERALD_SWORD);

    }

}