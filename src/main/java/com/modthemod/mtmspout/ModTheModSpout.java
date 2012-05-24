package com.modthemod.mtmspout;

import org.spout.api.plugin.CommonPlugin;

import com.modthemod.api.Game;
import com.modthemod.engine.MGame;

public class ModTheModSpout extends CommonPlugin {
	private Game game;

	@Override
	public void onDisable() {
		// TODO
	}

	@Override
	public void onEnable() {
		SpoutPlatform platform = new SpoutPlatform(this);
		game = new MGame(platform);
	}

}
