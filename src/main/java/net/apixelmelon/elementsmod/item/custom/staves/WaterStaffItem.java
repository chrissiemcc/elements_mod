package net.apixelmelon.elementsmod.item.custom.staves;

import net.apixelmelon.elementsmod.entity.custom.WaterStaffProjectileEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class WaterStaffItem extends StaffItem {
    public WaterStaffItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void specifyProjectile(Level pLevel, Player pPlayer) {
        if(!pLevel.isClientSide()) {
            WaterStaffProjectileEntity waterStaffProjectile = new WaterStaffProjectileEntity(pLevel, pPlayer);
            waterStaffProjectile.shootFromRotation(pPlayer, pPlayer.getXRot(), pPlayer.getYRot(), 0.0F, 1.5F, 0.25F);
            pLevel.addFreshEntity(waterStaffProjectile);
        }
    }
}
