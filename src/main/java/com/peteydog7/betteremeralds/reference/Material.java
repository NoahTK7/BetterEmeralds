package com.peteydog7.betteremeralds.reference;

import com.peteydog7.betteremeralds.utility.LogHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.lang.reflect.Array;

public class Material {

    public static final class Tools {

        private static int durability = Configs.toolDurability;
        private static float speed = ((float) Configs.toolSpeed);

        public static final Item.ToolMaterial M_EMERALD = EnumHelper.addToolMaterial(Names.Materials.M_EMERALD, 4, durability, speed, 4, 30);

    }

    public static final class Armor {

        private static int durability = Configs.armorDurability;
        private static int[] strength = getStrength(Configs.armorStrength);

        public static final ItemArmor.ArmorMaterial M_EMERALD = EnumHelper.addArmorMaterial(Names.Materials.M_EMERALD, durability, strength, 30);

        public static int[] getStrength(int config){

            int[] strength;

            switch(config){
                case 1:
                    strength = new int[]{1, 6, 4, 1};
                break;
                case 2:
                    strength = new int[]{2, 7, 5, 2};
                break;
                case 3:
                    strength = new int[]{3, 8, 6, 3};
                break;
                case 4:
                    strength = new int[]{4, 9, 7, 4};
                break;
                case 5:
                    strength = new int[]{5, 10, 8, 5};
                break;
                default:
                    return new int[]{4, 9, 7, 4};
            }

            LogHelper.warn(strength.toString());

            return strength;
        }

    }

}