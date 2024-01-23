package net.apixelmelon.elementsmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class StaffProjectileModel<T extends Entity> extends EntityModel<T> {
    private final ModelPart StaffProjectileModel;

    public StaffProjectileModel(ModelPart root) {
        this.StaffProjectileModel = root.getChild("StaffProjectileModel");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition StaffProjectileModel = partdefinition.addOrReplaceChild("StaffProjectileModel", CubeListBuilder.create().texOffs(0, 8).addBox(-10.0F, -6.0F, 6.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(12, 6).addBox(-11.0F, -5.0F, 7.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(10, 12).addBox(-9.0F, -5.0F, 5.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(6, 2).addBox(-9.0F, -7.0F, 7.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 24.0F, -8.0F));

        return LayerDefinition.create(meshdefinition, 16, 16);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        StaffProjectileModel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
