package theInfiniteTerrainSimulator;

import java.util.Random;

public class Tile {
	Random randomInt = new Random();

	// attributes
	private int tileType;
	protected int xCoordinate;
	protected int yCoordinate;

	// constructors
	public Tile(int tileType, int xCoordinate, int yCoordinate) {
		this.tileType = tileType;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	public Tile(int xCoordinate, int yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}

	// methods

	public int generateTileType() {
		return randomInt.nextInt(10);
	}

	public String getTileDescription() {
		switch (this.tileType) {
		case 1:
			return "You see a lone tree swaying in the breeze, it's dead. Much like your hopes and dreams.";
		case 2:
			return "There's some grass.";
		case 3:
			return "You see a house in the distance. You could never afford somewhere like that.";
		case 4:
			return "A small leet runs in front of you. Too shallow to drown yourself in.";
		case 5:
			return "Oh boy! More grass.";
		case 6:
			return "You see some more grass.";
		case 7:
			return "I have to write all of these inane descriptions? What am I? A poet?";
		case 8:
			return "The plains stretch out as far as the eye can see. Maybe this is what death is.";
		case 9:
			return "Some sheep are grazing nearby, best keep your distance, you know you couldn't take them in a fight.";
		case 0:
			return "You see a herd of horses. It's a shame you never learnt to ride, then they could've been useful.";
		case 20:
			return "You fall into a pit of lava";
		default:
			return "No description for this place found. Maybe this is the way out?";
		}
	}

	public int getTileType() {
		return this.tileType;
	}

	public int getTileX() {
		return this.xCoordinate;
	}

	public int getTileY() {
		return this.yCoordinate;
	}

	public void setTileType(int tileType) {
		this.tileType = tileType;
	}
}
