package org.connect.api.plugin;

public interface PluginBase {

	/**
	 * Get's the plugin's data
	 * 
	 * @return The plugin's data
	 */
	public IPluginData getData();

	/**
	 * Set's the plugin's data
	 * 
	 * @param data The plugin's data
	 */
	public void setData(IPluginData data);

	/**
	 * Called when enabling the plugin
	 * 
	 * @param init The class containing the Server, Logger instances
	 */
	public void preInit(IPreInit init);

	/**
	 * Called when disabling the plugin
	 * 
	 * @param halt The class containing the Server, Logger instances
	 */
	public void preShutdown(IPreShutdown halt);

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
