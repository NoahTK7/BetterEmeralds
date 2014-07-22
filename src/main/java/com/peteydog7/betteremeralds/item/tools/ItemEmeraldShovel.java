package com.peteydog7.betteremeralds.item.tools;

import com.peteydog7.betteremeralds.creativetab.CreativeTabsBE;
import com.peteydog7.betteremeralds.reference.Names;
import com.peteydog7.betteremeralds.reference.Reference;
import net.minecraft.item.ItemSpade;

public class ItemEmeraldShovel extends ItemSpade {

    public ItemEmeraldShovel(ToolMaterial p_i45353_1_) {

        super(p_i45353_1_);

        this.setUnlocalizedName(Reference.PREFIX+ Names.Tools.EMERALD_SHOVEL);
        this.setTextureName(Reference.PREFIX+Names.Tools.EMERALD_SHOVEL);
        this.setCreativeTab(CreativeTabsBE.BE_TAB);

    }

}
