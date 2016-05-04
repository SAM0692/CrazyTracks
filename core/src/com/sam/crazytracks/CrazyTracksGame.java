package com.sam.crazytracks;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sam.crazytracks.screens.GameScreen;

public class CrazyTracksGame extends Game {


	@Override
	public void create() {
		setScreen(new GameScreen());
	}


}
