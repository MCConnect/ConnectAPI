package org.connect.api;

public interface ILogger {

	/**
	 * Short-version for info
	 * 
	 * @param message The message to log
	 */
	public void i(String message);
	
	/**
	 * Log's a message in the format of:<br />
	 * [<b>{$TIME}</b> INFO]: <i>message</i>
	 * 
	 * @param message The message to log
	 */
	public void info(String message);
	
	/**
	 * Short-version for warn
	 * 
	 * @param message The message to log
	 */
	public void w(String message);
	
	/**
	 * Log's a message in the format of:<br />
	 * [<b>{$TIME}</b> WARN]: <i>message</i>
	 * 
	 * @param message The message to log
	 */
	public void warn(String message);

}
