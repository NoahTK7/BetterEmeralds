package com.peteydog7.betteremeralds.item.tools;

import com.peteydog7.betteremeralds.creativetab.CreativeTabsBE;
import com.peteydog7.betteremeralds.reference.Names;
import com.peteydog7.betteremeralds.reference.Reference;
import net.minecraft.item.ItemSword;

public class ItemEmeraldSword extends ItemSword {

    public ItemEmeraldSword(ToolMaterial p_i45356_1_) {

        super(p_i45356_1_);

        this.setUnlocalizedName(Reference.PREFIX+ Names.Weapons.EMERALD_SWORD);
        this.setTextureName(Reference.PREFIX+Names.Weapons.EMERALD_SWORD);
        this.setCreativeTab(CreativeTabsBE.BE_TAB);

    }
}
