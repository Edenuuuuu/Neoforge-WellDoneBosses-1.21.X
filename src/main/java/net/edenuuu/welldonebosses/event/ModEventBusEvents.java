package net.edenuuu.welldonebosses.event;

import net.edenuuu.welldonebosses.WellDoneBosses;
import net.edenuuu.welldonebosses.entity.ModEntities;
import net.edenuuu.welldonebosses.entity.client.SlimushModel;
import net.edenuuu.welldonebosses.entity.custom.SlimushEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = WellDoneBosses.MOD_ID)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(SlimushModel.LAYER_LOCATION, SlimushModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.SLIMUSH.get(), SlimushEntity.createAttributes().build());
    }
}
