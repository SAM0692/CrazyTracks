package com.sam.crazytracks.utils;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by sam on 04/05/16.
 */
public class WorldUtils {

    public static World createWorld(World world) {
        return new World(Constants.WORLD_GRAVITY, true);
    }
}
