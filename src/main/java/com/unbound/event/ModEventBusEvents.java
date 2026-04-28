package com.unbound.event;

import com.unbound.bossesunbound;
import com.unbound.entities.ModEntities;
import com.unbound.entities.client.GoblinKingModel;
import com.unbound.entities.client.GoblinModel;
import com.unbound.entities.custom.GoblinEntity;
import com.unbound.entities.custom.GoblinKingEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.IEventBus;

@EventBusSubscriber(modid = bossesunbound.MODID)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(GoblinModel.LAYER_LOCATION, GoblinModel::createBodyLayer);
        event.registerLayerDefinition(GoblinKingModel.LAYER_LOCATION, GoblinKingModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.GOBLIN.get(), GoblinEntity.createAttributes().build());
        event.put(ModEntities.GOBLIN_KING.get(), GoblinKingEntity.createAttributes().build());
    }
}
