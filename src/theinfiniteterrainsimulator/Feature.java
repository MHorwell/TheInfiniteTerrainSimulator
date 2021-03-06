package theinfiniteterrainsimulator;

public class Feature extends Tile{

	// attributes
	private int featureNumber;
	
	// constructors
	public Feature(int xCoordinate, int yCoordinate) {
		super(xCoordinate, yCoordinate);
	}
	
	public Feature(int xCoordinate, int yCoordinate, int featureNumber) {
		super(xCoordinate, yCoordinate);
		this.featureNumber = featureNumber;
	}
	
	// methods
	public void setFeatureNumber() {
		this.featureNumber = randomInt.nextInt(3);
	}
	
	public String featureDescription() {
		switch(this.featureNumber) {
		case 0: return "You see a box of treasure, maybe this will give some meaning to your life.";
		case 1: return "You see an abandoned hut, somehow it's more inviting than your apartment.";
		case 2: return "A sword lies on the ground but what's the point in picking it up? It's not like you could ever use it.";
		case 3: return "You see a small silver pendant amongst the dirt, but it's gonna take much more than that to make you attractive.";
		default: return "Error: Feature not found. Good job breaking the game.";
		}
				}
		
	public int getFeatureNumber() {
		return this.featureNumber;
	}
	
	public int getFeatureXCoord() {
		return this.getTileX();
	}
	
	public int getFeatureYCoord() {
		return this.getTileY();
	}
	
	public int setFeatureXCoord() {
		return this.getTileX() - 5 + randomInt.nextInt(10);
	}
	
	public int setFeatureYCoord() {
		return this.getTileY() - 5 + randomInt.nextInt(10);
	}

}
