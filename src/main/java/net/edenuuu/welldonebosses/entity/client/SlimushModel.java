package net.edenuuu.welldonebosses.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.edenuuu.welldonebosses.WellDoneBosses;
import net.edenuuu.welldonebosses.entity.custom.SlimushEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class SlimushModel<T extends SlimushEntity> extends HierarchicalModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(WellDoneBosses.MOD_ID, "slimush"), "main");
    private final ModelPart Slimush;

    public SlimushModel(ModelPart root) {
        this.Slimush = root.getChild("Slimush");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Slimush = partdefinition.addOrReplaceChild("Slimush", CubeListBuilder.create().texOffs(0, 23).addBox(-8.0F, 0.0F, -8.0F, 16.0F, 14.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 10.0F, 0.0F));

        PartDefinition SlimushHat = Slimush.addOrReplaceChild("SlimushHat", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, -3.0F, -10.0F, 20.0F, 3.0F, 20.0F, new CubeDeformation(0.0F))
                .texOffs(0, 53).addBox(-9.0F, -4.0F, -9.0F, 18.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = SlimushHat.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(64, 35).addBox(-9.0F, -3.0F, -9.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, -1.5F, 14.0F, 0.0F, -0.48F, 0.0F));

        PartDefinition cube_r2 = SlimushHat.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 35).addBox(-9.0F, -3.0F, -9.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, -1.5F, 6.0F, 0.0F, -0.3054F, 0.0F));

        PartDefinition cube_r3 = SlimushHat.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(64, 29).addBox(-9.0F, -3.0F, -9.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -1.5F, 12.0F, 0.0F, 0.1745F, 0.0F));

        PartDefinition cube_r4 = SlimushHat.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(64, 23).addBox(-9.0F, -3.0F, -9.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, -1.5F, 4.0F, 0.0F, 0.0436F, 0.0F));

        PartDefinition cube_r5 = SlimushHat.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 53).addBox(-9.0F, -3.0F, -9.0F, 18.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }


    @Override
    public void setupAnim(@NotNull SlimushEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        Slimush.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }

    @Override
    public @NotNull ModelPart root() {
        return Slimush;
    }
}
