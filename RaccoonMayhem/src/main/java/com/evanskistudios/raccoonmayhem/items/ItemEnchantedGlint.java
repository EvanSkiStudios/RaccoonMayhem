package com.evanskistudios.raccoonmayhem.items;

import net.minecraft.world.item.*;
import org.jetbrains.annotations.NotNull;

public class ItemEnchantedGlint extends Item {

    public ItemEnchantedGlint(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFoil(@NotNull ItemStack pStack) {
        return true;
    }
}
