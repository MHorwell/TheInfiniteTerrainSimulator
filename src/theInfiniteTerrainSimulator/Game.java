package theInfiniteTerrainSimulator;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {

	public void playGame() {
		String cont = "y";
		Player pete = new Player(0, 0);
		Feature newFeature = new Feature(1, 1, 1);
		Tile startTile = new Tile(pete.getPlayerXCoordinate(), pete.getPlayerYCoordinate());
		startTile.setTileType(startTile.generateTileType());
		List<Tile> tileList = new LinkedList<Tile>();
		tileList.add(startTile);
		System.out.println("You awaken on a vast moor, sucks to be you. Move? (N, E, S, W)");
		System.out.println(startTile.getTileDescription(startTile.getTileType()));

		while (cont.equals("y")) {

			Scanner userInput = new Scanner(System.in);
			String direction = userInput.nextLine();
			pete.movePlayer(direction);
			boolean tileExists = false;
			
			if (pete.getPlayerXCoordinate() == newFeature.getFeatureXCoord()
					&& pete.getPlayerYCoordinate() == newFeature.getFeatureYCoord()) {
				System.out.println(newFeature.featureDescription(newFeature.getFeatureNumber()));
				System.out.println("Continue? (y or n)");
				cont = userInput.nextLine();
				newFeature = new Feature(newFeature.generateTileType(), newFeature.setFeatureXCoord(),
						newFeature.setFeatureYCoord(), newFeature.setFeatureNumber());
			}

			for (Tile tiles : tileList) {
				
				if (pete.getPlayerXCoordinate() == tiles.getTileX()
						&& pete.getPlayerYCoordinate() == tiles.getTileY()) {
					tileExists = true;
					System.out.println(tiles.getTileDescription(tiles.getTileType()));
					System.out.println("Nearest feature is " + pete.calculateDistance(newFeature, pete) + "m away.");
					break;
				}
			}

			if (tileExists == false) {
				Tile newTile = new Tile(pete.getPlayerXCoordinate(), pete.getPlayerYCoordinate());
				newTile.setTileType(newTile.generateTileType());
				System.out.println(newTile.getTileDescription(newTile.getTileType()));
				tileList.add(newTile);
				System.out.println("Nearest feature is " + pete.calculateDistance(newFeature, pete) + "m away.");
			}

		}
	}

}
