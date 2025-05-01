package net.end.forgery.item.custom;

import net.end.forgery.entity.custom.CopperTridentProjectileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.TridentItem;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class LightningtridentItem extends TridentItem {
    public LightningtridentItem(Item.Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(null, user.getX(), user.getY(), user.getZ(), SoundEvents.ITEM_TRIDENT_THROW, user.getSoundCategory(), 1.0F, 1.0F);
        if (!world.isClient) {
            CopperTridentProjectileEntity coppertrident = new CopperTridentProjectileEntity(world, user);
            coppertrident.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 2.5F, 0.0F);
            world.spawnEntity(coppertrident);
        }
        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(0);
        }
        return TypedActionResult.success(itemStack, world.isClient());
    }
}
