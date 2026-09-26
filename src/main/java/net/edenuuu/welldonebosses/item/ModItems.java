package net.edenuuu.welldonebosses.item;

import net.edenuuu.welldonebosses.WellDoneBosses;
import net.edenuuu.welldonebosses.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WellDoneBosses.MOD_ID);

    public static final DeferredItem<Item> SLIMUSH_SPAWN_EGG = ITEMS.register("slimush_spawn_egg",
            () -> new DeferredSpawnEggItem(ModEntities.SLIMUSH, 0x31afaf, 0xffac00,
                    new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
