package com.sam.crazytracks.utils;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by sam on 04/05/16.
 */
public class WorldUtils {

    public static World createWorld(World world) {
        return new World(Constants.WORLD_GRAVITY, true);
    }

    public static Body createGround(World world) {

        BodyDef bdef = new BodyDef();
        bdef.type = BodyDef.BodyType.StaticBody;
        bdef.position.set(new Vector2(0, 0));
        Body body = world.createBody(bdef);

        return body;
    }
}
