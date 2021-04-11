package com.juan.formacion.cookbook.standardinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class ReadStdinIntsFunctional {
	
	private static Stream<Integer> parseIntSafe(String s){
		try {
			return Stream.of(Integer.parseInt(s));
		}catch(NumberFormatException e) {
			return Stream.empty();
		}
	}
	
	public static void functionalStyle() throws IOException {
		try(BufferedReader is = new BufferedReader(new InputStreamReader(System.in));){
			is.lines().flatMap(ReadStdinIntsFunctional::parseIntSafe).forEach(System.out::println);
		}catch(IOException e) {
			throw e;
		}
	}

}
