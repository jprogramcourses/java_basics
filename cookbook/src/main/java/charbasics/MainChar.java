package charbasics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainChar {

	public static void main(String[] args) {

		System.out.println(accum("pmwc nhqaz rfb"));

	}
	
	private static boolean containAllAlphabet(String phrase) {
		final String[] alfabetArray = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
	    Set<String> alfabet = new HashSet<String>(Arrays.asList(alfabetArray));
	    return Arrays.asList(phrase.trim().split("")).containsAll(alfabet);
	}
	
	private static String accum(String word) {
		
		String wordTrim = word.replaceAll(" ", "");
		String[] wordArray = wordTrim.split("");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < wordArray.length; i++) {
			sb.append(wordArray[i].toUpperCase());
			for(int j = 0; j < i; j++) {
				sb.append(wordArray[i].toLowerCase());
			}
			if(i < wordArray.length - 1) {
				sb.append("-");
			}
		}
		
		return sb.toString();
	}

}
