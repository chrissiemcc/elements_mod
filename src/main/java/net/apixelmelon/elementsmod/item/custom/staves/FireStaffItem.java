package net.apixelmelon.elementsmod.item.custom.staves;

import net.apixelmelon.elementsmod.entity.custom.FireStaffProjectileEntity;
import net.apixelmelon.elementsmod.item.custom.StaffItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class FireStaffItem extends StaffItem {
    public FireStaffItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void specifyProjectile(Level pLevel, Player pPlayer) {
        if(!pLevel.isClientSide()) {
            FireStaffProjectileEntity fireStaffProjectile = new FireStaffProjectileEntity(pLevel, pPlayer);
            fireStaffProjectile.shootFromRotation(pPlayer, pPlayer.getXRot(), pPlayer.getYRot(), 0.0F, 1.5F, 0.25F);
            pLevel.addFreshEntity(fireStaffProjectile);
        }
    }
}
