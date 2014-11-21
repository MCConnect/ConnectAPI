package org.connect.api.plugin;

import org.connect.api.ILogger;
import org.connect.api.Server;

public interface IPreShutdown {

	/**
	 * Get's the server running
	 * 
	 * @return The server running
	 */
	public Server getServer();

	/**
	 * Get's the server's logger
	 * 
	 * @return The server's logger
	 */
	public ILogger getLogger();

}
