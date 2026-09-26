package net.edenuuu.welldonebosses;

import net.edenuuu.welldonebosses.entity.ModEntities;
import net.edenuuu.welldonebosses.entity.client.SlimushRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import static net.edenuuu.welldonebosses.WellDoneBosses.MOD_ID;

// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@EventBusSubscriber(modid = MOD_ID,value = Dist.CLIENT)
public class ClientModEvents {

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        EntityRenderers.register(ModEntities.SLIMUSH.get(), SlimushRenderer::new);
    }
}
