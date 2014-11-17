package org.connect.api;

import java.util.ArrayList;
import java.util.UUID;

import org.connect.api.entity.IOfflinePlayer;
import org.connect.api.entity.IPlayer;
import org.connect.api.plugin.IPluginManager;
import org.connect.api.scheduler.IScheduler;
import org.connect.api.world.IWorld;
import org.connect.api.world.IWorldManager;

public class ConnectAPI {

	private static Server server;

	private ConnectAPI() {
		
	}

	public static void setServer(Server connectServer) {
		server = connectServer;
	}

	public static Server getServer() {
		return server;
	}

	public static IPlayer getPlayer(String username) {
		return server.getPlayer(username);
	}

	public static IPlayer getPlayer(UUID uuid) {
		return server.getPlayer(uuid);
	}

	public static IOfflinePlayer getOfflinePlayer(String username) {
		return server.getOfflinePlayer(username);
	}

	public static IOfflinePlayer getOfflinePlayer(UUID uuid) {
		return server.getOfflinePlayer(uuid);
	}

	public static String getName() {
		return server.getName();
	}

	public static String getVersion() {
		return server.getVersion();
	}

	public static IWorld getDefaultWorld() {
		return server.getDefaultWorld();
	}

	public static IPluginManager getPluginManager() {
		return server.getPluginManager();
	}

	public static IScheduler getScheduler() {
		return server.getScheduler();
	}

	public static int getMaxPlayers() {
		return server.getMaxPlayers();
	}

	public static ArrayList<IPlayer> getOnlinePlayers() {
		return server.getOnlinePlayers();
	}

	public static void broadcastMessage(String message) {
		server.broadcastMessage(message);
	}

	public static IWorldManager getWorldManager() {
		return server.getWorldManager();
	}

	public static void init() {
		server.init();
	}

	public static void shutdown() {
		server.shutdown();
	}

}
