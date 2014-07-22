package com.peteydog7.betteremeralds.item.tools;

import com.peteydog7.betteremeralds.creativetab.CreativeTabsBE;
import com.peteydog7.betteremeralds.reference.Names;
import com.peteydog7.betteremeralds.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemEmeraldHoe extends ItemHoe {

    public ItemEmeraldHoe(ToolMaterial p_i45343_1_) {

        super(p_i45343_1_);

        this.setUnlocalizedName(Reference.PREFIX + Names.Tools.EMERALD_HOE);
        this.setTextureName(Reference.PREFIX + Names.Tools.EMERALD_HOE);
        this.setCreativeTab(CreativeTabsBE.BE_TAB);

    }
}
