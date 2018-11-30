package theInfiniteTerrainSimulator;

import java.util.Scanner;

public class Game {

	public void playGame() {
		String cont = "y";
		Player pete = new Player(0, 0);
		
		while (cont.equals("y")) {
			
			Scanner userInput = new Scanner(System.in);
			String direction = userInput.nextLine();
			pete.movePlayer(direction);
			
			Tile newTile = new Tile(Tile.setTileType(),
					pete.getPlayerXCoordinate(),
					pete.getPlayerYCoordinate());
			System.out.println(newTile.getTileDescription());
			System.out.println("X = " + pete.getPlayerXCoordinate() + ", Y = " + pete.getPlayerYCoordinate());

		}
	}
	


	

}
