package java_collection.collectioninterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class CollectionInterfaceOperations {

    public static Collection<String> c = new HashSet<>();

    public static Collection<String> d = Arrays.asList("one", "two");
    public static Collection<String> e = Collections.singleton("three");

    public static void operationsCollection() {
	c.add("zero");
	c.addAll(d);

	Collection<String> copy = new ArrayList<String>(c);
    }

}
