package java_collection.maps;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainMaps {

    private static String[] words = { "this", "is", "a", "test" };

    public static void main(String[] args) {
	exampleMaps();

    }

    private static void exampleMaps() {

	Map<String, Integer> m = new HashMap<>();

	Map<String, Integer> singleton = Collections.singletonMap("test", -1);

	Map<String, Integer> empty = Collections.<String, Integer>emptyMap();

	for (int i = 0; i < words.length; i++) {
	    m.put(words[i], i);
	}

	boolean containsKey = m.containsKey(words[0]);
	System.out.println("Contains key: " + containsKey);

	boolean containsValue = m.containsValue(words[0]);
	System.out.println("Contains value: " + containsValue);

	Set<String> keys = m.keySet();
	Collection<Integer> values = m.values();
	Set<Map.Entry<String, Integer>> entries = m.entrySet();

	System.out.printf("Map: %s%nKeys: %s%nValues: %s%nEntries: %s%n", m, keys, values, entries);

    }

    public static int findItCodeWars(int[] a) {

	int odd = -1;

	Map<Integer, Integer> mapAppearances = new HashMap<>();

	for (int i = 0; i < a.length; i++) {
	    if (mapAppearances.containsKey(a[i])) {
		mapAppearances.put(a[i], mapAppearances.get(a[i]) + 1);
	    } else {
		mapAppearances.put(a[i], 1);
	    }
	}

	for (Map.Entry<Integer, Integer> entry : mapAppearances.entrySet()) {
	    if (entry.getValue() % 2 != 0) {
		odd = entry.getKey();
	    }
	}

	return odd;
    }

    /*
     * 12 22 32
     */
    public static int findItCodeWars2(int[] a) {
	int odd = -1;
	int[][] repetitionsNumber = new int[a.length][a.length];

	for (int i = 0; i < a.length; i++) {
	    for (int k = 0; k < repetitionsNumber.length; k++) {
		if (a[i] == repetitionsNumber[k][1]) {
		    repetitionsNumber[k][2]++;
		} else {
		    repetitionsNumber[i][1] = a[i];
		    repetitionsNumber[i][2] = repetitionsNumber[i][2] + 1;
		}
	    }
	}

	for (int j = 0; j < repetitionsNumber.length; j++) {
	    if (repetitionsNumber[j][2] % 2 != 0) {
		odd = repetitionsNumber[j][1];
	    }
	}
	return odd;
    }

}
