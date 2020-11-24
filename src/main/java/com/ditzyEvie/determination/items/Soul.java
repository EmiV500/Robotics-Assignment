package com.ditzyEvie.determination.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Soul extends Item {
    public Soul() {
        super(new Item.Properties()
                .group(ItemGroup.MISC)
        );
    }

    @Override
        public boolean hasEffect(ItemStack stack){
        return true;
    }
}
