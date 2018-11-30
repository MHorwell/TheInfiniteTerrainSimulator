package theInfiniteTerrainSimulator;

import zoo.Zoo;

public abstract class Tile {

	// attributes
	private int tileType;
	private int xCoordinate;
	private int yCoordinate;
	private boolean hasFeature;

	// constructors
	public Tile(int vTileType, int xCoordinate, int yCoordinate, boolean vTileHasFeature) {
		this.tileType = vTileType;
		this.setHasFeature(vTileHasFeature);
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}

	// methods
	public String tileDescription(){
		if (this.hasFeature == true){
			Feature newfeature = new Feature();
		
			return newfeature.featureDescription();
		}
		else {
			
			switch(tileType) {
			case 1: return "You see a lone tree swaying in the breeze, it's dead. Much like your hopes and dreams.";
			case 2: return "There's some grass.";
			case 3: return "You see a house in the distance. It's much nicer than yours.";
			case 4: return "A small leet runs in front of you. Too shallow to drown yourself in.";
			case 5: return "Oh boy! More grass.";
			case 6: return "You see some more grass.";
			case 7: return "I have to write all of these inane descriptions? What am I? A poet?";
			case 8: return "The plains stretch out as far as the eye can see. Maybe this is what death is.";
			case 9: return "Some sheep are grazing nearby, best keep your distance, you know you couldn't take them in a fight.";
			case 10: return "You see a herd of horses. It's a shame you never learnt to ride, then they could've been useful.";
			}
			
			return: "No description for this place found. Maybe this is the way out?"
		}
	}

	public void setHasFeature(boolean hasFeature) {
		this.hasFeature = hasFeature;
	}
