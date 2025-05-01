package net.end.forgery.entity.client;

import net.end.forgery.entity.custom.CopperTridentProjectileEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class CopperTridentProjectileModel extends EntityModel<CopperTridentProjectileEntity> {
    private final ModelPart copper_trident;
    public static final EntityModelLayer COPPER_TRIDENT = new EntityModelLayer(Identifier.of("forgery", "copper_trident"), "main");

    public CopperTridentProjectileModel(ModelPart root)
    {this.copper_trident = root.getChild("tomahawk");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData group = modelPartData.addChild("group", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -16.0F, 2.0F, 1.0F, 19.0F, 1.0F, new Dilation(0.0F))
                .uv(4, 6).cuboid(-1.0F, -17.0F, 1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
                .uv(4, 10).cuboid(-1.0F, -23.0F, 2.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F))
                .uv(4, 0).cuboid(-1.0F, -26.0F, 1.0F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F))
                .uv(12, 10).cuboid(-1.0F, -27.0F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(8, 15).cuboid(-1.0F, -27.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(16, 0).cuboid(-1.0F, -27.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(8, 10).cuboid(-1.0F, -32.0F, 4.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(12, 0).cuboid(-1.0F, -32.0F, 0.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(12, 14).cuboid(-1.0F, -27.0F, 5.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(12, 5).cuboid(-1.0F, -33.0F, 2.0F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F))
                .uv(16, 2).cuboid(-1.0F, -28.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 25.0F, -2.0F));
        return TexturedModelData.of(modelData, 32, 32);
    }

    @Override
    public void setAngles(CopperTridentProjectileEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
        copper_trident.render(matrices, vertices, light, overlay, color);
    }
}