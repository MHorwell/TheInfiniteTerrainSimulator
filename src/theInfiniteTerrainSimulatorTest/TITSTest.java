package theInfiniteTerrainSimulatorTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import theInfiniteTerrainSimulator.Feature;
import theInfiniteTerrainSimulator.Player;
import theInfiniteTerrainSimulator.Tile;

public class TITSTest {
	
	@Test 
	public void testDescription() {
		Tile testTile = new Tile(1,1,1);
		assertEquals("You see a lone tree swaying in the breeze, it's dead. Much like your hopes and dreams.", 
				testTile.getTileType());
	}
	
	@Test
	public void testNearestFeature() {
		Player testPlayer = new Player(0, 0);
		Feature nearestFeature = new Feature(1, 0, 1, 1);
		assertEquals(5.00,calculateDistance(testPlayer, nearestFeature));
	}
	
	@Test
	public void testFeatureDescription() {
		assertEquals("You see a box of Treasure, maybe this will give some meaning to your life.",
				Feature.featureDescription(1));
	}
}
