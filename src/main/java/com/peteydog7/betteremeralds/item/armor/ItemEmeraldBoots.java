package com.peteydog7.betteremeralds.item.armor;

import com.peteydog7.betteremeralds.reference.Names;
import com.peteydog7.betteremeralds.reference.Reference;

public class ItemEmeraldBoots extends ItemArmorBE {

    public ItemEmeraldBoots(ArmorMaterial armorMaterial, int renderIndex, int armorType) {

        super(armorMaterial, renderIndex, armorType);

        this.setUnlocalizedName(Reference.PREFIX + Names.Armor.EMERALD_BOOTS);
        this.setTextureName(Reference.PREFIX + Names.Armor.EMERALD_BOOTS);

    }

}
