package org.connect.api.block;

public interface IItemStack {

	/**
	 * Get's the substance
	 *  
	 * @return The substance
	 */
	public Substance getSubstance();

	/**
	 * Get's the item's id
	 * 
	 * @return The item's id
	 */
	public int getId();

	/**
	 * Get's the item's max stackable
	 * 
	 * @return The item's max stackable
	 */
	public int getMaxStackable();

	/**
	 * Get's the item's stacked
	 * 
	 * @return The item's stacked
	 */
	public int getStacked();

	/**
	 * Get's the item's data value
	 * 
	 * @return The item's data value
	 */
	public int getDataValue();

	/**
	 * Get's if the item has item meta
	 * 
	 * @return A boolean depending on if the item has a meta value
	 */
	public boolean hasItemMeta();

	/**
	 * Get's the item meta
	 * 
	 * @return The item's meta
	 */
	public IItemMeta getItemMeta();

	/**
	 * Set's the item's meta
	 * 
	 * @param meta The meta to set
	 */
	public void setItemMeta(IItemMeta meta);

}
