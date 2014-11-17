package org.connect.api.block;

import java.util.List;

public interface IItemMeta {

	/**
	 * Get's if the meta has a display name
	 * 
	 * @return A boolean depending on if the meta has a display name
	 */
	public boolean hasDisplayName();

	/**
	 * Get's the display name of the item
	 * 
	 * @return The item's display name
	 */
	public String getDisplayName();

	/**
	 * Set's the item's display name
	 * 
	 * @param name The item's name to set
	 */
	public void setDisplayName(String name);

	/**
	 * Get's if the meta has a lore
	 * 
	 * @return A boolean depending on if the meta has a lore
	 */
	public boolean hasLore();

	/**
	 * Get's the item's lore
	 * 
	 * @return The item's lore
	 */
	public List<String> getLore();

	/**
	 * Set's the item's lore
	 * 
	 * @param lore The item's lore to set
	 */
	public void setLore(List<String> lore);

}
