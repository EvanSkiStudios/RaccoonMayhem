package com.evanskistudios.raccoonmayhem;

import com.evanskistudios.raccoonmayhem.blocks.ModBlocks;
import com.evanskistudios.raccoonmayhem.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RaccoonMayhem.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RACCOONMAYHEM_TAB = CREATIVE_MODE_TABS.register("raccoonmayhem_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GLITCH_BLOCK.get()))
                    .title(Component.translatable("creativetab.raccoonmayhem_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Add items here, in order is order of tab
                        pOutput.accept(ModItems.TACTICAL_DIRT.get());
                        pOutput.accept(ModItems.CHEESE.get());
                        pOutput.accept(ModBlocks.CHEESE_BLOCK.get());

                        pOutput.accept(ModItems.UPGRADESHARD.get());
                        pOutput.accept(ModItems.SUPERMAGNET.get());

                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                        pOutput.accept(ModBlocks.RUBY_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());

                        pOutput.accept(ModBlocks.GLITCH_BLOCK.get());

                        pOutput.accept(ModBlocks.DIRT_SLAB.get());

                        pOutput.accept(ModItems.CHARCOAL_BLOCK.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
