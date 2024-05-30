package com.evanskistudios.raccoonmayhem.dataGen.loot;

import com.evanskistudios.raccoonmayhem.blocks.ModBlocks;
import com.evanskistudios.raccoonmayhem.items.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(ModBlocks.GLITCH_BLOCK.get());
        this.dropSelf(ModBlocks.CHEESE_BLOCK.get());

        this.add(ModBlocks.DIRT_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DIRT_SLAB.get()));

        this.dropSelf(ModBlocks.RUBY_BLOCK.get());

        this.add(ModBlocks.RUBY_ORE.get(),
                block -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RUBY.get()));

        this.add(ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_RUBY_ORE.get(), ModItems.RUBY.get()));


        this.dropSelf(ModBlocks.DIRT_STAIRS.get());
        this.dropSelf(ModBlocks.DIRT_BUTTON.get());
        this.dropSelf(ModBlocks.DIRT_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.DIRT_TRAPDOOR.get());
        this.dropSelf(ModBlocks.DIRT_FENCE.get());
        this.dropSelf(ModBlocks.DIRT_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DIRT_WALL.get());

        this.add(ModBlocks.DIRT_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DIRT_SLAB.get()));
        this.add(ModBlocks.DIRT_DOOR.get(),
                block -> createDoorTable(ModBlocks.DIRT_DOOR.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
