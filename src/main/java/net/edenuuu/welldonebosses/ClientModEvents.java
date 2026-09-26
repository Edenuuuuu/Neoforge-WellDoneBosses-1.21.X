package net.edenuuu.welldonebosses;

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
    }
}
