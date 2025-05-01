package net.end.forgery.entity.client;

import net.end.forgery.entity.custom.CopperTridentProjectileEntity;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;

public class CopperTridentProjectileRenderer extends EntityRenderer<CopperTridentProjectileEntity> {
    protected CopperTridentProjectileModel model;

    public CopperTridentProjectileRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
        this.model = new CopperTridentProjectileModel(ctx.getPart(CopperTridentProjectileModel.COPPER_TRIDENT));
    }

    @Override
    public Identifier getTexture(CopperTridentProjectileEntity entity) {
        return null;
    }
}
