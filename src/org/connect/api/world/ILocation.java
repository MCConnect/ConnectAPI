package org.connect.api.world;

import org.connect.api.block.Substance;

public interface ILocation {

	/**
	 * Get's the X co-ordinate
	 * 
	 * @return The X co-ordinate
	 */
	public int getX();

	/**
	 * Get's the Y co-ordinate
	 * 
	 * @return The Y co-ordinate
	 */
	public int getY();

	/**
	 * Get's the Z co-ordinate
	 * 
	 * @return The Z co-ordinate
	 */
	public int getZ();

	/**
	 * Get's the chunk the block is in
	 * 
	 * @return THe chunk the co-ordinate is in
	 */
	public IChunk getChunk();

	/**
	 * Get's the world the co-ordinate is in
	 * 
	 * @return The world the co-ordinate is in
	 */
	public IWorld getWorld();

	/**
	 * Adds a certain amount to the co-ordinates
	 * 
	 * @param x How much to add on the X co-ordinate
	 * @param y How much to add on the Y co-ordinate
	 * @param z How much to add on the Z co-ordinate
	 * @return The updated location
	 */
	public ILocation add(int x, int y, int z);

	/**
	 * Get's the block's type
	 * 
	 * @return The block's type
	 */
	public Substance getType();

}
