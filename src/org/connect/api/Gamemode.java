package org.connect.api;

public enum Gamemode {

	SURVIVAL(0),
	CREATIVE(1),
	ADVENTURE(2),
	SPECTATOR(3);

	private int id;

	private Gamemode(int gm) {
		id = gm;
	}

	public int getID() {
		return id;
	}

	public Gamemode getName() {
		for (Gamemode gm : values()) {
			if (gm.getID() == id)
				return gm;
		}
		return null;
	}

}
