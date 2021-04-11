package com.juan.practicas.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {

	public static void main(String[] args) {

		List<String> listNames = names;
		List<String> filteredList = names.stream().filter(e -> e.startsWith("J")).sorted().collect(Collectors.toList());
		
		filteredList.forEach(n -> System.out.println(n));

	}
	
	
	private static List<String> names = new ArrayList<>(Arrays.asList("Juan", "María", "Jose", "Ana", "Jorge", "Javier", "Marta", "Laura"));

}
