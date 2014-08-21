package com.peteydog7.betteremeralds.item.tools;

import com.peteydog7.betteremeralds.creativetab.CreativeTabsBE;
import com.peteydog7.betteremeralds.reference.Names;
import com.peteydog7.betteremeralds.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemEmeraldPickaxe extends ItemPickaxe {

    public ItemEmeraldPickaxe(ToolMaterial p_i45347_1_) {

        super(p_i45347_1_);

        this.setUnlocalizedName(Reference.PREFIX + Names.Tools.EMERALD_PICKAXE);
        this.setTextureName(Reference.PREFIX + Names.Tools.EMERALD_PICKAXE);
        this.setCreativeTab(CreativeTabsBE.BE_TAB);

    }

}