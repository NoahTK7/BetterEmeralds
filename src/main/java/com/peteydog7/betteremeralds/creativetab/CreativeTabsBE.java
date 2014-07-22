package com.peteydog7.betteremeralds.creativetab;

import com.peteydog7.betteremeralds.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabsBE {

    public static final CreativeTabs BE_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {

            return Items.emerald;

        }

    };

}
