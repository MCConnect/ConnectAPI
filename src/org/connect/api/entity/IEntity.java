package org.connect.api.entity;

import org.connect.api.world.ILocation;

public interface IEntity {

	/**
	 * Get's the block the entity is standing on
	 * 
	 * @return The location the entity is standing on
	 */
	public ILocation getLocation();

}
