package org.connect.api.inventory;

public enum InventoryType {

	ANVIL(3),
	BEACON(1),
	BREWING(4),
	CHEST(27),
	CHEST_DOUBLE(54),
	CREATIVE(9),
	DISPENSER(9),
	DROPPER(9),
	ENCHANTING(1),
	ENDER(27),
	FURNACE(3),
	HOPPER(5),
	MERCHANT(3),
	PLAYER(36);

	int size;

	private InventoryType(int size) {
		this.size = size;
	}

	/**
	 * Get's the inventory's size
	 * 
	 * @return The inventory's size
	 */
	public int getSize() {
		return size;
	}

}
