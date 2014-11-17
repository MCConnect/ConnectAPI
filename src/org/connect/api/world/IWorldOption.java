package org.connect.api.world;

public interface IWorldOption {

	/**
	 * Get's the world's name
	 * 
	 * @return The world's name
	 */
	public String getName();

	/**
	 * Get's the world's seed
	 * 
	 * @return The world's seed
	 */
	public int getSeed();

	/**
	 * Set's the world's seed
	 * 
	 * @param seed The seed
	 */
	public void setSeed(int seed);

	/**
	 * Get's the world's environment (nether, normal, end)
	 * 
	 * @return The world's environment (nether, normal, end)
	 */
	public WorldEnvironment getEnvironment();

}
