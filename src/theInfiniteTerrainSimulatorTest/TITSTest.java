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
				testTile.getTileDescription());
	}
	
	@Test
	public void testNearestFeature() {
		Player testPlayer = new Player(0, 0,0);
		Feature testFeature = new Feature(1, 0, 1);
		assertEquals(1,testPlayer.calculateDistance(testFeature, testPlayer),0.2);
	}
	
	@Test
	public void testFeatureDescription() {
		Feature testFeature = new Feature(1, 1, 0);
		assertEquals("You see a box of treasure, maybe this will give some meaning to your life.",
				testFeature.featureDescription());
	}
}
