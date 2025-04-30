package net.end.forgery.item.custom;

import net.end.forgery.entity.custom.TridentEchoEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.TridentItem;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class EchotridentItem extends TridentItem {
    public EchotridentItem(Item.Settings settings) {
        super(settings);
    }
/*
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        if (!world.isClient) {
            TridentEntity tridentEntity = new TridentEntity(world, user, itemStack);
            tridentEntity.setProperties(user, user.getPitch(), user.getYaw(), 0.0F, 2.5F, 1.0F);
            world.spawnEntity(tridentEntity);
        }
        user.getItemCooldownManager().set(this, 20); // Set cooldown for the trident
        return TypedActionResult.success(itemStack, world.isClient());
    } */
}