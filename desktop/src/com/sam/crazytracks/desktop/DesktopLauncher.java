package com.sam.crazytracks.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.sam.crazytracks.CrazyTracksGame;
import com.sam.crazytracks.utils.Constants;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Constants.APP_WIDHT;
		config.height = Constants.APP_HEIGHT;
		new LwjglApplication(new CrazyTracksGame(), config);
	}
}
