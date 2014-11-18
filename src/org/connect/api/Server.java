package org.connect.api;

import java.util.ArrayList;
import java.util.UUID;

import org.connect.api.entity.ICommandSender;
import org.connect.api.entity.IOfflinePlayer;
import org.connect.api.entity.IPlayer;
import org.connect.api.permissions.IPermissionManager;
import org.connect.api.plugin.IPluginManager;
import org.connect.api.scheduler.IScheduler;
import org.connect.api.world.ILocation;
import org.connect.api.world.IWorld;
import org.connect.api.world.IWorldManager;

public interface Server {

	/**
	 * Get's the server's port.
	 * 
	 * @return The server's port
	 */
	public int getPort();
	
	/**
	 * Get's the server's IP.
	 * 
	 * @return The server's ip.
	 */
	public String getIP();

	/**
	 * Get's a player by the name.
	 * 
	 * @param username The player's name
	 * @return A player if they're online
	 */
	public IPlayer getPlayer(String username);
	
	/**
	 * Get's a player by the UUID.
	 * 
	 * @param uuid The player's UUID
	 * @return A player if they're online
	 */
	public IPlayer getPlayer(UUID uuid);

	/**
	 * Get's an offline player by the name.
	 * 
	 * @param username The player's name
	 * @return An OfflinePlayer if the player isn't on and Player if they are.
	 */
	public IOfflinePlayer getOfflinePlayer(String username);
	
	/**
	 * Get's an offline player by the UUID.
	 * 
	 * @param uuid The player's UUID
	 * @return An OfflinePlayer if the player isn't on and Player if they are.
	 */
	public IOfflinePlayer getOfflinePlayer(UUID uuid);

	/**
	 * Get's the software's name
	 * 
	 * @return The name of the software
	 */
	public String getName();

	/**
	 * Get's the server's version
	 * 
	 * @return The version of the server
	 */
	public String getVersion();

	/**
	 * Get's the software's version
	 * 
	 * @return The version of the software
	 */
	public String getImplementationVersion();

	/**
	 * Get's the default world to be loaded on startup.
	 * 
	 * @return The default world
	 */
	public IWorld getDefaultWorld();

	/**
	 * Get's the plugin manager
	 * 
	 * @return The plugin manager
	 */
	public IPluginManager getPluginManager();

	/**
	 * Get's the scheduler
	 * 
	 * @return The scheduler
	 */
	public IScheduler getScheduler();

	/**
	 * Get's the max amount of players
	 * 
	 * @return The max amount of players
	 */
	public int getMaxPlayers();

	// Yeah I know I added this in late... forgot 'bout it
	/**
	 * Get's a list of the online players
	 * 
	 * @return A list of the online players
	 */
	public ArrayList<IPlayer> getOnlinePlayers();

	/**
	 * Broadcasts a message to all the players on the server
	 * 
	 * @param message The message to broadcast
	 */
	public void broadcastMessage(String message);

	/**
	 * Get's the world manager
	 * 
	 * @return The world manager
	 */
	public IWorldManager getWorldManager();

	/**
	 * Starts the server
	 */
	public void init();

	/**
	 * Stops the server
	 */
	public void shutdown();

	/**
	 * Get's the logger
	 * 
	 * @return The logger
	 */
	public ILogger getLogger();

	/**
	 * Get's the permission manager
	 * 
	 * @return The permission manager
	 */
	public IPermissionManager getPermissionManager();

	/**
	 * Get's the console sender
	 * 
	 * @return The console sender
	 */
	public ICommandSender getConsoleSender();

	/**
	 * Interface designed to handle packets
	 */
	public interface IHandle {

		public void handleJoin(IPlayer p);

		public void handleLeave(IPlayer p);

		public void handleMovement(IPlayer p, ILocation location);

		public void handleChat(IPlayer p, String message);

	}

}
