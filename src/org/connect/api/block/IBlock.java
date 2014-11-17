package org.connect.api.block;

import org.connect.api.world.ILocation;

public interface IBlock {

	/**
	 * Get's the type of the block
	 * 
	 * @return The block's type
	 */
	public IBlockType getType();

	/**
	 * Get's the block location
	 * 
	 * @return The block's location
	 */
	public ILocation getLocation();

	/**
	 * Get's the substance
	 * 
	 * @return The substance
	 */
	public Substance getSubstance();

}
