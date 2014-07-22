package com.peteydog7.betteremeralds.item.tools;

import com.peteydog7.betteremeralds.creativetab.CreativeTabsBE;
import com.peteydog7.betteremeralds.reference.Names;
import com.peteydog7.betteremeralds.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemEmeraldAxe extends ItemAxe {

    public ItemEmeraldAxe(ToolMaterial p_i45327_1_) {

        super(p_i45327_1_);

        this.setUnlocalizedName(Reference.PREFIX + Names.Tools.EMERALD_AXE);
        this.setTextureName(Reference.PREFIX + Names.Tools.EMERALD_AXE);
        this.setCreativeTab(CreativeTabsBE.BE_TAB);

    }
}
