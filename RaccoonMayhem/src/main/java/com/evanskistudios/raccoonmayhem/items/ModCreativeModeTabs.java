package com.evanskistudios.raccoonmayhem.items;

import com.evanskistudios.raccoonmayhem.RaccoonMayhem;
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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.raccoonmayhem_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        //Add items here, in order is order of tab
                        pOutput.accept(ModItems.SAPPHIRE.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
