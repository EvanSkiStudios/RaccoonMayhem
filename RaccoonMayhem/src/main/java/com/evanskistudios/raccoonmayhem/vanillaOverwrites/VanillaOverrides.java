package com.evanskistudios.raccoonmayhem.vanillaOverwrites;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class VanillaOverrides {
    public static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    public static void register(IEventBus eventBus){
        VANILLA_ITEMS.register(eventBus);
    }

    /*
    public static final RegistryObject<Item> DIAMOND_SWORD = VANILLA_ITEMS.register("diamond_sword", () -> new ThrowableSwords(
            Tiers.WOOD, 1, 1, new Item.Properties()
    ));
     */
}
