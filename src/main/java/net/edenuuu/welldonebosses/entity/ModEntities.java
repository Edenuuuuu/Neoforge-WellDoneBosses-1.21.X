package net.edenuuu.welldonebosses.entity;

import net.edenuuu.welldonebosses.WellDoneBosses;
import net.edenuuu.welldonebosses.entity.custom.SlimushEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, WellDoneBosses.MOD_ID);

    public static final Supplier<EntityType<SlimushEntity>> SLIMUSH =
            ENTITY_TYPES.register("slimush", () -> EntityType.Builder.of(SlimushEntity::new, MobCategory.MONSTER)
                    .sized(0.52F, 0.52F).eyeHeight(0.325F).spawnDimensionsScale(4.0F).build("slimush"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }

}
