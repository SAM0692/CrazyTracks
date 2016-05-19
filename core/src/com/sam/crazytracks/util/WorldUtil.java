package com.sam.crazytracks.util;

import static com.sam.crazytracks.util.Constants.PPM;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.*;

/**
 * Created by sam on 17/05/16.
 */
public class WorldUtil {

    public static World createWorld() {
        return new World(Constants.WORLD_GRAVITY, true);
    }

    public static Body createGround(World world) {
        BodyDef bdef = new BodyDef();
        Body body;
        PolygonShape shape = new PolygonShape();
        FixtureDef fdef = new FixtureDef();

        bdef.type = BodyDef.BodyType.StaticBody;
        bdef.position.set(new Vector2(50 / PPM, 0));
        body = world.createBody(bdef);

        shape.setAsBox(50 / PPM, 5 / PPM);
        fdef.shape = shape;
        body.createFixture(fdef);

        //dispose
        shape.dispose();

        return body;
    }

    public static Body createPlayer(World world) {
        BodyDef bdef = new BodyDef();
        Body body;
        PolygonShape shape = new PolygonShape();
        FixtureDef fdef = new FixtureDef();

        bdef.type = BodyDef.BodyType.DynamicBody;
        bdef.position.set(new Vector2(50 / PPM, 10 / PPM));
        body = world.createBody(bdef);

        shape.setAsBox(5 / PPM, 5 / PPM);
        fdef.shape = shape;
        body.createFixture(fdef);

        //dispose
        shape.dispose();

        return body;
    }
}
