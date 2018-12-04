package theInfiniteTerrainSimulator;

import java.util.Observable;
import java.util.Observer;


public class HealthObserver implements Observer {

	private int health;

	public HealthObserver(int health) {
		this.health = health;
	}
	
	public int getHealth() {
		return this.health;
	}

	public void update(Observable obj, Object args) {
		
		System.out.println("Your health is now "+ args + ", you idiot.");
	}

}
