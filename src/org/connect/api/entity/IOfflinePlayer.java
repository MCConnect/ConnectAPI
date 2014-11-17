package org.connect.api.entity;

import java.util.UUID;

public interface IOfflinePlayer extends IEntity {

	/**
	 * Get's the player's UUID
	 * 
	 * @return The player's UUID
	 */
	public UUID getUniqueId();

	/**
	 * Get's the player's name
	 * 
	 * @return The name of the player
	 */
	public String getName();

}
