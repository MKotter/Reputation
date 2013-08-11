package com.towo.MKotter.Reputation;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.towo.MKotter.Reputation.Util.SLAPI;

public class Reputation extends JavaPlugin {	
	
	Map<String, Integer> playerRep = new HashMap<String, Integer>();

	@Override
	public void onDisable() {
		try {
            SLAPI.save(playerRep,"plugins/Reputation/rep.dat");
        } catch (Exception e) {
        }
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents((Listener) this, this);
		try {
            playerRep = (HashMap<String, Integer>)SLAPI.load("plugins/Reptuation/rep.dat");
        } catch (Exception e) {
        }
	}
	
}