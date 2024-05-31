package com.evanskistudios.raccoonmayhem.dataGen;

import com.evanskistudios.raccoonmayhem.RaccoonMayhem;
import com.evanskistudios.raccoonmayhem.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, RaccoonMayhem.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.CHARCOAL_BLOCK);
        blockWithItem(ModBlocks.CHEESE_BLOCK);

        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);

        //region < Dirt Extras >
        stairsBlock(((StairBlock) ModBlocks.DIRT_STAIRS.get()), blockTexture(Blocks.DIRT));
        slabBlock(((SlabBlock) ModBlocks.DIRT_SLAB.get()), blockTexture(Blocks.DIRT), blockTexture(Blocks.DIRT));

        buttonBlock(((ButtonBlock) ModBlocks.DIRT_BUTTON.get()), blockTexture(Blocks.DIRT));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.DIRT_PRESSURE_PLATE.get()), blockTexture(Blocks.DIRT));

        fenceBlock(((FenceBlock) ModBlocks.DIRT_FENCE.get()), blockTexture(Blocks.DIRT));
        fenceGateBlock(((FenceGateBlock) ModBlocks.DIRT_FENCE_GATE.get()), blockTexture(Blocks.DIRT));
        wallBlock(((WallBlock) ModBlocks.DIRT_WALL.get()), blockTexture(Blocks.DIRT));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.DIRT_DOOR.get()), modLoc("block/dirt_door_bottom"), modLoc("block/dirt_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.DIRT_TRAPDOOR.get()), modLoc("block/dirt_trapdoor"), true, "cutout");
        //endregion

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
