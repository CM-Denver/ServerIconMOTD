package com.william.plugin;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{

	@Override
	public void onEnable() {
		System.out.println("ServerIconMOTD plugin has worked (sorta)");
		
		//Add PingListener:
		Bukkit.getPluginManager().registerEvents(new PingListener(), this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("ServerIconMOTD plugin disabled");
	}
	
}
