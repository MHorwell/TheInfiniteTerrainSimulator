package theInfiniteTerrainSimulator;


public class Player {
	// Attributes
	private int playerXCoordinate;
	private int playerYCoordinate;

	// Constructors
	public Player(int playerXCoordinate, int playerYCoordinate) {
		this.playerXCoordinate = playerXCoordinate;
		this.playerYCoordinate = playerYCoordinate;
	}

	// Methods
	public void movePlayer(String direction) {
		if (direction.equals("N")) {
			System.out.println("You go North");
			this.playerYCoordinate++;
		}
		else if (direction.equals("E")) {
			System.out.println("You go East");
			playerXCoordinate++;
		}
		else if (direction.equals("S")) {
			System.out.println("You go South");
			playerYCoordinate--;
		}
		else if (direction.equals("W")) {
			System.out.println("You go West");
			playerXCoordinate--;
		}
	}
	
	public int getPlayerXCoordinate() {
		return this.playerXCoordinate;
	}
	
	public int getPlayerYCoordinate() {
		return this.playerYCoordinate;
	}
	
	public double calculateDistance(Feature feature, Player player) {
		int xDistance = feature.xCoordinate - player.playerXCoordinate;
		int yDistance = feature.yCoordinate - player.playerXCoordinate;
		double distance = Math.sqrt((xDistance * xDistance) + (yDistance * yDistance));
		return distance;
	}

}
