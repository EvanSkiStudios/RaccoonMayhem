package com.evanskistudios.raccoonmayhem.items;

import com.evanskistudios.raccoonmayhem.RaccoonMayhem;
import com.evanskistudios.raccoonmayhem.VanilliaOverrides.ThrowableSwords.ThrowableSwords;
import com.evanskistudios.raccoonmayhem.items.custom.SuperMagnetItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RaccoonMayhem.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> TACTICAL_DIRT = ITEMS.register("tactical_dirt", () -> new Item(new Item.Properties().food(ModFoods.TACTICAL_DIRT)));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> UPGRADESHARD = ITEMS.register("upgrade_shard", () -> new ItemEnchantedGlint(new Item.Properties()
            .rarity(Rarity.EPIC)
    ));

    public static final RegistryObject<Item> SUPERMAGNET = ITEMS.register("super_magnet", () -> new SuperMagnetItem(new Item.Properties()
            .durability(100)
    ));

    public static final RegistryObject<Item> THROWABLESWORD = ITEMS.register("throwable_sword", () -> new ThrowableSwords(
            Tiers.WOOD, 1, 1, new Item.Properties()
    ));



}
