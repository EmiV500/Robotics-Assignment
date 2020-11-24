//package com.ditzyEvie.determination.utility;
//
//import com.ditzyEvie.determination.Determination;
//import net.minecraft.block.*;
//import net.minecraft.block.material.Material;
//import net.minecraft.item.BlockItem;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemGroup;
//import net.minecraft.potion.Effects;
//import net.minecraftforge.common.ToolType;
//import net.minecraftforge.fml.RegistryObject;
//import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.ObjectHolder;
//
//import java.sql.Blob;
//
//public class RegistryHandler {
//    //creates DeferredRegister object which helps register items
//
//    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Determination.MODID);
//
//    public static void init() {
//        // attach DeferredRegister to the event bus
//        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
//    }
//
//    //registers block
//    public static final RegistryObject<Block> CORE_ORE = BLOCKS.register("core_ore", () ->
//            new Block(
//                    Block.Properties
//                            .create(Material.IRON)
//                            .hardnessAndResistance(6.5f, 7.0f)
//                            .sound(SoundType.STONE)
//                            .harvestLevel(1)
//                            .harvestTool(ToolType.PICKAXE)
//            )
//    );
//
//    public static final RegistryObject<Block> FRIENDLY_FLOWER = BLOCKS.register("friendly_flower", () ->
//            new FlowerBlock(
//                    Effects.WEAKNESS, 7,
//                    AbstractBlock.Properties
//                            .create(Material.PLANTS)
//                            .doesNotBlockMovement()
//                            .zeroHardnessAndResistance()
//                            .sound(SoundType.PLANT)
//
//
//            )
//    );
//
//
//
//}
