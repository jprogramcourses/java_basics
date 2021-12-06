package java_collection.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsLambdaExpressions {

    public static void main(String[] args) {
	filter();
	filterWithPredicates();
    }

    private static void filter() {
	String[] input = { "tiger", "cat", "TIGER", "Tiger", "leopard" };
	List<String> cats = Arrays.asList(input);
	String search = "tiger";
	String tigers = cats.stream().filter(s -> s.equalsIgnoreCase(search)).collect(Collectors.joining(", "));
	System.out.println(tigers);
    }

    private static void filterWithPredicates() {
	String[] input = { "tiger", "cat", "TIGER", "Tiger", "leopard" };
	List<String> cats = Arrays.asList(input);
	String search = "tiger";
	Predicate<String> p = s -> s.equalsIgnoreCase(search);
	Predicate<String> combined = p.or(l -> l.equals("leopard"));
	String tigers = cats.stream().filter(combined).collect(Collectors.joining(", "));
	System.out.println(tigers);
    }

}
