package com.evanskistudios.raccoonmayhem.VanilliaOverrides.ThrowableSwords;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

@SuppressWarnings("ALL")
public class ThrownTridentOverRide extends AbstractArrow {

    public ThrownTridentOverRide(EntityType pEntity, Level pLevel, LivingEntity pShooter, ItemStack pStack) {
        //super(EntityType.TRIDENT, pShooter, pLevel, pStack);
        super(pEntity, pShooter, pLevel, pStack);
    }

}

