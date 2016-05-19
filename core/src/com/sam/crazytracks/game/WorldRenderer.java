package com.sam.crazytracks.game;

import static com.sam.crazytracks.util.Constants.PPM;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.utils.Disposable;
import com.sam.crazytracks.util.Constants;

/**
 * Created by sam on 11/05/16.
 */
public class WorldRenderer implements Disposable {
    private static final String TAG = WorldRenderer.class.getName();

    private OrthographicCamera camera;
    private SpriteBatch batch;
    private WorldController worldController;

    Box2DDebugRenderer b2dRenderer;

    public WorldRenderer(WorldController worldController) {
        this.worldController = worldController;
        init();
    }
    private void init() {
        batch = new SpriteBatch();
        camera = new OrthographicCamera();
        camera.setToOrtho(false, Constants.APP_WIDTH / PPM, Constants.APP_HEIGHT / PPM);

        b2dRenderer = new Box2DDebugRenderer();
    }

    public void render() {
        b2dRenderer.render(worldController.world, camera.combined);
    }

    public void resize(int width, int height) {
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
