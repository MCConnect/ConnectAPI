package org.connect.api.plugin;

import org.connect.api.Server;
import org.connect.api.ILogger;

public interface IPreInit {

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
