package com.modthemod.mtmspout;

import java.io.File;
import java.util.logging.Logger;

import org.spout.api.Engine;

import com.modthemod.api.platform.FileHierarchy;
import com.modthemod.api.platform.Platform;

public class SpoutPlatform implements Platform {
	private final ModTheModSpout plugin;

	private final Engine engine;

	private final FileHierarchy hierarchy;

	public SpoutPlatform(ModTheModSpout plugin) {
		this.plugin = plugin;
		this.engine = plugin.getGame();
		File rootFolder = new File("./mtm");
		rootFolder.mkdirs();
		hierarchy = new SpoutFileHierarchy(rootFolder);
	}

	@Override
	public String getName() {
		return "spout";
	}

	@Override
	public String getVersion() {
		return engine.getVersion();
	}

	@Override
	public Logger getLogger() {
		return plugin.getLogger();
	}

	@Override
	public FileHierarchy getFileHierarchy() {
		return hierarchy;
	}

}
