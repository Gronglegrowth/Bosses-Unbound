package com.unbound.entities.client;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class GoblinAnimations {
        public static final AnimationDefinition walk = AnimationDefinition.Builder.withLength(1.0F).looping()
                // Torso rocks forward/back (replaces math.sin on rotation x)
                .addAnimation("torso", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,   KeyframeAnimations.degreeVec( 4.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.25F,  KeyframeAnimations.degreeVec( 0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,   KeyframeAnimations.degreeVec(-4.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,  KeyframeAnimations.degreeVec( 0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,   KeyframeAnimations.degreeVec( 4.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // Torso bobs up/down (replaces math.sin on position y)
                .addAnimation("torso", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,   KeyframeAnimations.posVec(0.0F,  0.2F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.25F,  KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,   KeyframeAnimations.posVec(0.0F, -0.2F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,  KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,   KeyframeAnimations.posVec(0.0F,  0.2F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // Head bobs slightly
                .addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,   KeyframeAnimations.degreeVec( 7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,   KeyframeAnimations.degreeVec( 3.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,   KeyframeAnimations.degreeVec( 7.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // Left arm swings (opposite phase to left leg)
                .addAnimation("left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,   KeyframeAnimations.degreeVec( 0.0F, -4.0F, -49.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,   KeyframeAnimations.degreeVec( 0.0F,  4.0F, -41.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,   KeyframeAnimations.degreeVec( 0.0F, -4.0F, -49.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // Right arm swings opposite
                .addAnimation("right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,   KeyframeAnimations.degreeVec( 0.0F,  4.0F, 49.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,   KeyframeAnimations.degreeVec( 0.0F, -4.0F, 41.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,   KeyframeAnimations.degreeVec( 0.0F,  4.0F, 49.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // Left leg strides forward/back
                .addAnimation("left_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,   KeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,   KeyframeAnimations.degreeVec( 35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,   KeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // Right leg opposite phase
                .addAnimation("right_leg", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,   KeyframeAnimations.degreeVec( 35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,   KeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,   KeyframeAnimations.degreeVec( 35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // Nose and helmet wobble slightly with head
                .addAnimation("nose", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,   KeyframeAnimations.degreeVec( 4.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,   KeyframeAnimations.degreeVec(-4.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,   KeyframeAnimations.degreeVec( 4.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("helmet", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,   KeyframeAnimations.degreeVec(-4.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,   KeyframeAnimations.degreeVec( 4.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,   KeyframeAnimations.degreeVec(-4.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .build();

        public static final AnimationDefinition idle = AnimationDefinition.Builder.withLength(2.0F).looping()
                // Torso sways side to side
                .addAnimation("torso", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,   KeyframeAnimations.degreeVec(0.0F, 0.0F,  5.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,   KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0F,   KeyframeAnimations.degreeVec(0.0F, 0.0F,  5.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // Torso breathes up/down
                .addAnimation("torso", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,   KeyframeAnimations.posVec(0.0F,  0.1F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,   KeyframeAnimations.posVec(0.0F, -0.1F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0F,   KeyframeAnimations.posVec(0.0F,  0.1F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // Head counter-sways and nods gently
                .addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,   KeyframeAnimations.degreeVec(-2.0F, 0.0F, -5.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,   KeyframeAnimations.degreeVec( 2.0F, 0.0F, -5.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0F,   KeyframeAnimations.degreeVec(-2.0F, 0.0F, -5.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // Helmet mirrors head nod
                .addAnimation("helmet", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,   KeyframeAnimations.degreeVec(-2.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,   KeyframeAnimations.degreeVec( 2.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0F,   KeyframeAnimations.degreeVec(-2.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // Arms sway gently
                .addAnimation("left_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,   KeyframeAnimations.degreeVec(0.0F, 0.0F, -9.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,   KeyframeAnimations.degreeVec(0.0F, 0.0F, -1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0F,   KeyframeAnimations.degreeVec(0.0F, 0.0F, -9.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("right_arm", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,   KeyframeAnimations.degreeVec(0.0F, 0.0F,  4.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,   KeyframeAnimations.degreeVec(0.0F, 0.0F, -4.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0F,   KeyframeAnimations.degreeVec(0.0F, 0.0F,  4.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .build();}
