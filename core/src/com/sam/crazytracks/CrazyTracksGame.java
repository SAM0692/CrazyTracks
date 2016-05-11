package com.sam.crazytracks;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.sam.crazytracks.game.WorldController;
import com.sam.crazytracks.game.WorldRenderer;

public class CrazyTracksGame implements ApplicationListener {
    private static final String TAG = CrazyTracksGame.class.getName();

    private WorldController worldController;
    private WorldRenderer worldRenderer;

    private boolean paused;


    @Override
    public void create() {
        // Set Libgdx log level to DEBUG
        Gdx.app.setLogLevel(Application.LOG_DEBUG);

        worldController = new WorldController();
        worldRenderer = new WorldRenderer(worldController);

        paused = false;
    }

    @Override
    public void resize(int width, int height) {
        worldRenderer.resize(width, height);
    }

    @Override
    public void render() {
        // Update the world by the time that has passed since the last rendered frame
        // If it is not paused
        if (!paused) {
            worldController.update(Gdx.graphics.getDeltaTime());
        }

        //Clear screen
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //Render the world to the screen
        worldRenderer.render();
    }

    @Override
    public void pause() {
        paused = true;

    }

    @Override
    public void resume() {
        paused = false;
    }

    @Override
    public void dispose() {
        worldRenderer.dispose();
    }
}
