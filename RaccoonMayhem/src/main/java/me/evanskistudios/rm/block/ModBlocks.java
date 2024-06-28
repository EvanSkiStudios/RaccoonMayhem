package me.evanskistudios.rm.block;

import me.evanskistudios.rm.RaccoonMayhem;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static void registerModBlocks(){
        RaccoonMayhem.LOGGER.info("Registering ModBlocks for " + RaccoonMayhem.MOD_ID);
    }

    public static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(RaccoonMayhem.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(RaccoonMayhem.MOD_ID, name), block);
    }


    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
            )
    );
}
