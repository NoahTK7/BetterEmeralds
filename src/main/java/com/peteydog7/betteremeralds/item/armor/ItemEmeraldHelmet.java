package com.peteydog7.betteremeralds.item.armor;

import com.peteydog7.betteremeralds.reference.Names;
import com.peteydog7.betteremeralds.reference.Reference;

public class ItemEmeraldHelmet extends ItemArmorBE {

    public ItemEmeraldHelmet(ArmorMaterial armorMaterial, int renderIndex, int armorType) {

        super(armorMaterial, renderIndex, armorType);

        this.setUnlocalizedName(Reference.PREFIX + Names.Armor.EMERALD_HELMET);
        this.setTextureName(Reference.PREFIX + Names.Armor.EMERALD_HELMET);

    }

}
