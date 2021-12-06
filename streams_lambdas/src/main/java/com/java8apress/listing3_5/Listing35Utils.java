package com.java8apress.listing3_5;

import java.util.Arrays;
import java.util.Comparator;

public class Listing35Utils {

    Comparator<String> numericStringSorter = new Comparator<String>() {
	public int compare(String s1, String s2) {
	    int i1 = Integer.valueOf(s1);
	    int i2 = Integer.valueOf(s2);
	    int relativeValue = Integer.compare(i1, i2);
	    return relativeValue;
	}
    };

    public static void sortingStrings() {
	String[] stringsToSort = { "Hola", "Adiós", "Mañana" };

	Arrays.sort(stringsToSort);

	Arrays.asList(stringsToSort).forEach(System.out::println);
    }

    public void sortingStringNumbers() {
	String[] numbers = { "1", "12", "34", "23", "4" };

	Arrays.sort(numbers);
//	Arrays.sort(numbers, numericStringSorter);

	Arrays.asList(numbers).forEach(System.out::println);
    }

    public static void sortingStringNumbersLambda() {
	String[] numbers = { "1", "12", "34", "23", "4" };
	Arrays.sort(numbers, (s1, s2) -> Integer.compare(Integer.valueOf(s1), Integer.valueOf(s2)));
	Arrays.asList(numbers).forEach(System.out::println);
    }

}
