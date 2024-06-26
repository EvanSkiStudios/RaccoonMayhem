package me.evanskistudios.rm.item;

import me.evanskistudios.rm.RaccoonMayhem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
   public static void registerModItems(){
       RaccoonMayhem.LOGGER.info("Registering Mod Items for " + RaccoonMayhem.MOD_ID);

       ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
   }

   private static Item registerItem(String name, Item item){
    return Registry.register(Registries.ITEM, new Identifier(RaccoonMayhem.MOD_ID, name), item);
   }

   private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
       entries.add(RUBY);
   }

   public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
}
