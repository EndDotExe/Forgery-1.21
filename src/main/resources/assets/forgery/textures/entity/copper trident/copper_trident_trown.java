// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class copper_trident_trown extends EntityModel<Entity> {
	private final ModelPart group;
	public copper_trident_trown(ModelPart root) {
		this.group = root.getChild("group");
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
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		group.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}