package com.unbound.entities.custom;

/*
the main class for the smaller goblins
this is where all of the mod functionality should be, including ai
 */

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.BodyRotationControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class GoblinEntity extends Animal {

    public static final AnimationState idleAnimState = new AnimationState();
    private int idleAnimTimeout = 0;

    public GoblinEntity(EntityType<? extends Animal> p_27557_, Level p_27558_) {
        super(p_27557_, p_27558_);
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
                .add(Attributes.MOVEMENT_SPEED, 0.05D)
                .add(Attributes.FOLLOW_RANGE, 16.0D)
                .add(Attributes.ATTACK_SPEED)
                .add(Attributes.ATTACK_DAMAGE);
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
