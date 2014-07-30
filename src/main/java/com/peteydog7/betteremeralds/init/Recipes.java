package com.peteydog7.betteremeralds.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {

    public static void init(){

        //Tool Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldPickaxe), "EEE", " S ", " S ", 'E', "gemEmerald", 'S', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldShovel), " E ", " S ", " S ", 'E', "gemEmerald", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldShovel), "E  ", "S  ", "S  ", 'E', "gemEmerald", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldShovel), "  E", "  S", "  S", 'E', "gemEmerald", 'S', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldAxe), "EE ", "ES ", " S ", 'E', "gemEmerald", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldAxe), " EE", " SE", " S ", 'E', "gemEmerald", 'S', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHoe), "EE ", " S ", " S ", 'E', "gemEmerald", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHoe), " EE", " S ", " S ", 'E', "gemEmerald", 'S', "stickWood"));

        //Weapon Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldSword), " E ", " E ", " S ", 'E', "gemEmerald", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldSword), "E  ", "E  ", "S  ", 'E', "gemEmerald", 'S', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldSword), "  E", "  E", "  S" , 'E', "gemEmerald", 'S', "stickWood"));

        //Armor Recipes

    }

}
