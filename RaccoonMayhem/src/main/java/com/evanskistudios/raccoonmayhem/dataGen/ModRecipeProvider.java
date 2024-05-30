package com.evanskistudios.raccoonmayhem.dataGen;

import com.evanskistudios.raccoonmayhem.RaccoonMayhem;
import com.evanskistudios.raccoonmayhem.blocks.ModBlocks;
import com.evanskistudios.raccoonmayhem.items.ModItems;
import com.evanskistudios.raccoonmayhem.utils.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> RUBY_SMELTABLES = List.of(ModItems.RUBY.get(),
            ModBlocks.RUBY_ORE.get(), ModBlocks.DEEPSLATE_RUBY_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        oreSmelting(pRecipeOutput, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(), 0.25f, 200, "ruby");
        oreBlasting(pRecipeOutput, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(), 0.25f, 100, "ruby");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())) //When recipe shows in recipe book
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY.get(), 9)
                .requires(ModBlocks.RUBY_BLOCK.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get()))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHEESE_BLOCK.get())
                .pattern("CC")
                .pattern("CC")
                .define('C', ModItems.CHEESE.get())
                .unlockedBy(getHasName(ModItems.CHEESE.get()), has(ModItems.CHEESE.get())) //When recipe shows in recipe book
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CHEESE.get(), 4)
                .requires(ModBlocks.CHEESE_BLOCK.get())
                .unlockedBy(getHasName(ModItems.CHEESE.get()), has(ModItems.CHEESE.get()))
                .save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TACTICAL_DIRT.get(), 1)
                .requires(Blocks.DIRT)
                .requires(ModTags.Items.MATERIAL_SEEDS)
                .unlockedBy(getHasName(Blocks.DIRT), has(Blocks.DIRT))
                .save(pRecipeOutput);


        //region < Dirt Extras >
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.DIRT_BUTTON.get(), 1)
                .requires(Blocks.DIRT)
                .unlockedBy(getHasName(Blocks.DIRT), has(Blocks.DIRT))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIRT_STAIRS.get(), 4)
                .pattern("D  ")
                .pattern("DD ")
                .pattern("DDD")
                .define('D', Blocks.DIRT)
                .unlockedBy(getHasName(Blocks.DIRT), has(Blocks.DIRT))
                .save(pRecipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIRT_TRAPDOOR.get(), 2)
                .pattern("DDD")
                .pattern("DDD")
                .define('D', Blocks.DIRT)
                .unlockedBy(getHasName(Blocks.DIRT), has(Blocks.DIRT))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIRT_DOOR.get(), 2)
                .pattern("DD")
                .pattern("DD")
                .pattern("DD")
                .define('D', Blocks.DIRT)
                .unlockedBy(getHasName(Blocks.DIRT), has(Blocks.DIRT))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIRT_PRESSURE_PLATE.get(), 1)
                .pattern("DD")
                .define('D', Blocks.DIRT)
                .unlockedBy(getHasName(Blocks.DIRT), has(Blocks.DIRT))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIRT_FENCE.get(), 3)
                .pattern("DSD")
                .pattern("DSD")
                .define('D', Blocks.DIRT)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Blocks.DIRT), has(Blocks.DIRT))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIRT_FENCE_GATE.get(), 1)
                .pattern("SDS")
                .pattern("SDS")
                .define('D', Blocks.DIRT)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Blocks.DIRT), has(Blocks.DIRT))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIRT_SLAB.get(), 6)
                .pattern("DDD")
                .define('D', Blocks.DIRT)
                .unlockedBy(getHasName(Blocks.DIRT), has(Blocks.DIRT))
                .save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DIRT_WALL.get(), 6)
                .pattern("D D")
                .pattern("DDD")
                .define('D', Blocks.DIRT)
                .unlockedBy(getHasName(Blocks.DIRT), has(Blocks.DIRT))
                .save(pRecipeOutput);
        //endregion
    }

    protected static void oreSmelting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    private static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput pRecipeOutput, RecipeSerializer<T> pSerializer, AbstractCookingRecipe.Factory<T> pRecipeFactory, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pSuffix) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pSerializer, pRecipeFactory)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pRecipeOutput, RaccoonMayhem.MOD_ID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemlike));
        }
    }

}
