package org.connect.api.permissions;

import java.util.ArrayList;

import org.connect.api.entity.IPlayer;

public interface IPermissionManager {

	/**
	 * Grants a player permission
	 * 
	 * @param player The player to grant
	 * @param permission The permission to grant
	 */
	public void grantPermission(Permissable perm, IPermission permission);

	/**
	 * Revokes a player permission
	 * 
	 * @param player The player to revoke
	 * @param permission The permission to revoke
	 */
	public void revokePermission(Permissable perm, IPermission permission);

	/**
	 * Get's if the player has a certain permission
	 * 
	 * @param player The player to check
	 * @param permission The permission to check
	 * @return A boolean depending on if the player has permission
	 */
	public boolean hasPermission(Permissable perm, IPermission permission);

}
