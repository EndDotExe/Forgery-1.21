package net.end.forgery.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Enchantment.class)
public class EnchantmentMixin {

    @Inject(method = "getMinPower", at = @At("HEAD"), cancellable = true)
    private void increaseGoldEnchantability(int level, CallbackInfoReturnable<Integer> cir) {
        // Assuming you have a way to get the ItemStack, for example from a context or a static method
        ItemStack stack = getItemStackFromContext();
        if (stack.getItem() == Items.GOLDEN_SWORD || stack.getItem() == Items.GOLDEN_PICKAXE ||
                stack.getItem() == Items.GOLDEN_AXE || stack.getItem() == Items.GOLDEN_SHOVEL ||
                stack.getItem() == Items.GOLDEN_HOE || stack.getItem() == Items.GOLDEN_HELMET  ||
                stack.getItem() == Items.GOLDEN_CHESTPLATE || stack.getItem() == Items.GOLDEN_LEGGINGS
                || stack.getItem() == Items.GOLDEN_BOOTS) {
            cir.setReturnValue(3 + level * 10);
        }
    }


    @Unique
    private ItemStack getItemStackFromContext() {

        return ItemStack.EMPTY;
    }
}