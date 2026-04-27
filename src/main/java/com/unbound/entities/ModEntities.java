package com.unbound.entities;

/*
this is for the registration of entities
any time we want to tell the game that we are adding a new mob, we would do so here
 */

import com.unbound.bossesunbound;
import com.unbound.entities.custom.GoblinEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    // this is the creation of the new registry category as an object
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, bossesunbound.MODID);


    // this is where each entity we want to register will be instantiated. we specify the entity type, as well as a couple of other details like hitbox
    public static final Supplier<EntityType<GoblinEntity>> GOBLIN =
            ENTITY_TYPES.register("goblin", () -> EntityType.Builder.of(GoblinEntity::new, MobCategory.CREATURE)
                    .sized(0.7f, 0.9f).build("goblin"));


    // all of the entities that are created above will be registered in one action with the method below
    public static void register(IEventBus bus){
        ENTITY_TYPES.register(bus);
    }
}
