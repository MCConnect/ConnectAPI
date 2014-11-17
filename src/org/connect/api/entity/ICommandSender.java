package org.connect.api.entity;

import org.connect.api.permissions.Permissable;

public interface ICommandSender extends Permissable {

	/**
	 * Send's a message to the sender
	 * 
	 * @param message The message to send
	 */
	public void sendMessage(String message);

	/**
	 * Get's the sender to run a command
	 * 
	 * @param command The command to run
	 */
	public void performCommand(String command);

}
