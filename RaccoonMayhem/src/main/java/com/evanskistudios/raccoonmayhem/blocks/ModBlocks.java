package com.evanskistudios.raccoonmayhem.blocks;

import com.evanskistudios.raccoonmayhem.RaccoonMayhem;
import com.evanskistudios.raccoonmayhem.items.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
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


    public static final RegistryObject<Block> GLITCH_BLOCK = registerBlock("glitch_block",
            () -> new Block(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
            )
    );

    public static final RegistryObject<Block> CHEESE_BLOCK = registerBlock("cheese_block",
            () -> new Block(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.SPONGE)
            )
    );

    //region < Rubies >
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)
            )
    );
    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new Block(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_ORE)
            )
    );
    public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            () -> new Block(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_EMERALD_ORE)
            )
    );
    //endregion

    //region < Dirt Extras >
    public static final RegistryObject<StairBlock> DIRT_STAIRS = registerBlock("dirt_stair",
            () -> new StairBlock(
                    Blocks.DIRT.defaultBlockState(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
            )
    );

    public static final RegistryObject<SlabBlock> DIRT_SLAB = registerBlock("dirt_slab",
            () -> new SlabBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_SLAB).sound(SoundType.GRAVEL)
            )
    );

    public static final RegistryObject<Block> DIRT_BUTTON = registerBlock("dirt_button",
            () -> new ButtonBlock(
                    BlockSetType.STONE, 10,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON).sound(SoundType.GRAVEL)
            )
    );

    public static final RegistryObject<Block> DIRT_PRESSURE_PLATE = registerBlock("dirt_pressure_plate",
            () -> new PressurePlateBlock(
                    BlockSetType.STONE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
            )
    );

    public static final RegistryObject<Block> DIRT_FENCE = registerBlock("dirt_fence",
            () -> new FenceBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
            )
    );

    public static final RegistryObject<Block> DIRT_FENCE_GATE = registerBlock("dirt_fence_gate",
            () -> new FenceGateBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL),
                    SoundEvents.ROOTED_DIRT_PLACE,
                    SoundEvents.ROOTED_DIRT_STEP,
                    WoodType.OAK
            )
    );

    public static final RegistryObject<Block> DIRT_WALL = registerBlock("dirt_wall",
            () -> new WallBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL)
            )
    );

    public static final RegistryObject<Block> DIRT_DOOR = registerBlock("dirt_door",
            () -> new DoorBlock(
                    BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL).noOcclusion()
            )
    );

    public static final RegistryObject<Block> DIRT_TRAPDOOR = registerBlock("dirt_trapdoor",
            () -> new TrapDoorBlock(
                    BlockSetType.OAK,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT).sound(SoundType.GRAVEL).noOcclusion()
            )
    );
    //endregion
}
