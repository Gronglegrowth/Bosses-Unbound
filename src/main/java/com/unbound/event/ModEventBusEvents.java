package com.unbound.event;

import com.unbound.bossesunbound;
import com.unbound.entities.ModEntities;
import com.unbound.entities.client.GoblinModel;
import com.unbound.entities.custom.GoblinEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = bossesunbound.MODID)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(GoblinModel.LAYER_LOCATION, GoblinModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.GOBLIN.get(), GoblinEntity.createAttributes().build());
    }
}
