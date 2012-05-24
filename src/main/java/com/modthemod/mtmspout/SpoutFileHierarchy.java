package com.modthemod.mtmspout;

import java.io.File;

import com.modthemod.api.platform.FileHierarchy;

public class SpoutFileHierarchy implements FileHierarchy {
	private final File configFolder;
	private final File dataFolder;
	private final File loadersFolder;
	private final File modsFolder;

	public SpoutFileHierarchy(File rootFolder) {
		configFolder = new File(rootFolder, "config/");
		dataFolder = new File(rootFolder, "data/");
		loadersFolder = new File(rootFolder, "loaders/");
		modsFolder = new File(rootFolder, "mods/");

		configFolder.mkdirs();
		dataFolder.mkdirs();
		loadersFolder.mkdirs();
		modsFolder.mkdirs();
	}

	@Override
	public File getConfigFolder() {
		return configFolder;
	}

	@Override
	public File getDataFolder() {
		return dataFolder;
	}

	@Override
	public File getLoadersFolder() {
		return loadersFolder;
	}

	@Override
	public File getModsFolder() {
		return modsFolder;
	}

}
