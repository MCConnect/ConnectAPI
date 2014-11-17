package org.connect.api.entity;

import org.connect.api.Gamemode;
import org.connect.api.inventory.IInv;
import org.connect.api.world.ILocation;

public interface IPlayer extends IOfflinePlayer, ICommandSender {

	/**
	 * Teleports the player to the location
	 * 
	 * @param loc The location to teleport the player to
	 */
	public void teleport(ILocation loc);

	/**
	 * Get's the player's location
	 * 
	 * @return The player's location
	 */
	public ILocation getLocation();

	/**
	 * Get's the player's gamemode
	 * 
	 * @return The player's gamemode
	 */
	public Gamemode getGamemode();

	/**
	 * Set's the player's gamemode
	 * 
	 * @param gm The gamemode to set the player to
	 */
	public void setGamemode(Gamemode gm);

	/**
	 * Open's an inventory to the player
	 * 
	 * @param inventory The inventory to open
	 */
	public void openInventory(IInv inventory);

	/**
	 * Set's the display name of the player
	 * 
	 * @param name The display name to set
	 */
	public void setDisplayName(String name);

	/**
	 * Get's the display name of the player
	 * 
	 * @return The display name of the player
	 */
	public String getDisplayName();

}
