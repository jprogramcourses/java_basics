package JavaSEStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceExamples {
	
	private static Stream<String> stringStream = Stream.of("AAA", "B", "CCCC", "DD", "EEE", "FFFF", "GG", "HHHH");
	
	public static Optional<String> reduceExample1() {
		
		Optional<String> x = stringStream.reduce((s1,s2) -> s1.length() > s2.length() ? s1:s2);
		
		return x;
	}
	
	public static void reduceExample2(){
		
		listNames().stream().reduce(String::concat).ifPresent(System.out::println);
		
	}
	
	public static void reduceExample3() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		int result = numbers.stream().reduce(0, (subtotal, element) -> subtotal + element);
		
		System.out.println("Result " + result);
	}
	
	private static List<String> listNames(){
		List<String> names = new ArrayList<>();
		names.add("Juan");
		names.add("Laura");
		names.add("Jorge");
		names.add("Gustavo");
		names.add("María");
		
		return names;
	}

}
