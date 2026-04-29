package com.unbound.entities.client;

import com.cmdpro.databank.model.entity.DatabankEntityModel;
import com.cmdpro.databank.model.entity.DatabankLivingEntityRenderer;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.unbound.bossesunbound;
import com.unbound.entities.GoblinVariant;
import com.unbound.entities.custom.GoblinEntity;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;

import java.util.Map;

public class GoblinRenderer extends DatabankLivingEntityRenderer<GoblinEntity> {
    private static final Map<GoblinVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(GoblinVariant.class), map -> {
                map.put(GoblinVariant.DEFAULT,
                        ResourceLocation.fromNamespaceAndPath(bossesunbound.MODID, "textures/entity/goblin/goblin_default.png"));
                map.put(GoblinVariant.TRAVELER,
                        ResourceLocation.fromNamespaceAndPath(bossesunbound.MODID, "textures/entity/goblin/goblin_traveler.png"));
                map.put(GoblinVariant.ARMORED,
                        ResourceLocation.fromNamespaceAndPath(bossesunbound.MODID, "textures/entity/goblin/goblin_armored.png"));
            });

    public GoblinRenderer(EntityRendererProvider.Context context, DatabankEntityModel<GoblinEntity> model, float shadowRadius) {
        super(context, model, shadowRadius);
//        this.addLayer(new ItemInHandLayer<>(this, context.getItemInHandRenderer()));
    }

//    public GoblinRenderer(EntityRendererProvider.Context context) {
//        super(context, new GoblinModel<>(context.bakeLayer(GoblinModel.LAYER_LOCATION)), 0.25f);
//
//        this.addLayer(new ItemInHandLayer<>(this, context.getItemInHandRenderer()));
//    }

    @Override
    public ResourceLocation getTextureLocation(GoblinEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(GoblinEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.45f, 0.45f, 0.45f);
        } else {
            poseStack.scale(1f, 1f, 1f);
        }

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);
    }
}
