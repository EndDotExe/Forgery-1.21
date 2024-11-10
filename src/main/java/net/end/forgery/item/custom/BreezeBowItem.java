package net.end.forgery.item.custom;

import net.end.forgery.entity.ModEntities;
import net.end.forgery.entity.custom.WindArrowEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class BreezeBowItem extends BowItem {
    public BreezeBowItem(Settings settings) {
        super(settings);
    }

    public void onStoppedUsing(ItemStack stack, World world, PlayerEntity user, int remainingUseTicks) {
        if (!world.isClient) {
            WindArrowEntity windCharge = new WindArrowEntity(ModEntities.WIND_ARROW_ENTITY, world);
            windCharge.setPos(user.getX(), user.getEyeY() - 0.1, user.getZ());
            windCharge.setOwner(user);
            windCharge.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 4.0F, 1.0F); // Adjust the velocity as needed

            world.spawnEntity(windCharge);
            world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ENTITY_BREEZE_WIND_BURST, SoundCategory.PLAYERS, 1.0F, 1.0F);
        }

        user.getItemCooldownManager().set(this, 20); // Adjust cooldown as needed
    }
}