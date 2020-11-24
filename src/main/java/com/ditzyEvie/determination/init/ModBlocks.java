package com.ditzyEvie.determination.init;

import com.ditzyEvie.determination.Determination;
import com.ditzyEvie.determination.blocks.CoreOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Determination.MODID);

    //Blocks
    public static final RegistryObject<Block> CORE_ORE = BLOCKS.register("core_ore", CoreOre::new);
}
