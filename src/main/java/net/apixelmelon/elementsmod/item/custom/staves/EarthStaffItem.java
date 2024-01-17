package net.apixelmelon.elementsmod.item.custom.staves;

import net.apixelmelon.elementsmod.entity.custom.EarthStaffProjectileEntity;
import net.apixelmelon.elementsmod.item.custom.StaffItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class EarthStaffItem extends StaffItem {
    public EarthStaffItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void specifyProjectile(Level pLevel, Player pPlayer) {
        if(!pLevel.isClientSide()) {
            EarthStaffProjectileEntity earthStaffProjectile = new EarthStaffProjectileEntity(pLevel, pPlayer);
            earthStaffProjectile.shootFromRotation(pPlayer, pPlayer.getXRot(), pPlayer.getYRot(), 0.0F, 1.5F, 0.25F);
            pLevel.addFreshEntity(earthStaffProjectile);
        }
    }
}
