package theInfiniteTerrainSimulatorTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import theInfiniteTerrainSimulator.Feature;

public class TITSTest {
	
	@Test 
	public void TestLook() {
		tileType = 1;
		assertEquals("You see a lone tree swaying in the breeze, it's dead. Much like your hopes and dreams.", 
				look(tileType));
	}
	
	@Test
	public void testNearestFeature() {
		assertEquals(5.00,nearestFeature());
	}
	
	@Test
	public void testFeatureDescription() {
		assertEquals("You see a box of Treasure, maybe this will give some meaning to your life.",
				Feature.featureDescription(1));
	}
}
