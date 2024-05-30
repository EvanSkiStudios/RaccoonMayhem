package com.evanskistudios.raccoonmayhem.dataGen;

import com.evanskistudios.raccoonmayhem.RaccoonMayhem;
import com.evanskistudios.raccoonmayhem.blocks.ModBlocks;
import com.evanskistudios.raccoonmayhem.items.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, RaccoonMayhem.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.CHARCOAL_BLOCK);
        simpleFoodItem(ModItems.CHEESE);
        simpleItem(ModItems.SUPERMAGNET);
        simpleItem(ModItems.UPGRADESHARD);

        fenceItemVanillaTexture(ModBlocks.DIRT_FENCE, Blocks.DIRT);
        buttonItemVanillaTexture(ModBlocks.DIRT_BUTTON, Blocks.DIRT);
        wallItemVanillaTexture(ModBlocks.DIRT_WALL, Blocks.DIRT);

        simpleBlockItem(ModBlocks.DIRT_DOOR);
        trapdoorItem(ModBlocks.DIRT_TRAPDOOR);
        evenSimplerStairItem(ModBlocks.DIRT_STAIRS);
        evenSimplerSlabItem(ModBlocks.DIRT_SLAB);
        evenSimplerBlockItem(ModBlocks.DIRT_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.DIRT_FENCE_GATE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RaccoonMayhem.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleFoodItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RaccoonMayhem.MOD_ID,"item/food/" + item.getId().getPath()));
    }

    public void evenSimplerStairItem(RegistryObject<StairBlock> block) {
        this.withExistingParent(RaccoonMayhem.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void evenSimplerSlabItem(RegistryObject<SlabBlock> block) {
        this.withExistingParent(RaccoonMayhem.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(RaccoonMayhem.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItemVanillaTexture(RegistryObject<Block> block, Block baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation("minecraft", "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock).getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(RaccoonMayhem.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItemVanillaTexture(RegistryObject<Block> block, Block baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation("minecraft", "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(RaccoonMayhem.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItemVanillaTexture(RegistryObject<Block> block, Block baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation("minecraft", "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(RaccoonMayhem.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(RaccoonMayhem.MOD_ID,"item/" + item.getId().getPath()));
    }
}
