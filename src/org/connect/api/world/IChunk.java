package org.connect.api.world;

import java.util.ArrayList;

import org.connect.api.world.biome.IBiome;

public interface IChunk {

	/**
	 * Get's a list of all the locations in the chunk
	 * 
	 * @return A list of all the locations in the chunk
	 */
	public ArrayList<ILocation> getLocations();

	/**
	 * Get's the world the chunk is in 
	 * 
	 * @return The world the chunk is in
	 */
	public IWorld getWorld();

	/**
	 * Get's the chunk's biome
	 * 
	 * @return The chunk's biome
	 */
	public IBiome getBiome();

	/**
	 * Get's the chunk's location
	 * 
	 * @return The chunk's location
	 */
	public Vector2f getChunkLocation();

	/**
	 * Load's the chunk
	 */
	public void loadChunk();

}
