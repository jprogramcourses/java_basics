package java_collection.sets.sortedset;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class PruebasSortedSet {

    // Ejemplo de Java in a Nutshell
    public static void testSortedSet(String[] args) {
	SortedSet<String> s = new TreeSet<>(Arrays.asList(args));

	// Iterate set: elements are automatically sorted
	for (String word : s) {
	    System.out.println(word);
	}

	String first = s.first();
	String last = s.last();

	// All elements but first
	SortedSet<String> tail = s.tailSet(first + '\0');

	// All elements but last
	SortedSet<String> head = s.headSet(last);

	SortedSet<String> middle = s.subSet(first + '\0', last);
    }

}
