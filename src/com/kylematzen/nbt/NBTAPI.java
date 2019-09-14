package com.kylematzen.nbt;

import org.bukkit.plugin.java.JavaPlugin;

public class NBTAPI extends JavaPlugin {

	public void onEnable() {
		
	}
	
	public static NBTAPI getAPI() {
		return getPlugin(NBTAPI.class);
	}
}