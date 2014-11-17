package org.connect.api.world.biome;


public interface IBiome {

	/**
	 * Get's the biome's type
	 * 
	 * @return The biome's type
	 */
	public BiomeType getType();

	/**
	 * Get's if the biome is raining
	 * 
	 * @return A boolean depending if the biome is raining
	 */
	public boolean isRaining();

	/**
	 * Replaces the biome with another biome
	 * 
	 * @param type The biome to replace it with
	 */
	public void replaceWith(BiomeType type);

}
