package org.connect.api.scheduler;

import org.connect.api.plugin.PluginBase;

public interface IScheduler {

	/**
	 * Cancels a task by it's id
	 * 
	 * @param id The task to cancel
	 */
	public void cancelTask(int id);

	/**
	 * Cancel's all plugin's tasks
	 * 
	 * @param plugin The plugin to cancel all tasks
	 */
	public void cancelTask(PluginBase plugin);

	/**
	 * Cancels all running tasks
	 */
	public void cancelAllTasks();

	/**
	 * Runs a sync delayed task
	 * 
	 * @param plugin The plugin to schedule it with
	 * @param runnable The code to run
	 * @param delay The delay in ticks to run it
	 * @return The task's id
	 */
	public int runSyncDelayedTask(PluginBase plugin, ConnectRunnable runnable, long delay);

	/**
	 * Runs an async delayed task
	 * 
	 * @param plugin The plugin to schedule it with
	 * @param runnable The code to run
	 * @param delay The delay in ticks to run it
	 * @return The task's id
	 */
	public int runAsyncDelayedTask(PluginBase plugin, ConnectRunnable runnable, long delay);

	/**
	 * Runs a sync repeating task
	 * 
	 * @param plugin The plugin to schedule it with
	 * @param runnable The code to run
	 * @param delay The delay in ticks before it is ran again
	 * @param period The period in ticks of the task
	 * @return The task's id
	 */
	public int runSyncRepeatingTask(PluginBase plugin, ConnectRunnable runnable, long delay, long period);

	/**
	 * Runs an async repeating task
	 * 
	 * @param plugin The plugin to schedule it with
	 * @param runnable The code to run
	 * @param delay The delay in ticks before it is ran again
	 * @param period The period in ticks of the task
	 * @return The task's id
	 */
	public int runAsyncRepeatingTask(PluginBase plugin, ConnectRunnable runnable, long delay, long period);

}
