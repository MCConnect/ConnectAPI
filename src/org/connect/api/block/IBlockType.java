package org.connect.api.block;

public interface IBlockType {

	/**
	 * Get's the id of the block type
	 * 
	 * @return The id of the block type
	 */
	public int getType();

	/**
	 * Get's the substance
	 * 
	 * @return The substance
	 */
	public Substance getSubstance();

}
