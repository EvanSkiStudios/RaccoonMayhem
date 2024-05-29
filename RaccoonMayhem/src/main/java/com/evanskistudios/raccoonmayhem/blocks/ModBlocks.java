package com.evanskistudios.raccoonmayhem.blocks;

import com.evanskistudios.raccoonmayhem.RaccoonMayhem;
import com.evanskistudios.raccoonmayhem.items.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RaccoonMayhem.MOD_ID);

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block); //Registers block
        registerBlockItem(name, toReturn); // registers block item
        return toReturn; //returns
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }


    public static final RegistryObject<Block> GLITCH_BLOCK = registerBlock("glitch_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final RegistryObject<Block> CHEESE_BLOCK = registerBlock("cheese_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SPONGE)));
    public static final RegistryObject<SlabBlock> DIRT_SLAB = registerBlock("dirt_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB)
            .sound(SoundType.GRAVEL))
    );

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)));
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_EMERALD_ORE)));
}
