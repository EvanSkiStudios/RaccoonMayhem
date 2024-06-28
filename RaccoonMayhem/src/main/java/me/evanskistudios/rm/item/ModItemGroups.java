package me.evanskistudios.rm.item;

import me.evanskistudios.rm.RaccoonMayhem;
import me.evanskistudios.rm.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(RaccoonMayhem.MOD_ID, "items"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.items"))
                    .icon( () -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {

                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);

                    }).build()
    );

    public static void registerItemGroups() {
        RaccoonMayhem.LOGGER.info("Registering Item Groups for " + RaccoonMayhem.MOD_ID);
    }
}
