package net.end.forgery.mixin;

import net.end.forgery.Forgery;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ModelLoader.class)
public abstract class ModelLoaderMixin {
    @Shadow
    protected abstract void loadItemModel(ModelIdentifier id);

    @Inject(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/model/ModelLoader;loadItemModel(Lnet/minecraft/client/util/ModelIdentifier;)V", ordinal = 1))
    private void onInit(CallbackInfo ci) {
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Forgery.MOD_ID, "edge_of_frailtybig")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Forgery.MOD_ID, "blighted_bladebig")));
        this.loadItemModel(ModelIdentifier.ofInventoryVariant(Identifier.of(Forgery.MOD_ID, "frigid_flambergebig")));
    }
}