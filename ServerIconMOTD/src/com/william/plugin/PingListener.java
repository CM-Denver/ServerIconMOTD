package com.william.plugin;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class PingListener implements Listener {

	//Runs every time the server is pinged:
	@EventHandler
	public void onPing(ServerListPingEvent e) {
		
		int maxPlayers = 750;
		//Creates new File variable that links to the custom icon (place obby.png in the server folder):
		File icon = new File("obby.png");
		
		e.setMaxPlayers(maxPlayers);
		e.setMotd(ChatColor.BOLD + "This is a special server!\n" + ChatColor.YELLOW + "Come join us");
		
		//Loads in the custom server icon:
		try {
			e.setServerIcon(Bukkit.loadServerIcon(icon));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}
	
}
