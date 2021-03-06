package com.sam.crazytracks.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.sam.crazytracks.CrazyTracksGame;
import com.sam.crazytracks.util.Constants;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Constants.APP_WIDTH * 2;
		config.height = Constants.APP_HEIGHT * 2;
		new LwjglApplication(new CrazyTracksGame(), config);
	}
}
