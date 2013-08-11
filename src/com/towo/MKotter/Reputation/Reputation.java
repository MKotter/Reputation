package com.towo.MKotter.Reputation;

import java.util.logging.Logger;

import lib.PatPeter.SQLibrary.Database;
import lib.PatPeter.SQLibrary.SQLite;

import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class Reputation extends JavaPlugin {
	
	private Database sql;
	
	
	@Override
	public void onDisable() {
	}
	
	@Override
	public void onEnable() {
		sql = new SQLite(Logger.getLogger("Minecraft"),
				"[MyPlugin] ",
				this.getDataFolder().getAbsolutePath()
				"MyPlugin",
				".sqlite");
		if (sql.open()) {
			
		}
	}
}