package com.unbound.entities.custom;

/*
the main class for the smaller goblins
this is where all of the mod functionality should be, including ai
 */

import com.unbound.entities.GoblinVariant;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.BodyRotationControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.storage.loot.LootTable;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class GoblinEntity extends Animal {

    public static final AnimationState idleAnimState = new AnimationState();
    private int idleAnimTimeout = 0;

    // this is where we add the variants
    private static final EntityDataAccessor<Integer> VARIANT =
            SynchedEntityData.defineId(GoblinEntity.class, EntityDataSerializers.INT);

    // these are the loot tables for their respective variants
    private static final ResourceKey<LootTable> DEFAULT_LOOT  = ResourceKey.create(Registries.LOOT_TABLE,
            ResourceLocation.fromNamespaceAndPath("bossesunbound", "entities/goblin_default"));
    private static final ResourceKey<LootTable> TRAVELER_LOOT = ResourceKey.create(Registries.LOOT_TABLE,
            ResourceLocation.fromNamespaceAndPath("bossesunbound", "entities/goblin_traveler"));
    private static final ResourceKey<LootTable> ARMORED_LOOT  = ResourceKey.create(Registries.LOOT_TABLE,
            ResourceLocation.fromNamespaceAndPath("bossesunbound", "entities/goblin_armored"));


    public GoblinEntity(EntityType<? extends Animal> p_27557_, Level p_27558_) {
        super(p_27557_, p_27558_);
    }

    // the method that grabs the correct loot table for any variant
    @Override
    public ResourceKey<LootTable> getDefaultLootTable() {
        return switch (this.getVariant()) {
            case TRAVELER -> TRAVELER_LOOT;
            case ARMORED -> ARMORED_LOOT;
            default -> DEFAULT_LOOT;
        };
    }

    @Override
    protected void registerGoals(){
        // this is the ai for the entity
        // we are currently using a placeholder ai
        this.goalSelector.addGoal(0, new FloatGoal(this));

        this.goalSelector.addGoal(1, new PanicGoal(this, 2.0));

        this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes(){
        // these are just your simple entity attributes, which you can add many of. check the attributes class to see the full list
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 8d)
                .add(Attributes.MOVEMENT_SPEED, 0.15D)
                .add(Attributes.FOLLOW_RANGE, 16.0D)
                .add(Attributes.ATTACK_SPEED)
                .add(Attributes.ATTACK_DAMAGE)
                .add(Attributes.ARMOR);
    }

    @Override
    public boolean isFood(ItemStack itemStack) {
        return false;
    }

    @Override
    protected BodyRotationControl createBodyControl() {
        return new BodyRotationControl(this);
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return null;
    }

    // adding variant code below

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(VARIANT, 0);
    }

    private int getTypeVariant() {
        return this.entityData.get(VARIANT);
    }

    public GoblinVariant getVariant() {
        return GoblinVariant.byId(this.getTypeVariant() & 255);
    }

    private void setVariant(GoblinVariant variant) {
        this.entityData.set(VARIANT, variant.getId() & 255);
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putInt("Variant", this.getTypeVariant());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        this.entityData.set(VARIANT, compound.getInt("Variant"));
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor level, DifficultyInstance difficulty,
                                        MobSpawnType spawnType, @Nullable SpawnGroupData spawnGroupData) {
        GoblinVariant variant = GoblinVariant.getRandom(this.random); // calls the random variant method in the GoblinVariant enum
        this.setVariant(variant);
        this.applyVariantAttributes(); // calling the method below this one
        return super.finalizeSpawn(level, difficulty, spawnType, spawnGroupData);
    }

    private void applyVariantAttributes() {
        switch (this.getVariant()) {
            case ARMORED -> { // the armored variant gets more armor
                Objects.requireNonNull(this.getAttribute(Attributes.ARMOR)).setBaseValue(8.0D);
                Objects.requireNonNull(this.getAttribute(Attributes.MAX_HEALTH)).setBaseValue(10d);
                Objects.requireNonNull(this.getAttribute(Attributes.MOVEMENT_SPEED)).setBaseValue(0.12D);
                this.setHealth(10f);
            }
            case TRAVELER -> { // the traveler variant gets more health and slightly more speed
                Objects.requireNonNull(this.getAttribute(Attributes.ARMOR)).setBaseValue(2.0D);
                Objects.requireNonNull(this.getAttribute(Attributes.MOVEMENT_SPEED)).setBaseValue(0.18D);
                Objects.requireNonNull(this.getAttribute(Attributes.MAX_HEALTH)).setBaseValue(9d);
                // when changing the max health attribute, it doesn't sync the health to the new value. we need to manually set that
                this.setHealth(9f);
            }
            default -> {
            }
        }
    }

    /*
    ive temporarily disabled animations as we figure that out.
     */

//    private void setupAnimationStates() {
//        if(this.idleAnimTimeout <= 0) {
//            this.idleAnimTimeout = 80;
//            this.idleAnimTimeout.start(this.tickCount);
//        } else {
//            --this.idleAnimTimeout;
//        }
//    }

//    @Override
//    public void tick() {
//        super.tick();
//
//        if(this.level().isClientSide()) {
//            this.setupAnimationStates();
//        }
//    }
}
