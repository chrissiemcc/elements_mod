package net.apixelmelon.elementsmod.item.custom.staves;

import net.apixelmelon.elementsmod.entity.custom.AirStaffProjectileEntity;
import net.apixelmelon.elementsmod.item.custom.StaffItem;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AirStaffItem extends StaffItem {
    public AirStaffItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pUsedHand);

        pPlayer.getCooldowns().addCooldown(this, 40); // Staff projectile cooldown

        if(!pLevel.isClientSide()) {
            AirStaffProjectileEntity airStaffProjectile = new AirStaffProjectileEntity(pLevel, pPlayer);
            airStaffProjectile.shootFromRotation(pPlayer, pPlayer.getXRot(), pPlayer.getYRot(), 0.0F, 1.5F, 0.25F);
            pLevel.addFreshEntity(airStaffProjectile);
        }

        pPlayer.awardStat(Stats.ITEM_USED.get(this));
        if (!pPlayer.getAbilities().instabuild) {
            itemstack.hurtAndBreak(1, pPlayer, p -> p.broadcastBreakEvent(pUsedHand));
        }

        return InteractionResultHolder.sidedSuccess(itemstack, pLevel.isClientSide());
    }
}
