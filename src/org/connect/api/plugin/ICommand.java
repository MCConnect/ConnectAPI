package org.connect.api.plugin;

import org.connect.api.entity.ICommandSender;
import org.connect.api.permissions.IPermission;

public interface ICommand {

	/**
	 * Get's the command's label
	 * 
	 * @return The command's label
	 */
	public String getLabel();

	/**
	 * Get's the plugin that owns the command
	 * 
	 * @return The plugin that owns the command
	 */
	public PluginBase getOwner();

	/**
	 * Get's the command's permission
	 * 
	 * @return The permission node
	 */
	public IPermission getPermission();

	/**
	 * The code to be executed when the command is ran
	 * 
	 * @param sender The sender who ran the command
	 * @param args The arguments supplied
	 */
	public void performComand(ICommandSender sender, String[] args);

}
