package net.edenuuu.welldonebosses.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import net.edenuuu.welldonebosses.WellDoneBosses;
import net.edenuuu.welldonebosses.entity.custom.SlimushEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.monster.Slime;
import org.jetbrains.annotations.NotNull;

public class SlimushRenderer extends MobRenderer<SlimushEntity, SlimushModel<SlimushEntity>> {

    public SlimushRenderer(EntityRendererProvider.Context context) {
        super(context, new SlimushModel<>(context.bakeLayer(SlimushModel.LAYER_LOCATION)), 0.25f);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull SlimushEntity entity) {
        return ResourceLocation.fromNamespaceAndPath(WellDoneBosses.MOD_ID, "textures/entity/slimush/slimush.png");
    }

    protected void scale(Slime livingEntity, PoseStack poseStack, float partialTickTime) {
        float f = 0.999F;
        poseStack.scale(0.999F, 0.999F, 0.999F);
        poseStack.translate(0.0F, 0.001F, 0.0F);
        float f1 = (float)livingEntity.getSize();
        float f2 = Mth.lerp(partialTickTime, livingEntity.oSquish, livingEntity.squish) / (f1 * 0.5F + 1.0F);
        float f3 = 1.0F / (f2 + 1.0F);
        poseStack.scale(f3 * f1, 1.0F / f3 * f1, f3 * f1);
    }
}