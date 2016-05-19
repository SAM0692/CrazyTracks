package com.sam.crazytracks;

import com.badlogic.gdx.Game;
import com.sam.crazytracks.screen.GameScreen;

public class CrazyTracksGame extends Game {
    private static final String TAG = CrazyTracksGame.class.getName();

    @Override
    public void create() {
        setScreen(new GameScreen());
    }
}
