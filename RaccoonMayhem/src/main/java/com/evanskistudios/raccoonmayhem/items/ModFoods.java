package com.evanskistudios.raccoonmayhem.items;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties TACTICAL_DIRT = new FoodProperties.Builder()
            .nutrition(5)
            .saturationMod(0.6f)
            .build();

    public static final FoodProperties CHEESE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.1f)
            .fast()
            .build();

    public static final FoodProperties CAKE_SLICE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.4f)
            .build();
}
