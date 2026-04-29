package com.unbound.entities.client;

import com.cmdpro.databank.model.DatabankModel;
import com.cmdpro.databank.model.DatabankModels;
import com.cmdpro.databank.model.entity.DatabankEntityModel;
import com.cmdpro.databank.model.entity.DatabankLivingEntityModel;
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
import net.minecraft.util.Mth;
import net.minecraft.world.phys.Vec2;

import java.util.Map;

public class GoblinRenderer extends DatabankLivingEntityRenderer<GoblinEntity> {
//    private static final Map<GoblinVariant, ResourceLocation> LOCATION_BY_VARIANT =
//            Util.make(Maps.newEnumMap(GoblinVariant.class), map -> {
//                map.put(GoblinVariant.DEFAULT,
//                        ResourceLocation.fromNamespaceAndPath(bossesunbound.MODID, "textures/entity/goblin/goblin_default.png"));
//                map.put(GoblinVariant.TRAVELER,
//                        ResourceLocation.fromNamespaceAndPath(bossesunbound.MODID, "textures/entity/goblin/goblin_traveler.png"));
//                map.put(GoblinVariant.ARMORED,
//                        ResourceLocation.fromNamespaceAndPath(bossesunbound.MODID, "textures/entity/goblin/goblin_armored.png"));
//            });
    private static final Map<GoblinVariant, String> LOCATION_BY_VARIANT =
        Util.make(Maps.newEnumMap(GoblinVariant.class), map -> {
            map.put(GoblinVariant.DEFAULT, "textures/entity/goblin/goblin_default.png");
            map.put(GoblinVariant.TRAVELER, "textures/entity/goblin/goblin_traveler.png");
            map.put(GoblinVariant.ARMORED, "textures/entity/goblin/goblin_armored.png");
        });

//        this.addLayer(new ItemInHandLayer<>(this, context.getItemInHandRenderer()));

    public GoblinRenderer(EntityRendererProvider.Context context) {
        super(context, new Model(), 0.25f);
    }

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

    public static class Model extends DatabankLivingEntityModel<GoblinEntity> {
        public DatabankModel model;
        public DatabankModel getModel() {
            if (model == null) {
                model = DatabankModels.models.get(bossesunbound.locate("goblin"));
            }
            return model;
        }
        @Override
        public ResourceLocation getTextureLocation() {
            return bossesunbound.locate(LOCATION_BY_VARIANT.get(entity.getVariant()));
//            return bossesunbound.locate("textures/entity/goblin.png");
        }

        @Override
        public void setupModelPose(GoblinEntity pEntity, float partialTick) {
            pEntity.animState.updateAnimDefinitions(getModel());
            animate(pEntity.animState);
            Vec2 rot = new Vec2(Mth.lerp(partialTick, pEntity.xRotO, pEntity.getXRot()), Mth.rotLerp(partialTick, pEntity.yHeadRotO, pEntity.yHeadRot));
            float bodyRot = Mth.rotLerp(partialTick, pEntity.yBodyRotO, pEntity.yBodyRot);
            modelPose.stringToPart.get("head").rotation.x = rot.x * (float) (Math.PI / 180.0);
            modelPose.stringToPart.get("head").rotation.y = (rot.y-bodyRot) * (float) (Math.PI / 180.0);
        }
    }
}
