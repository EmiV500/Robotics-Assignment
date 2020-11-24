package com.ditzyEvie.determination.blocks;


import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class CoreOre extends OreBlock {
    public CoreOre(){
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(6.5f, 7.0f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
               );

    }
}
