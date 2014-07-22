package com.peteydog7.betteremeralds.item.armor;

import com.peteydog7.betteremeralds.creativetab.CreativeTabsBE;
import com.peteydog7.betteremeralds.init.ModItems;
import com.peteydog7.betteremeralds.utility.LogHelper;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;

public class ItemArmorBE extends ItemArmor {

    public ItemArmorBE(ArmorMaterial armorMaterial, int renderIndex, int armorType) {

        super(armorMaterial, renderIndex, armorType);

        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabsBE.BE_TAB);

    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){

        LogHelper.debug("'getArmorTexture' function called in ItemArmorBE.");

        if(stack.getItem() == ModItems.emeraldHelmet || stack.getItem() == ModItems.emeraldChestplate || stack.getItem() == ModItems.emeraldBoots){
            return "betteremeralds:textures/models/armor/emerald_layer_1.png";
        }
        else if(stack.getItem() == ModItems.emeraldLeggings){
            return "betteremeralds:textures/models/armor/emerald_layer_2.png";
        }
        else return null;

    }

}