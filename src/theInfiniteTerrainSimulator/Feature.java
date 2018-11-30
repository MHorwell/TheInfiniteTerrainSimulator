package theInfiniteTerrainSimulator;

import java.util.Random;

public class Feature extends Tile{
	// attributes
	private int featureNumber;

	// constructors
	public Feature(int tileType, int xCoordinate, int yCoordinate, int featureNumber) {
		super(tileType, xCoordinate, yCoordinate);
		this.featureNumber = setFeatureNumber();
		this.xCoordinate = (this.getPlayerXCoordinate() + random);
		this.yCoordinate = (this.PlayerYCoordinate + random);
		
	}
	
	// methods

	public int setFeatureNumber() {
		Random randomInt = new Random();
		return randomInt.nextInt(4);
	}

	public String featureDescription() {
		switch(this.featureNumber) {
		case 1: return "You see a box of treasure maybe this will give some meaning to your life.";
		case 2: return "You see an abandoned hut, somehow it's more inviting than your apartment.";
		case 3: return "A sword lies on the ground but what's the point in picking it up? It's not like you could ever use it.";
		case 4: return "You see a small silver pendant amongst the dirt, but it's gonna take much more than that to make you attractive.";
		}
		return "Error: Feature not found. Good job breaking the game.";
				}
		
	public void featureDiscovered() {
		System.out.println(this.featureDescription());
	}
	
	
}
