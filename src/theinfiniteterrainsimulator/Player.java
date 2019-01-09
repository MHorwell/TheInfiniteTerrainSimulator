package theinfiniteterrainsimulator;

import java.util.Observable;

public class Player extends Observable {
	// Attributes
	private int playerXCoordinate;
	private int playerYCoordinate;
	protected int playerHealth;

	// Constructors
	public Player(int playerXCoordinate, int playerYCoordinate, int playerHealth) {
		this.playerXCoordinate = playerXCoordinate;
		this.playerYCoordinate = playerYCoordinate;
		this.playerHealth = playerHealth;
	}

	// Methods
	public void movePlayer(String direction) {
		if (direction.equals("N")) {
			System.out.println("You go North");
			this.playerYCoordinate++;
		} else if (direction.equals("E")) {
			System.out.println("You go East");
			playerXCoordinate++;
		} else if (direction.equals("S")) {
			System.out.println("You go South");
			playerYCoordinate--;
		} else if (direction.equals("W")) {
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

	public int getPlayerHealth() {
		return this.playerHealth;
	}

	public double calculateDistance(Feature feature, Player player) {
		int xDistance = feature.getFeatureXCoord() - player.getPlayerXCoordinate();
		int yDistance = feature.getFeatureYCoord() - player.getPlayerYCoordinate();
		double distance = Math.sqrt((xDistance * xDistance) + (yDistance * yDistance));
		return distance;
	}

	public void setHealth(int health) {
		
		if (this.playerHealth != health){
			this.playerHealth = health;
			setChanged();
			notifyObservers(health);
		}
	}

}
