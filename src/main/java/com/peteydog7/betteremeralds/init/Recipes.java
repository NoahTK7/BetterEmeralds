package com.peteydog7.betteremeralds.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {

    public static void init(){

        //GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emerald), "", "", "", '', ""));

        //Tool Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldPickaxe), "EEE", " S ", " S ", 'E', "gemEmerald", 'S', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldShovel), " E ", " S ", " S ", 'E', "gemEmerald", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldShovel), "E  ", "S  ", "S  ", 'E', "gemEmerald", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldShovel), "  E", "  S", "  S", 'E', "gemEmerald", 'S', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldAxe), "EE ", "ES ", " S ", 'E', "gemEmerald", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldAxe), " EE", " ES", "  S", 'E', "gemEmerald", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldAxe), " EE", " SE", " S ", 'E', "gemEmerald", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldAxe), "EE ", "SE ", " S ", 'E', "gemEmerald", 'S', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHoe), "EE ", " S ", " S ", 'E', "gemEmerald", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHoe), "EE ", "S  ", "S  ", 'E', "gemEmerald", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHoe), " EE", " S ", " S ", 'E', "gemEmerald", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHoe), " EE", "  S", "  S", 'E', "gemEmerald", 'S', "stickWood"));

        //Weapon Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldSword), " E ", " E ", " S ", 'E', "gemEmerald", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldSword), "E  ", "E  ", "S  ", 'E', "gemEmerald", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldSword), "  E", "  E", "  S" , 'E', "gemEmerald", 'S', "stickWood"));

        //Armor Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHelmet), "EEE", "E E", "   ", 'E', "gemEmerald"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHelmet), "   ", "EEE", "E E", 'E', "gemEmerald"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldChestplate), "E E", "EEE", "EEE", 'E', "gemEmerald"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldLeggings), "EEE", "E E", "E E", 'E', "gemEmerald"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldBoots), "E E", "E E", "   ", 'E', "gemEmerald"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldBoots), "   ", "E E", "E E", 'E', "gemEmerald"));

    }

}
