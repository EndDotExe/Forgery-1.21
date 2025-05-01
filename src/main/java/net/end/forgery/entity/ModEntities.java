package net.end.forgery.entity;

import net.end.forgery.Forgery;
import net.end.forgery.entity.custom.CopperTridentProjectileEntity;
import net.end.forgery.entity.custom.WindArrowEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<WindArrowEntity> WIND_ARROW = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of("forgery", "wind_arrow"),
            EntityType.Builder.create(WindArrowEntity::new, SpawnGroup.MISC)
                    .dimensions(EntityType.ARROW.getWidth(), EntityType.ARROW.getHeight())
                    .build(Identifier.of("forgery", "wind_arrow").toString())
    );
    public static final EntityType<CopperTridentProjectileEntity> COPPER_TRIDENT_PROJECTILE = Registry.register(
            Registries.ENTITY_TYPE,
            Identifier.of(Forgery.MOD_ID,"copper_trident"),
            EntityType.Builder.<CopperTridentProjectileEntity>create(CopperTridentProjectileEntity::new, SpawnGroup.MISC)
                    .dimensions(2.0f, 1.0f).build());;


    public static void registerModEntities() {
        Forgery.LOGGER.info("Registering Mod Entities for " + Forgery.MOD_ID);
        // This method can be used to register other entities if needed
    }
}