package org.connect.api.plugin;

import java.io.File;
import java.util.ArrayList;

import org.connect.api.event.IEvent;

public interface IPluginManager {

	/**
	 * Registers events for a plugin
	 * 
	 * @param listener The listener for events
	 * @param plugin The plugin
	 */
	public void registerEvents(Listener listener, PluginBase plugin);

	/**
	 * Registers a command for a plugin
	 * 
	 * @param command The command to register
	 * @param plugin The plugin
	 */
	public void registerCommand(ICommand command, PluginBase plugin);

	/**
	 * Get's a list of all the plugins in a directory
	 * 
	 * @param directory The directory to get a list of the plugins
	 */
	public void initPlugins(File directory);

	/**
	 * Loads all plugins in the plugins directory
	 */
	public void loadPlugins();

	/**
	 * Enables all plugins in the plugins directory
	 */
	public void enablePlugins();

	/**
	 * Enables a certain plugin
	 * 
	 * @param plugin The plugin to enable
	 */
	public void enablePlugin(PluginBase plugin);

	/**
	 * Disables a certain plugin
	 * 
	 * @param plugin The plugin to disable
	 */
	public void disablePlugin(PluginBase plugin);

	/**
	 * Get's a list of enabled plugins
	 * 
	 * @return A list of enabled plugins
	 */
	public ArrayList<PluginBase> getEnabledPlugins();

	/**
	 * Get's a plugin by the name
	 * 
	 * @param name The plugin's name
	 * @return The plugin
	 */
	public PluginBase getPlugin(String name);

	/**
	 * Calls an event
	 * 
	 * @param event The event to be called
	 */
	public void callEvent(IEvent event);

}
