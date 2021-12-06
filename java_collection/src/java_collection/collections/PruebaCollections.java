package java_collection.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PruebaCollections {

    public static void main(String[] args) {
	utilityMethods();
    }

    private static void utilityMethods() {
	List<Integer> ints = createList();
	System.out.println(ints);
	Collections.sort(ints);
	System.out.println("ints: " + ints);

	int pos = Collections.binarySearch(ints, 5);
	System.out.println(pos);

	List<Integer> randomIntegerList = createRandomIntegerList(ints.size());
	System.out.println("randomIntegerList: " + randomIntegerList);

	// Copy list2 into list1, overwriting list1
	Collections.copy(ints, randomIntegerList);
	System.out.println("ints after copy: " + ints);

	System.out.println("Largest element in inst: " + Collections.max(ints));
    }

    private static List<Integer> createList() {
	List<Integer> listInteger = Arrays.asList(new Integer[] { 5, 6, 8, 15, -6, 25, -5 });
	return listInteger;
    }

    private static List<Integer> createRandomIntegerList(int length) {
	List<Integer> randomList = new ArrayList<>();
//	int length = (int) (Math.random() * 100);
	for (int i = 0; i < length; i++) {
	    randomList.add((int) (Math.random() * 100));
	}
	return randomList;
    }

}
