package com.ditzyEvie.determination.events;

import com.ditzyEvie.determination.Determination;
import com.ditzyEvie.determination.init.ModItems;
import com.ditzyEvie.determination.items.Soul;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = Determination.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {
    private static boolean once = true;
    @SubscribeEvent
    public static void SoulGivesYouStrength(LivingEvent.LivingUpdateEvent event) {
        LivingEntity player = event.getEntityLiving();
        if(player.getHeldItemOffhand().getItem() == ModItems.SOUL.get()) {
            player.addPotionEffect(new EffectInstance(Effects.STRENGTH, 15*20, 1));



        }
    }
}
