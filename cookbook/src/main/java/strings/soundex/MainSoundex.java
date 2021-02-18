package strings.soundex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainSoundex {

	public static void main(String[] args) {
		String[] names = {
			"Darwin, Ian",
			"Davidson, Greg",
			"Darwent, William",
			"Derwin, Daemon"
		};
		List<String> setNames = new ArrayList<>();
		for(String name : names) {
			System.out.println(Soundex.soundex(name) + ' ' + name);
			setNames.add(Soundex.soundex(name) + ' ' +name);
		}
		
		Collections.sort(setNames);
		
		for(String name : setNames) {
			System.out.println(name);
		}

	}

}
