package com.peteydog7.betteremeralds.item.armor;

import com.peteydog7.betteremeralds.reference.Names;
import com.peteydog7.betteremeralds.reference.Reference;

public class ItemEmeraldChestplate extends ItemArmorBE {

    public ItemEmeraldChestplate(ArmorMaterial armorMaterial, int renderIndex, int armorType) {

        super(armorMaterial, renderIndex, armorType);

        this.setUnlocalizedName(Reference.PREFIX + Names.Armor.EMERALD_CHESTPLATE);
        this.setTextureName(Reference.PREFIX + Names.Armor.EMERALD_CHESTPLATE);

    }
}
