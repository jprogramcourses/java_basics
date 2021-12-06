package java_collection.maps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class MainMapsTest {

    @Test
    void test() {
	fail("Not yet implemented");
    }

    @Test
    void findItCodeWarsTest() {
	assertEquals(5, MainMaps.findItCodeWars(new int[] { 20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5 }));
	assertEquals(-1, MainMaps.findItCodeWars(new int[] { 1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5 }));
	assertEquals(5, MainMaps.findItCodeWars(new int[] { 20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5 }));
	assertEquals(10, MainMaps.findItCodeWars(new int[] { 10 }));
	assertEquals(10, MainMaps.findItCodeWars(new int[] { 1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1 }));
	assertEquals(1, MainMaps.findItCodeWars(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10 }));
    }

    @Test
    void findItCodeWarsTest2() {
	assertEquals(5,
		MainMaps.findItCodeWars2(new int[] { 20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5 }));
	assertEquals(-1, MainMaps.findItCodeWars2(new int[] { 1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5 }));
	assertEquals(5, MainMaps.findItCodeWars2(new int[] { 20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5 }));
	assertEquals(10, MainMaps.findItCodeWars2(new int[] { 10 }));
	assertEquals(10, MainMaps.findItCodeWars2(new int[] { 1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1 }));
	assertEquals(1, MainMaps.findItCodeWars2(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10 }));
    }

}
