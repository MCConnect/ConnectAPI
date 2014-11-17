package org.connect.api.plugin;

public interface IPluginData {

	/**
	 * Get's the plugin's name
	 * 
	 * @return The plugin's name
	 */
	public String getName();

	/**
	 * Get's the plugin's description
	 * 
	 * @return The plugin's description
	 */
	public String getDescription();

	/**
	 * Get's the plugin's author
	 * 
	 * @return The plugin's author
	 */
	public String getAuthor();

	/**
	 * Get's the plugin's version
	 * 
	 * @return the Plugin's version
	 */
	public int getVersion();

}
