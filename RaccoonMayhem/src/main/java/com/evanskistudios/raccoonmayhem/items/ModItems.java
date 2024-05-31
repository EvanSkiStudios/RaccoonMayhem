package com.evanskistudios.raccoonmayhem.items;

import com.evanskistudios.raccoonmayhem.RaccoonMayhem;
import com.evanskistudios.raccoonmayhem.blocks.ModBlocks;
import com.evanskistudios.raccoonmayhem.vanillaOverwrites.ThrowableSwords.ThrowableSwords;
import com.evanskistudios.raccoonmayhem.items.custom.FuelItem;
import com.evanskistudios.raccoonmayhem.items.custom.SuperMagnetItem;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RaccoonMayhem.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    private static <T extends Block> RegistryObject<Item> registerFuelBlockItem(String name, RegistryObject<T> block, int burnTime) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()) {
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                return burnTime;
            }
        });
    }

    // Foods
    public static final RegistryObject<Item> TACTICAL_DIRT = ITEMS.register("tactical_dirt", () -> new Item(new Item.Properties().food(ModFoods.TACTICAL_DIRT)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().food(ModFoods.CHEESE)));
    public static final RegistryObject<Item> CAKE_SLICE = ITEMS.register("cake_slice", () -> new Item(new Item.Properties().food(ModFoods.CAKE_SLICE)));

    // Misc
    public static final RegistryObject<Item> UPGRADESHARD = ITEMS.register("upgrade_shard", () -> new ItemEnchantedGlint(new Item.Properties()
            .rarity(Rarity.EPIC)
    ));

    // Tools
    public static final RegistryObject<Item> SUPERMAGNET = ITEMS.register("super_magnet", () -> new SuperMagnetItem(new Item.Properties()
            .durability(100)
    ));
    public static final RegistryObject<Item> THROWABLESWORD = ITEMS.register("throwable_sword", () -> new ThrowableSwords(
            Tiers.WOOD, 1, 1, new Item.Properties()
    ));

    // Ores
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));


    // Fuels -- Burn Time in ticks (20 ticks per second)
    // Coal 80s
    // Charcoal 80s
    // block of coal 800

    public static final RegistryObject<Item> CHARCOAL_BLOCK_ITEM = registerFuelBlockItem("charcoal_block_item", ModBlocks.CHARCOAL_BLOCK, 16000);

}
