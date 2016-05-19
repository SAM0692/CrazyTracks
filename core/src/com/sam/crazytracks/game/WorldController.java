package com.sam.crazytracks.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.sam.crazytracks.util.WorldUtil;

/**
 * Created by sam on 11/05/16.
 */
public class WorldController {
    private static final String TAG = WorldController.class.getName();

    World world;
    Body ground;
    Body player;

    private final float TIME_STEP = 1f/60f;
    private float accumulator = 0f;

    public WorldController() {
        init();
    }

    private void init() {
        world = WorldUtil.createWorld();
        ground = WorldUtil.createGround(world);
        player = WorldUtil.createPlayer(world);
    }

    public void update(float deltaTime) {
        world.step(TIME_STEP, 6, 2);
//        accumulator += deltaTime;
//
//        while (accumulator >= deltaTime) {
//            world.step(TIME_STEP, 6, 2);
//            accumulator -= TIME_STEP;
//        }
    }
}
