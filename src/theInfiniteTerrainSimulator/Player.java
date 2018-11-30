package theInfiniteTerrainSimulator;

import java.util.Scanner;

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
	public void movePlayer() {
		Scanner userInput = new Scanner(System.in);

		String direction = userInput.nextLine();

		if (direction == "N") {
			playerYCoordinate++;
		}

		else if (direction == "E") {
			playerXCoordinate++;
		}

		else if (direction == "S") {
			playerYCoordinate--;
		}

		else if (direction == "W") {
			playerXCoordinate--;
		}
	}
	
	public int getPlayerXCoordinate() {
		return this.playerXCoordinate;
	}
	
	public int getPlayerYCoordinate() {
		return this.playerYCoordinate;
	}
	
	public double calculateDistance(Feature featureLocation, Player playerLocation) {
		int xDistance = featureLocation.xCoordinate - playerLocation.playerXCoordinate;
		int yDistance = featureLocation.yCoordinate - playerLocation.playerXCoordinate;
		double distance = Math.sqrt((xDistance * xDistance) + (yDistance * yDistance));
		return distance;
	}

}
