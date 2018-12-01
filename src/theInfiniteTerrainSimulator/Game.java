package theInfiniteTerrainSimulator;

import java.util.Scanner;

public class Game {

	public void playGame() {
		String cont = "y"; 
		Player pete = new Player(0, 0);
		Feature newFeature = new Feature(1, 1, 1);
		
		
		while (cont.equals("y")) {
			
			Scanner userInput = new Scanner(System.in);
			String direction = userInput.nextLine();
			pete.movePlayer(direction);
			Tile newTile = new Tile(Tile.setTileType(),
					pete.getPlayerXCoordinate(),
					pete.getPlayerYCoordinate());
			
			System.out.println(newTile.getTileDescription());
			System.out.println("X = " + pete.getPlayerXCoordinate() + ", Y = " + pete.getPlayerYCoordinate());
			System.out.println(pete.calculateDistance(newFeature, pete));
			System.out.println("Feature = " + newFeature.getFeatureXCoord() + ", " + newFeature.getFeatureYCoord());
			
			if (pete.getPlayerXCoordinate() == newFeature.getFeatureXCoord() &&
				pete.getPlayerYCoordinate() == newFeature.getFeatureYCoord()) {
				System.out.println(newFeature.featureDescription(newFeature.getFeatureNumber()));
				System.out.println("Continue? (y or n)");
				cont = userInput.nextLine();
				newFeature = new Feature(Tile.setTileType(),
						newFeature.setFeatureXCoord(),
						newFeature.setFeatureYCoord(),
						newFeature.setFeatureNumber());
			}

		}
	}
	


	

}
