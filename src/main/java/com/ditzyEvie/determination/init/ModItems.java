package com.ditzyEvie.determination.init;

import com.ditzyEvie.determination.Determination;
import com.ditzyEvie.determination.items.Soul;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Determination.MODID);

    //registers items
    public static final RegistryObject<Soul> SOUL = ITEMS.register("soul", Soul::new);

    public static final RegistryObject<Item> SOUL_SHARD = ITEMS.register("soul_shard", () ->
            new Item(
                    new Item.Properties().group(ItemGroup.MATERIALS)
            )
    );

    public static final RegistryObject<Item> CORE = ITEMS.register("core", () ->
            new Item(
                    new Item.Properties().group(ItemGroup.MATERIALS)
            )
    );

    public static final RegistryObject<Item> CORE_ORE_ITEM = ITEMS.register("core_ore", () ->
            new BlockItem(
                    ModBlocks.CORE_ORE.get(),
                    new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)
            )
    );

}
