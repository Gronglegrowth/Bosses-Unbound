package com.unbound.entities.client;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class GoblinKingAnimations {

        // -------------------------------------------------------------------------
        // WALK  (looping, length 1.0F — Molang expressions converted to keyframes)
        // -------------------------------------------------------------------------
        public static final AnimationDefinition walk = AnimationDefinition.Builder.withLength(1.0F).looping()
                // jaw chatters as he walks
                .addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,  KeyframeAnimations.degreeVec( 5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.25F, KeyframeAnimations.degreeVec( 0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,  KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F, KeyframeAnimations.degreeVec( 0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,  KeyframeAnimations.degreeVec( 5.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // eyebrows bounce
                .addAnimation("eyebrows", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,  KeyframeAnimations.posVec(0.0F,  0.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,  KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,  KeyframeAnimations.posVec(0.0F,  0.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // ears flap side to side
                .addAnimation("earLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,  KeyframeAnimations.degreeVec(0.0F, 0.0F, -15.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,  KeyframeAnimations.degreeVec(0.0F, 0.0F,  15.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,  KeyframeAnimations.degreeVec(0.0F, 0.0F, -15.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("earRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,  KeyframeAnimations.degreeVec(0.0F, 0.0F,  15.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,  KeyframeAnimations.degreeVec(0.0F, 0.0F, -15.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,  KeyframeAnimations.degreeVec(0.0F, 0.0F,  15.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // arms swing (held out at 57.5 z, swinging on y)
                .addAnimation("armRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,  KeyframeAnimations.degreeVec(0.0F,  30.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,  KeyframeAnimations.degreeVec(0.0F, -30.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,  KeyframeAnimations.degreeVec(0.0F,  30.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("armLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,  KeyframeAnimations.degreeVec(0.0F,  30.0F, 57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,  KeyframeAnimations.degreeVec(0.0F, -30.0F, 57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,  KeyframeAnimations.degreeVec(0.0F,  30.0F, 57.5F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // legs stride forward/back (opposite phases) with a slight bob
                .addAnimation("legRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,  KeyframeAnimations.degreeVec( 30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,  KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,  KeyframeAnimations.degreeVec( 30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("legRight", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,  KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,  KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,  KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("legLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,  KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,  KeyframeAnimations.degreeVec( 30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,  KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("legLeft", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,  KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.25F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,  KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,  KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // belly bounces
                .addAnimation("belly", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,  KeyframeAnimations.posVec(0.0F,  0.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,  KeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,  KeyframeAnimations.posVec(0.0F,  0.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // mace sways gently while walking
                .addAnimation("mace", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,  KeyframeAnimations.degreeVec(0.0F,  20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,  KeyframeAnimations.degreeVec(0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,  KeyframeAnimations.degreeVec(0.0F,  20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // body bobs up and down
                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,  KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,  KeyframeAnimations.posVec(0.0F,  1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,  KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .build();

        // -------------------------------------------------------------------------
        // IDLE  (looping, length 3.67F — Molang expressions converted to keyframes)
        // -------------------------------------------------------------------------
        public static final AnimationDefinition idle = AnimationDefinition.Builder.withLength(3.67F).looping()
                // eyes blink (two quick blinks around t=2.75–3.0, plain keyframes kept as-is)
                .addAnimation("eyes", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(2.75F,    KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.8333F,  KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.875F,   KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.0F,     KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // eyebrows sway slowly
                .addAnimation("eyebrows", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,    KeyframeAnimations.posVec(0.0F, -0.2F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.835F,  KeyframeAnimations.posVec(0.0F,  0.2F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.67F,   KeyframeAnimations.posVec(0.0F, -0.2F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // ears sway gently
                .addAnimation("earLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,    KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.835F,  KeyframeAnimations.degreeVec(0.0F, 0.0F,  10.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.67F,   KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("earRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,    KeyframeAnimations.degreeVec(0.0F, 0.0F,  10.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.835F,  KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.67F,   KeyframeAnimations.degreeVec(0.0F, 0.0F,  10.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // arms breathe/sway slightly
                .addAnimation("armRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,    KeyframeAnimations.degreeVec(0.0F, 0.0F, -62.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.835F,  KeyframeAnimations.degreeVec(0.0F, 0.0F, -52.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.67F,   KeyframeAnimations.degreeVec(0.0F, 0.0F, -62.5F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("armLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,    KeyframeAnimations.degreeVec(0.0F, 0.0F, 56.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.835F,  KeyframeAnimations.degreeVec(0.0F, 0.0F, 58.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.67F,   KeyframeAnimations.degreeVec(0.0F, 0.0F, 56.5F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // belly breathes in and out
                .addAnimation("belly", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,    KeyframeAnimations.posVec(0.0F, 0.3F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.835F,  KeyframeAnimations.posVec(0.0F, 0.8F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.67F,   KeyframeAnimations.posVec(0.0F, 0.3F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("belly", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F,    KeyframeAnimations.scaleVec(1.0F, 1.0F,  1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.835F,  KeyframeAnimations.scaleVec(1.0F, 1.03F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.67F,   KeyframeAnimations.scaleVec(1.0F, 1.0F,  1.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .build();

        // -------------------------------------------------------------------------
        // SWING  (hold, length 0.875F — all plain keyframes, direct transcription)
        // -------------------------------------------------------------------------
        public static final AnimationDefinition swing = AnimationDefinition.Builder.withLength(0.875F)
                .addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,    KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.25F,   KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,    KeyframeAnimations.degreeVec( 10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,    KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,    KeyframeAnimations.posVec(0.0F, -0.3F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("eyebrows", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,      KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.2917F,   KeyframeAnimations.posVec(0.0F,  0.6F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.4583F,   KeyframeAnimations.posVec(0.0F, -0.4F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,     KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("earLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.3333F,  KeyframeAnimations.degreeVec(      0.0F,       0.0F,       0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.625F,   KeyframeAnimations.degreeVec(    -4.6293F,  24.5948F, -11.0097F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,    KeyframeAnimations.degreeVec(      0.0F,       0.0F,       0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("earRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.3333F,  KeyframeAnimations.degreeVec(     0.0F,       0.0F,      0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.625F,   KeyframeAnimations.degreeVec(   -4.6293F, -24.5948F,  11.0097F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,    KeyframeAnimations.degreeVec(     0.0F,       0.0F,      0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("nose", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0833F,  KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.2917F,  KeyframeAnimations.degreeVec( 12.26F,0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.6667F,  KeyframeAnimations.degreeVec( -7.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("armRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.3333F,  KeyframeAnimations.degreeVec(  0.0F,   0.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,     KeyframeAnimations.degreeVec(-19.6932F,-49.4452F,-24.5515F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,    KeyframeAnimations.degreeVec(  0.0F,   0.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("armLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,     KeyframeAnimations.degreeVec(   0.0F,    0.0F,  57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.3333F,  KeyframeAnimations.degreeVec( 125.0F,  -14.9553F, 2.9972F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.4167F,  KeyframeAnimations.degreeVec(  33.6324F,-39.8088F,51.1999F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,     KeyframeAnimations.degreeVec( -27.4888F,-19.4971F,63.0743F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,    KeyframeAnimations.degreeVec(   0.0F,    0.0F,  57.5F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("armLeft", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,     KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.3333F,  KeyframeAnimations.posVec(0.0F, 2.0F, 6.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,     KeyframeAnimations.posVec(0.0F, 0.0F, 4.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,    KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("legLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,     KeyframeAnimations.degreeVec( 0.0F, 0.0F,   0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.3333F,  KeyframeAnimations.degreeVec( 0.0F, 0.0F, -20.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,     KeyframeAnimations.degreeVec( 0.0F, 0.0F,   0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,    KeyframeAnimations.degreeVec( 0.0F, 0.0F,   0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("legLeft", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,     KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.3333F,  KeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,     KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,    KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("belly", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.3333F,  KeyframeAnimations.scaleVec(1.0F, 1.0F,  1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,     KeyframeAnimations.scaleVec(1.0F, 1.1F,  1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.625F,   KeyframeAnimations.scaleVec(1.0F, 1.0F,  1.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("mace", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.4583F,  KeyframeAnimations.degreeVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5833F,  KeyframeAnimations.degreeVec(0.0F, 17.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,  KeyframeAnimations.degreeVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,     KeyframeAnimations.degreeVec(  0.0F,   0.0F,   0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.3333F,  KeyframeAnimations.degreeVec(  0.0F,   0.0F, -12.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,     KeyframeAnimations.degreeVec(-10.0F,   0.0F,   5.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,    KeyframeAnimations.degreeVec(  0.0F,   0.0F,   0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,     KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.3333F,  KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,     KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,    KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .build();

        // -------------------------------------------------------------------------
        // SWEEP  (hold, length 1.0833F — all plain keyframes)
        // -------------------------------------------------------------------------
        public static final AnimationDefinition sweep = AnimationDefinition.Builder.withLength(1.0833F)
                .addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.2083F,   KeyframeAnimations.degreeVec( 17.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5417F,   KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,   KeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("head", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,      KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5417F,   KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,   KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5417F,   KeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,   KeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,      KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5417F,   KeyframeAnimations.posVec(0.0F, 0.5F,  0.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,   KeyframeAnimations.posVec(0.0F, 0.5F,  0.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("eyebrows", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,      KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.125F,    KeyframeAnimations.posVec(0.0F,  0.6F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.375F,    KeyframeAnimations.posVec(0.0F, -0.4F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5833F,   KeyframeAnimations.posVec(0.0F, -0.4F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,     KeyframeAnimations.posVec(0.0F, -0.4F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("earLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.3333F,   KeyframeAnimations.degreeVec(0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.625F,    KeyframeAnimations.degreeVec(0.0F,  42.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.degreeVec(0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("earRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.3333F,   KeyframeAnimations.degreeVec(0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.625F,    KeyframeAnimations.degreeVec(0.0F, -62.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.degreeVec(0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("armRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(  0.0F,    0.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.2917F,   KeyframeAnimations.degreeVec(-12.993F,  35.4918F,-35.8258F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.4583F,   KeyframeAnimations.degreeVec(-21.1305F,-59.4826F,-25.0411F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,   KeyframeAnimations.degreeVec(-21.1305F,-59.4826F,-25.0411F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.degreeVec(  0.0F,    0.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("armLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(    0.0F,     0.0F,  57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.2917F,   KeyframeAnimations.degreeVec(-168.4577F, -73.9967F,201.582F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.4583F,   KeyframeAnimations.degreeVec(   6.2461F,  19.0376F, 18.5483F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,   KeyframeAnimations.degreeVec(   6.2461F,  19.0376F, 18.5483F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.degreeVec(   0.0F,     0.0F,  57.5F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("armLeft", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,      KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.4167F,   KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.6667F,   KeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("legRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.3333F,   KeyframeAnimations.degreeVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,      KeyframeAnimations.degreeVec(0.0F, 0.0F, 20.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,     KeyframeAnimations.degreeVec(0.0F, 0.0F, 20.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.degreeVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("legRight", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.2917F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.4583F,   KeyframeAnimations.posVec(0.0F, 2.0F, -3.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,   KeyframeAnimations.posVec(0.0F, 2.0F, -3.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.8333F,   KeyframeAnimations.posVec(0.0F, 2.0F, -3.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.9167F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("legLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.3333F,   KeyframeAnimations.degreeVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5417F,   KeyframeAnimations.degreeVec(0.0F, 15.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.6667F,   KeyframeAnimations.degreeVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,   KeyframeAnimations.degreeVec(0.0F, 15.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("belly", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec( 0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.2917F,   KeyframeAnimations.degreeVec( 0.0F, -20.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.4167F,   KeyframeAnimations.degreeVec( 0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5833F,   KeyframeAnimations.degreeVec( 0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,     KeyframeAnimations.degreeVec( 0.0F,  10.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.degreeVec( 0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("belly", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,      KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.2917F,   KeyframeAnimations.posVec(0.0F,  0.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5833F,   KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,     KeyframeAnimations.posVec(0.0F, -0.75F,0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,      KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("belly", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.0F,      KeyframeAnimations.scaleVec(1.0F, 1.0F,   1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.2917F,   KeyframeAnimations.scaleVec(1.0F, 0.96F,  1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5833F,   KeyframeAnimations.scaleVec(1.0F, 1.23F,  1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,     KeyframeAnimations.scaleVec(1.0F, 1.11F,  1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.9167F,   KeyframeAnimations.scaleVec(1.0F, 1.0F,   1.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("mace", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.2917F,   KeyframeAnimations.degreeVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.4583F,   KeyframeAnimations.degreeVec(0.0F, 17.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.625F,    KeyframeAnimations.degreeVec(0.0F, 17.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.degreeVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec( 0.0F,    0.0F,   0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.3333F,   KeyframeAnimations.degreeVec( 7.8597F,-17.3455F,-2.3567F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5417F,   KeyframeAnimations.degreeVec(13.0592F, 28.3039F,12.726F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7917F,   KeyframeAnimations.degreeVec(13.0592F, 28.3039F,12.726F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0417F,   KeyframeAnimations.degreeVec( 0.0F,    0.0F,   0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .build();

        // -------------------------------------------------------------------------
        // SLAM  (hold, length 1.25F — all plain keyframes)
        // -------------------------------------------------------------------------
        public static final AnimationDefinition slam = AnimationDefinition.Builder.withLength(1.25F)
                .addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec( 0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.375F,    KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0417F,   KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.25F,     KeyframeAnimations.degreeVec( 0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.4583F,   KeyframeAnimations.degreeVec( 10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.6667F,   KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0833F,   KeyframeAnimations.degreeVec( 10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.25F,     KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("eyebrows", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.1667F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.375F,    KeyframeAnimations.posVec(0.0F, -0.3F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0417F,   KeyframeAnimations.posVec(0.0F, -0.4F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.25F,     KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("earLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.375F,    KeyframeAnimations.degreeVec(0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.625F,    KeyframeAnimations.degreeVec(0.0F,  50.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.degreeVec(0.0F, -50.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.25F,     KeyframeAnimations.degreeVec(0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("earRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.375F,    KeyframeAnimations.degreeVec(0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.625F,    KeyframeAnimations.degreeVec(0.0F, -50.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.degreeVec(0.0F,  50.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.25F,     KeyframeAnimations.degreeVec(0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("armRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(0.0F,    0.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,      KeyframeAnimations.degreeVec(0.0F,  130.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.6667F,   KeyframeAnimations.degreeVec(0.0F,  -50.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.25F,     KeyframeAnimations.degreeVec(0.0F,    0.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("armLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(   0.0F,    0.0F,  57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,      KeyframeAnimations.degreeVec(  40.0F, -130.0F,  57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.6667F,   KeyframeAnimations.degreeVec( -21.3509F,-12.1096F,62.5736F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.8333F,   KeyframeAnimations.degreeVec( -22.0075F, 18.2015F,50.6901F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.25F,     KeyframeAnimations.degreeVec(   0.0F,    0.0F,  57.5F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("belly", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0833F,   KeyframeAnimations.degreeVec( 0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.2917F,   KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,      KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.8333F,   KeyframeAnimations.degreeVec( 0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.9583F,   KeyframeAnimations.degreeVec( 0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("belly", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.125F,    KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.3333F,   KeyframeAnimations.posVec(0.0F,  0.0F,-1.2F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.6667F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.posVec(0.0F, -0.8F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,      KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("belly", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.6667F,   KeyframeAnimations.scaleVec(1.0F, 1.0F,  1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.scaleVec(1.0F, 1.1F,  1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,      KeyframeAnimations.scaleVec(1.0F, 1.0F,  1.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.375F,    KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5833F,   KeyframeAnimations.degreeVec( 10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,     KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.25F,     KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .build();

        // -------------------------------------------------------------------------
        // ROAR  (hold, length 2.2083F — Molang on jaw/ears replaced with keyframes)
        // -------------------------------------------------------------------------
        public static final AnimationDefinition roar = AnimationDefinition.Builder.withLength(2.2083F)
                .addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec( 0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.375F,    KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0F,      KeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.2083F,   KeyframeAnimations.degreeVec( 0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // jaw chatters during roar (was math.sin — approximated with fast keyframes)
                .addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.4583F,   KeyframeAnimations.degreeVec( 10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.6667F,   KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.9F,      KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.1F,      KeyframeAnimations.degreeVec(-42.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.3F,      KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.5F,      KeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.7917F,   KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0417F,   KeyframeAnimations.degreeVec( 10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.2083F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("eyebrows", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.1667F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.375F,    KeyframeAnimations.posVec(0.0F, -0.3F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0F,      KeyframeAnimations.posVec(0.0F, -0.4F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.2083F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // ears flap rapidly during roar (was math.cos — approximated)
                .addAnimation("earLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.375F,    KeyframeAnimations.degreeVec(0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.625F,    KeyframeAnimations.degreeVec(0.0F,  50.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.degreeVec(0.0F, -50.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.1F,      KeyframeAnimations.degreeVec(0.0F,  45.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.55F,     KeyframeAnimations.degreeVec(0.0F,  35.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.2083F,   KeyframeAnimations.degreeVec(0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("earRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.375F,    KeyframeAnimations.degreeVec(0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.625F,    KeyframeAnimations.degreeVec(0.0F, -50.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.degreeVec(0.0F,  50.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.1F,      KeyframeAnimations.degreeVec(0.0F, -45.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.55F,     KeyframeAnimations.degreeVec(0.0F, -35.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.2083F,   KeyframeAnimations.degreeVec(0.0F,   0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("armRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(  0.0F,    0.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,      KeyframeAnimations.degreeVec(  0.0F,  130.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.6667F,   KeyframeAnimations.degreeVec(  0.0F,  -50.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.2083F,   KeyframeAnimations.degreeVec(  0.0F,    0.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("armLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(   0.0F,    0.0F,  57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,      KeyframeAnimations.degreeVec(  40.0F, -130.0F,  57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.6667F,   KeyframeAnimations.degreeVec( -21.3509F,-12.1096F,62.5736F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.7917F,   KeyframeAnimations.degreeVec( -22.0075F, 18.2015F,50.6901F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.2083F,   KeyframeAnimations.degreeVec(   0.0F,    0.0F,  57.5F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("belly", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0833F,   KeyframeAnimations.degreeVec( 0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.2917F,   KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,      KeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.7917F,   KeyframeAnimations.degreeVec( 0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.9167F,   KeyframeAnimations.degreeVec( 0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("belly", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.125F,    KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.3333F,   KeyframeAnimations.posVec(0.0F,  0.0F,-1.2F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.6667F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.8333F,   KeyframeAnimations.posVec(0.0F, -0.8F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.9583F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("belly", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.6667F,   KeyframeAnimations.scaleVec(1.0F, 1.0F,  1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.8333F,   KeyframeAnimations.scaleVec(1.0F, 1.1F,  1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.9583F,   KeyframeAnimations.scaleVec(1.0F, 1.0F,  1.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.375F,    KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5833F,   KeyframeAnimations.degreeVec( 10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,     KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.2083F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .build();

        // -------------------------------------------------------------------------
        // JUMP  (once, length 3.25F — Molang on legs/arms converted to keyframes)
        // -------------------------------------------------------------------------
        public static final AnimationDefinition jump = AnimationDefinition.Builder.withLength(3.25F)
                .addAnimation("head", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(2.6667F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.875F,    KeyframeAnimations.degreeVec(-20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.0833F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // jaw chatters in air (was math.sin)
                .addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.4167F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.6667F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.05F,     KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.25F,     KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.45F,     KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.65F,     KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.85F,     KeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0F,      KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.2917F,   KeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.4583F,   KeyframeAnimations.degreeVec( 12.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.625F,    KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.0417F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("eyebrows", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,      KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.2083F,   KeyframeAnimations.posVec(0.0F, -0.6F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.375F,    KeyframeAnimations.posVec(0.0F, -0.6F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7917F,   KeyframeAnimations.posVec(0.0F,  0.8F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0833F,   KeyframeAnimations.posVec(0.0F,  0.8F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.25F,     KeyframeAnimations.posVec(0.0F, -0.6F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.625F,    KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.0417F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("earLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.2083F,   KeyframeAnimations.degreeVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.375F,    KeyframeAnimations.degreeVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7917F,   KeyframeAnimations.degreeVec(0.0F, 60.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.9583F,   KeyframeAnimations.degreeVec(0.0F, 60.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.2083F,   KeyframeAnimations.degreeVec(0.0F,  0.0F,22.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.4167F,   KeyframeAnimations.degreeVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.0417F,   KeyframeAnimations.degreeVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("earRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.2083F,   KeyframeAnimations.degreeVec(0.0F,   0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.375F,    KeyframeAnimations.degreeVec(0.0F,   0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7917F,   KeyframeAnimations.degreeVec(0.0F, -60.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.9583F,   KeyframeAnimations.degreeVec(0.0F, -60.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.2083F,   KeyframeAnimations.degreeVec(0.0F,   0.0F,-22.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.4167F,   KeyframeAnimations.degreeVec(0.0F,   0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.0417F,   KeyframeAnimations.degreeVec(0.0F,   0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // arms held wide, swing during landing
                .addAnimation("armRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(0.0F,   0.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.1667F,   KeyframeAnimations.degreeVec(0.0F,  32.5F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,      KeyframeAnimations.degreeVec(0.0F,  60.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,   KeyframeAnimations.degreeVec(0.0F, -35.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.1667F,   KeyframeAnimations.degreeVec(0.0F, -35.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.3333F,   KeyframeAnimations.degreeVec(0.0F, -47.5F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.5417F,   KeyframeAnimations.degreeVec(0.0F,  65.78F,-57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.75F,     KeyframeAnimations.degreeVec(0.0F,  65.78F,-57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.0417F,   KeyframeAnimations.degreeVec(0.0F,   0.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("armRight", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(2.2917F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.375F,    KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.625F,    KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("armLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(0.0F,   0.0F,  57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.1667F,   KeyframeAnimations.degreeVec(0.0F, -22.5F,  57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,      KeyframeAnimations.degreeVec(0.0F, -55.0F,  57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,   KeyframeAnimations.degreeVec(0.0F,  30.0F,  57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.1667F,   KeyframeAnimations.degreeVec(0.0F,  30.0F,  57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.3333F,   KeyframeAnimations.degreeVec(0.0F,  47.5F,  57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.5417F,   KeyframeAnimations.degreeVec(0.0F, -50.64F, 57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.75F,     KeyframeAnimations.degreeVec(0.0F, -50.64F, 57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.0417F,   KeyframeAnimations.degreeVec(0.0F,   0.0F,  57.5F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("armLeft", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(2.2917F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.375F,    KeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.625F,    KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                // legs scramble in air (was math.sin/cos — approximated with alternating keyframes)
                .addAnimation("legRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.4167F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.6667F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7917F,   KeyframeAnimations.degreeVec( 15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.975F,    KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.15F,     KeyframeAnimations.degreeVec( 15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.35F,     KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.5417F,   KeyframeAnimations.degreeVec( 35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.9167F,   KeyframeAnimations.degreeVec( 35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0417F,   KeyframeAnimations.degreeVec( 35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.2083F,   KeyframeAnimations.degreeVec(106.47F,-24.09F,-6.88F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.625F,    KeyframeAnimations.degreeVec(106.47F,-24.09F,-6.88F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.0417F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("legRight", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.4583F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.8333F,   KeyframeAnimations.posVec(0.0F, 1.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,      KeyframeAnimations.posVec(0.0F,-1.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.2F,      KeyframeAnimations.posVec(0.0F, 1.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.4F,      KeyframeAnimations.posVec(0.0F,-1.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.5833F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.9167F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0417F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.2083F,   KeyframeAnimations.posVec(0.0F, 1.0F, -2.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.625F,    KeyframeAnimations.posVec(0.0F, 1.0F, -2.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.0417F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("legLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.4167F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.6667F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7917F,   KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.975F,    KeyframeAnimations.degreeVec( 15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.15F,     KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.35F,     KeyframeAnimations.degreeVec( 15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.5417F,   KeyframeAnimations.degreeVec( 35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.9167F,   KeyframeAnimations.degreeVec( 35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0417F,   KeyframeAnimations.degreeVec( 35.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.2083F,   KeyframeAnimations.degreeVec(106.47F, 24.09F,-6.88F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.625F,    KeyframeAnimations.degreeVec(106.47F, 24.09F,-6.88F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.0417F,   KeyframeAnimations.degreeVec(  0.0F,  0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("legLeft", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.4583F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.8333F,   KeyframeAnimations.posVec(0.0F,-1.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,      KeyframeAnimations.posVec(0.0F, 1.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.2F,      KeyframeAnimations.posVec(0.0F,-1.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.4F,      KeyframeAnimations.posVec(0.0F, 1.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.5833F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.9167F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0417F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.2083F,   KeyframeAnimations.posVec(0.0F, 1.0F, -2.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.625F,    KeyframeAnimations.posVec(0.0F, 1.0F, -2.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.0417F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("belly", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(1.0833F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.9167F,   KeyframeAnimations.posVec(0.0F, 1.6F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.1667F,   KeyframeAnimations.posVec(0.0F, 0.4F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.2917F,   KeyframeAnimations.posVec(0.0F, 1.6F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.4167F,   KeyframeAnimations.posVec(0.0F, 0.4F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.625F,    KeyframeAnimations.posVec(0.0F, 0.4F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.0417F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("root", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,      KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.875F,    KeyframeAnimations.degreeVec( 15.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.9167F,   KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.5833F,   KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(3.0417F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("root", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.5833F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,     KeyframeAnimations.posVec(0.0F,  2.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0F,      KeyframeAnimations.posVec(0.0F,  2.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0833F,   KeyframeAnimations.posVec(0.0F, -5.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.25F,     KeyframeAnimations.posVec(0.0F, -6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.4167F,   KeyframeAnimations.posVec(0.0F, -5.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.625F,    KeyframeAnimations.posVec(0.0F, -5.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.0417F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("legs", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.5417F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.75F,     KeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.8333F,   KeyframeAnimations.degreeVec( 10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.1667F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(   0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.1667F,   KeyframeAnimations.degreeVec( -10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.3333F,   KeyframeAnimations.degreeVec( -20.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.4167F,   KeyframeAnimations.degreeVec( -22.95F,0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,      KeyframeAnimations.degreeVec( -22.95F,0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,   KeyframeAnimations.degreeVec(  10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.6667F,   KeyframeAnimations.degreeVec(  10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.625F,    KeyframeAnimations.degreeVec(  10.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.7917F,   KeyframeAnimations.degreeVec(  -7.02F,0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.0417F,   KeyframeAnimations.degreeVec(   0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,      KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.1667F,   KeyframeAnimations.posVec(0.0F, -1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.3333F,   KeyframeAnimations.posVec(0.0F, -1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.6667F,   KeyframeAnimations.posVec(0.0F, -1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.625F,    KeyframeAnimations.posVec(0.0F, -1.0F, 1.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(3.0417F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .build();

        // -------------------------------------------------------------------------
        // DEATH  (hold, length 2.0417F — all plain keyframes)
        // -------------------------------------------------------------------------
        public static final AnimationDefinition death = AnimationDefinition.Builder.withLength(2.0417F)
                .addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.375F,    KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,   KeyframeAnimations.degreeVec( 13.75F,0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0833F,   KeyframeAnimations.degreeVec( 13.75F,0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.7083F,   KeyframeAnimations.degreeVec(-22.5F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("jaw", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(1.625F,    KeyframeAnimations.posVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.7917F,   KeyframeAnimations.posVec(0.0F, 0.0F, -0.3F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.0417F,   KeyframeAnimations.posVec(0.0F, 0.0F,  0.5F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("eyes", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(1.1667F,   KeyframeAnimations.scaleVec(1.0F, 1.0F,  1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.375F,    KeyframeAnimations.scaleVec(1.0F, 0.3F,  1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.875F,    KeyframeAnimations.scaleVec(1.0F, 0.3F,  1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.0417F,   KeyframeAnimations.scaleVec(1.0F, 0.0F,  1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("eyebrows", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.0F,      KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5F,      KeyframeAnimations.posVec(0.0F,  1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.2917F,   KeyframeAnimations.posVec(0.0F,  1.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.5833F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(2.0417F,   KeyframeAnimations.posVec(0.0F, -0.8F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("earLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(0.0F, 0.0F,  0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.0417F,   KeyframeAnimations.degreeVec(0.0F, 0.0F, 20.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("earRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(0.0F, 0.0F,   0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(2.0417F,   KeyframeAnimations.degreeVec(0.0F, 0.0F, -15.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("armRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.4583F,   KeyframeAnimations.degreeVec(0.0F, 0.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,   KeyframeAnimations.degreeVec(0.0F, 0.0F, -47.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.2083F,   KeyframeAnimations.degreeVec(0.0F, 0.0F, -57.5F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("armLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.0F,      KeyframeAnimations.degreeVec(0.0F, 0.0F, 57.5F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("legRight", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.4583F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,     KeyframeAnimations.degreeVec(-95.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("legRight", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.4583F,   KeyframeAnimations.posVec(0.0F,  0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,     KeyframeAnimations.posVec(0.0F, -6.0F, -3.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("legLeft", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(1.0F,      KeyframeAnimations.degreeVec(  0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.2917F,   KeyframeAnimations.degreeVec(-95.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("legLeft", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(1.0F,      KeyframeAnimations.posVec(0.0F,  0.0F,  0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.2917F,   KeyframeAnimations.posVec(0.0F, -6.0F, -3.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("belly", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.5417F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.75F,     KeyframeAnimations.posVec(0.0F, -0.7F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.9167F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.125F,    KeyframeAnimations.posVec(0.0F, -0.7F, 0.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.2917F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("belly", new AnimationChannel(AnimationChannel.Targets.SCALE,
                        new Keyframe(0.5833F,   KeyframeAnimations.scaleVec(1.0F, 1.0F,  1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.7917F,   KeyframeAnimations.scaleVec(1.0F, 1.12F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(0.9583F,   KeyframeAnimations.scaleVec(1.0F, 1.0F,  1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.1667F,   KeyframeAnimations.scaleVec(1.0F, 1.12F, 1.0F), AnimationChannel.Interpolations.LINEAR),
                        new Keyframe(1.3333F,   KeyframeAnimations.scaleVec(1.0F, 1.0F,  1.0F), AnimationChannel.Interpolations.LINEAR)
                ))
                .addAnimation("mace", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.3333F,   KeyframeAnimations.degreeVec( 0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.5833F,   KeyframeAnimations.degreeVec( 0.0F, 15.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.6667F,   KeyframeAnimations.degreeVec(12.5F, -2.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,      KeyframeAnimations.degreeVec(12.5F, -2.5F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.25F,     KeyframeAnimations.degreeVec( 7.75F, 2.17F,-9.42F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("mace", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.4583F,   KeyframeAnimations.posVec(  0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.625F,    KeyframeAnimations.posVec(-11.0F, -6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.7083F,   KeyframeAnimations.posVec(-10.0F, -6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,     KeyframeAnimations.posVec(-11.0F, -6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.0F,      KeyframeAnimations.posVec(-11.0F, -6.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.25F,     KeyframeAnimations.posVec( -8.0F, -3.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.ROTATION,
                        new Keyframe(0.4583F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F,   0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,     KeyframeAnimations.degreeVec(-10.0F, 0.0F, -12.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.9583F,   KeyframeAnimations.degreeVec(-10.0F, 0.0F, -12.5F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.2917F,   KeyframeAnimations.degreeVec(  0.0F, 0.0F,   0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .addAnimation("body", new AnimationChannel(AnimationChannel.Targets.POSITION,
                        new Keyframe(0.4583F,   KeyframeAnimations.posVec(0.0F,  0.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.75F,     KeyframeAnimations.posVec(0.0F, -3.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(0.9583F,   KeyframeAnimations.posVec(0.0F, -3.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM),
                        new Keyframe(1.2917F,   KeyframeAnimations.posVec(0.0F, -4.0F, 0.0F), AnimationChannel.Interpolations.CATMULLROM)
                ))
                .build();
}