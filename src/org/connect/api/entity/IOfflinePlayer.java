package org.connect.api.entity;

import java.util.UUID;

public interface IOfflinePlayer extends IEntity, Identifiable {

	/**
	 * Get's the player's name
	 * 
	 * @return The name of the player
	 */
	public String getName();

}
