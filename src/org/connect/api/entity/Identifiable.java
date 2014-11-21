package org.connect.api.entity;

import java.util.UUID;

public interface Identifiable {

	/**
	 * Get's the UUID of the object
	 * 
	 * @return The UUID of the object
	 */
	public UUID getUniqueID();

}
