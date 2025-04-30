package net.end.forgery.mixin;

import net.end.forgery.item.custom.BlockInteractionRangeTool;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mixin(PlayerEntity.class)
public class BlockIntRangeMixin {

	@Unique
	private static final Logger LOGGER = LogManager.getLogger("BlockIntRangeMixin");

	@Inject(method = "createPlayerAttributes", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/attribute/DefaultAttributeContainer$Builder;add(Lnet/minecraft/registry/entry/RegistryEntry;)Lnet/minecraft/entity/attribute/DefaultAttributeContainer$Builder;"), cancellable = true)
	private static void modifyPlayerAttributes(CallbackInfoReturnable<DefaultAttributeContainer.Builder> cir) {
		MinecraftClient client = MinecraftClient.getInstance();
		if (client != null && client.player != null && client.player.getMainHandStack().getItem() instanceof BlockInteractionRangeTool) {
			LOGGER.info("BlockInteractionRangeTool detected, modifying player attributes.");
			DefaultAttributeContainer.Builder builder = cir.getReturnValue();
			builder.add(EntityAttributes.PLAYER_BLOCK_INTERACTION_RANGE, 10.0);
			builder.add(EntityAttributes.PLAYER_ENTITY_INTERACTION_RANGE, 10.0);
			cir.setReturnValue(builder.add(EntityAttributes.PLAYER_BLOCK_INTERACTION_RANGE, 10.0));
		} else {
			LOGGER.info("BlockInteractionRangeTool not detected.");
		}
	}
}