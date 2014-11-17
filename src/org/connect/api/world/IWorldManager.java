package org.connect.api.world;

import java.util.ArrayList;

public interface IWorldManager {

	/**
	 * Creates a world.
	 * 
	 * @param options The world's options (name, seed, etc.)
	 * @return The newly created world.
	 */
	public IWorld createWorld(IWorldOption options);

	/**
	 * Get's a world by it's name
	 * 
	 * @param name The world's name
	 * @return The world
	 */
	public IWorld getWorld(String name);

	/**
	 * Unloads a world
	 * 
	 * @param world The world to be unloaded
	 */
	public void unloadWorld(IWorld world);

	/**
	 * Get's if the world is loaded or not
	 * 
	 * @param world The world to check
	 * @return  
	 */
	public boolean isLoaded(IWorld world);

	/**
	 * Loads a world
	 * 
	 * @param world The world to load
	 */
	public void loadWorld(IWorld world);

	/**
	 * Get's a list of worlds
	 * 
	 * @return A list of worlds
	 */
	public ArrayList<IWorld> getWorlds();

	/**
	 * Get's a list of loaded worlds
	 * 
	 * @return A list of loaded worlds
	 */
	public ArrayList<IWorld> getLoadedWorlds();

}
