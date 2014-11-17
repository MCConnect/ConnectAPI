package org.connect.api.inventory;

public interface IInv {

	/**
	 * Get's the inventory's title
	 * 
	 * @return The inventory's title
	 */
	public String getTitle();

	/**
	 * Get's the inventory's size
	 * 
	 * @return The inventory's size
	 */
	public int getSize();

	/**
	 * Get's the inventory's type
	 * 
	 * @return The inventory's type
	 */
	public InventoryType getInventoryType();

}
