package com.peteydog7.betteremeralds.item.tools;

/*
import com.google.common.collect.Sets;
import com.peteydog7.betteremeralds.reference.Material;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
*/

import com.peteydog7.betteremeralds.creativetab.CreativeTabsBE;
import com.peteydog7.betteremeralds.reference.Names;
import com.peteydog7.betteremeralds.reference.Reference;
import net.minecraft.item.ItemPickaxe;

import java.util.Set;

public class ItemEmeraldPickaxe extends ItemPickaxe {

    public ItemEmeraldPickaxe(ToolMaterial p_i45347_1_) {

        super(p_i45347_1_);

        this.setUnlocalizedName(Reference.PREFIX + Names.Tools.EMERALD_PICKAXE);
        this.setTextureName(Reference.PREFIX + Names.Tools.EMERALD_PICKAXE);
        this.setCreativeTab(CreativeTabsBE.BE_TAB);

    }

    /*public static final Set blocksEffectiveAgainst = Sets.newHashSet(new Block[]{Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail});

    public  ItemEmeraldPickaxe(){

        super(2F, Material.Tools.M_EMERALD, blocksEffectiveAgainst);
        this.setUnlocalizedName(Names.Items.EMERALD_PICKAXE);


    }*/

}
