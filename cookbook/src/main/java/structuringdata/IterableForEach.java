package structuringdata;

import java.util.Collection;
import java.util.List;

public class IterableForEach {

	public static void main(String[] args) {
		Collection<String> c = List.of("One", "Two", "Three");
		
		c.forEach(s -> System.out.println(s));

	}

}
