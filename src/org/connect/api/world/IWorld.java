package org.connect.api.world;

import java.util.ArrayList;

import org.connect.api.block.IBlock;
import org.connect.api.entity.Identifiable;

public interface IWorld extends Identifiable {

	/**
	 * Gets a block by the location
	 * 
	 * @param loc The location
	 * @return The block at the location
	 */
	public IBlock getBlock(ILocation loc);

	/**
	 * Get's the world's name
	 * 
	 * @return The world's name
	 */
	public String getName();

	/**
	 * Get's the chunk
	 * 
	 * @param loc A position in the chunk
	 * @return The chunk if loaded
	 */
	public IChunk getChunk(ILocation loc);

	/**
	 * Get's the world's environment
	 * 
	 * @return The world's environment
	 */
	public WorldEnvironment getEnviroment();

	/**
	 * Get's the world's seed
	 * 
	 * @return The world's seed
	 */
	public int getSeed();

	/**
	 * Get's the world's chunks
	 * 
	 * @return The world's chunks
	 */
	public ArrayList<IChunk> getChunks();

	/**
	 * Get's the world's spawn location
	 * 
	 * @return The world's spawn
	 */
	public ILocation getSpawn();

	/**
	 * Get's the world's options (name, seed, environment)
	 * 
	 * @return The world's options (name, seed, environment)
	 */
	public IWorldOption getWorldOption();

}
