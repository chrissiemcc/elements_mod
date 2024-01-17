package net.apixelmelon.elementsmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.apixelmelon.elementsmod.ElementsMod;
import net.apixelmelon.elementsmod.entity.custom.StaffProjectileEntity;
import net.apixelmelon.elementsmod.entity.layer.ModModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class StaffProjectileRenderer extends EntityRenderer<StaffProjectileEntity> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(ElementsMod.MOD_ID, "textures/entity/staff_projectile.png");
    protected StaffProjectileModel model;

    public StaffProjectileRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
        model = new StaffProjectileModel(pContext.bakeLayer(ModModelLayers.STAFF_PROJECTILE_LAYER));
        this.shadowRadius = 0.5f;
    }

    public void render(StaffProjectileEntity entity, float pEntityYaw, float pPartialTick, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        pPoseStack.pushPose();
        pPoseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(pPartialTick, entity.yRotO, entity.getYRot()) - 90.0F));
        pPoseStack.mulPose(Axis.ZP.rotationDegrees(Mth.lerp(pPartialTick, entity.xRotO, entity.getXRot()) + 90.0F));
        VertexConsumer vertexconsumer = ItemRenderer.getFoilBufferDirect(pBuffer, this.model.renderType(this.getTextureLocation(entity)), false, false);

        this.model.renderToBuffer(pPoseStack, vertexconsumer, pPackedLight, OverlayTexture.NO_OVERLAY, 1f, 1f, 1f, 1f);
        // Colour of the projectile

        pPoseStack.popPose();
        super.render(entity, pEntityYaw, pPartialTick, pPoseStack, pBuffer, pPackedLight);
    }

    @Override
    public ResourceLocation getTextureLocation(StaffProjectileEntity pEntity) {
        return TEXTURE;
    }
}