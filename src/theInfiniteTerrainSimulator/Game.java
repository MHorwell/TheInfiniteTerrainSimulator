package theInfiniteTerrainSimulator;

import java.util.Scanner;

public class Game {

	public void playGame() {
		String cont = "y"; 
		Player pete = new Player(0, 0);
		Feature newFeature = new Feature(1, 1, 1, 1);
		
		while (cont.equals("y")) {
			
			Scanner userInput = new Scanner(System.in);
			String direction = userInput.nextLine();
			pete.movePlayer(direction);
			Tile newTile = new Tile(Tile.setTileType(),
					pete.getPlayerXCoordinate(),
					pete.getPlayerYCoordinate());
			if (pete.getPlayerXCoordinate() == newFeature.getFeatureXCoord() &&
					pete.getPlayerYCoordinate() == newFeature.getFeatureYCoord()) {
				Feature newfeature = newFeature.featureDiscovered();
			}
			System.out.println(newTile.getTileDescription());
			System.out.println("X = " + pete.getPlayerXCoordinate() + ", Y = " + pete.getPlayerYCoordinate());
			System.out.println(pete.calculateDistance(newFeature, pete));
		}
	}
	


	

}
