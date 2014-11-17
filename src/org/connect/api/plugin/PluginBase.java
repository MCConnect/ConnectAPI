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

}
