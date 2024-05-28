package com.evanskistudios.raccoonmayhem.items;

import com.evanskistudios.raccoonmayhem.RaccoonMayhem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RaccoonMayhem.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


    public static final RegistryObject<Item> UPGRADESHARD = ITEMS.register("upgrade_shard", () -> new ItemEnchantedGlint(new Item.Properties()
            .rarity(Rarity.EPIC)
    ));
}
