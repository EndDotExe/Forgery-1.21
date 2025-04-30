// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class tridentecho extends EntityModel<Entity> {
	private final ModelPart everything;
	private final ModelPart handle;
	private final ModelPart handletrails;
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart centrespike;
	private final ModelPart sidespike1;
	private final ModelPart sidespike2;
	public tridentecho(ModelPart root) {
		this.everything = root.getChild("everything");
		this.handle = this.everything.getChild("handle");
		this.handletrails = this.everything.getChild("handletrails");
		this.bone = this.handletrails.getChild("bone");
		this.bone2 = this.handletrails.getChild("bone2");
		this.bone3 = this.handletrails.getChild("bone3");
		this.centrespike = this.everything.getChild("centrespike");
		this.sidespike1 = this.everything.getChild("sidespike1");
		this.sidespike2 = this.everything.getChild("sidespike2");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData everything = modelPartData.addChild("everything", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 22.0F, 0.0F));

		ModelPartData handle = everything.addChild("handle", ModelPartBuilder.create().uv(-1, -1).cuboid(-1.0F, -12.0F, -1.0F, 1.0F, 1.0F, 3.0F, new Dilation(0.0F))
		.uv(1, 1).cuboid(-1.0F, -11.0F, 0.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData handletrails = everything.addChild("handletrails", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.0F, 0.0F));

		ModelPartData bone = handletrails.addChild("bone", ModelPartBuilder.create().uv(1, 1).cuboid(-1.0F, -9.0F, 0.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bone2 = handletrails.addChild("bone2", ModelPartBuilder.create().uv(1, 1).cuboid(-1.0F, -4.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bone3 = handletrails.addChild("bone3", ModelPartBuilder.create().uv(1, 1).cuboid(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData centrespike = everything.addChild("centrespike", ModelPartBuilder.create().uv(-1, -1).cuboid(-1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 3.0F, new Dilation(0.0F))
		.uv(1, 1).cuboid(-1.0F, -9.0F, 0.0F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -13.0F, 0.0F));

		ModelPartData sidespike1 = everything.addChild("sidespike1", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -19.0F, 3.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(1, 1).cuboid(-1.0F, -22.0F, 3.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 2.0F, 0.0F));

		ModelPartData sidespike2 = everything.addChild("sidespike2", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -1.0F, -2.0F, 1.0F, 3.0F, 2.0F, new Dilation(0.0F))
		.uv(1, 1).cuboid(-1.0F, -4.0F, -1.0F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -16.0F, -2.0F));
		return TexturedModelData.of(modelData, 16, 16);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		everything.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}