package com.jj.jjmod.block;

import com.jj.jjmod.JJMod;
import com.jj.jjmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, JJMod.MODID);

    public static final RegistryObject<Block> SAPPHIRE_BLOCK =
            BLOCKS.register("sapphire_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK)));

    public static final RegistryObject<Item> SAPPHIRE_BLOCK_ITEM =
            ModItems.ITEMS.register("sapphire_block", () -> new BlockItem(SAPPHIRE_BLOCK.get(), new Item.Properties()));

//    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
//            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).sound(SoundType.AMETHYST)));

    // BlockItem registration (critical!)
//    public static final RegistryObject<Item> SAPPHIRE_BLOCK_ITEM =
//            registerBlockItem("sapphire_block", SAPPHIRE_BLOCK);

    //ADD SECOND BLOCK HERE

//    private static <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
//        RegistryObject<T> toReturn = BLOCKS.register(name, block);
//        registerBlockItem(name, toReturn);
//        return toReturn;
//    }
//
//    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
//        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
//    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
