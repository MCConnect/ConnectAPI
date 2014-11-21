package org.connect.api.plugin;

public interface IPluginData {

	/**
	 * Get's the plugin's name
	 * 
	 * @return The plugin's name
	 */
	public String getName();

	/**
	 * Get's the plugin's author
	 * 
	 * @return The plugin's author
	 */
	public String[] getAuthors();

	/**
	 * Get's the plugin's version
	 * 
	 * @return the Plugin's version
	 */
	public String getVersion();

}
