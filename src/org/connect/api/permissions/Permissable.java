package org.connect.api.permissions;

public interface Permissable {

	/**
	 * Check's if the sender has the permission
	 * 
	 * @param permission The permission to check
	 * @return A boolean depending on if the sender has the permission
	 */
	public boolean hasPermission(String permission);

}
