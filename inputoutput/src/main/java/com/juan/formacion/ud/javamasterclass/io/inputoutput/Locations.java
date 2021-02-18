package com.juan.formacion.ud.javamasterclass.io.inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by timbuchalka on 2/04/2016.
 */
public class Locations implements Map<Integer, Location> {
	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

	public static void main(String[] args) throws IOException {
		
		try(BufferedWriter locFile = new BufferedWriter(new FileWriter("locations.txt"));
				BufferedWriter dirFile = new BufferedWriter(new FileWriter("directions.txt"))){
			for(Location loc : locations.values()) {
				locFile.write(loc.getLocationID() + "," + loc.getDescription() + "\n");
				for(String direction : loc.getExits().keySet()) {
					if(!direction.equalsIgnoreCase("Q")) {						
						dirFile.write(loc.getLocationID() + "," + direction + "," + loc.getExits().get(direction) + "\n");
					}
				}
			}
		}
		
		/*
		FileWriter locFile = null;
		try {
			locFile = new FileWriter("locations.txt");
			for (Location l : locations.values()) {
				locFile.write(l.getLocationID() + ", " + l.getDescription() + "\n");
				throw new IOException("text exception wrote while writing");
			}
		} finally {
			if (locFile != null) {
				System.out.println("Attempting to close locfile");
				locFile.close();
			}
		}
		 */
	}

	static{
		
		
		try(Scanner scannerLoc = new Scanner(new BufferedReader(new FileReader("locations_big.txt")));
			Scanner scannerDir = new Scanner(new BufferedReader(new FileReader("directions_big.txt")))) {
			
			scannerLoc.useDelimiter(",");
			while(scannerLoc.hasNextLine()) {
				int loc = scannerLoc.nextInt();
				scannerLoc.skip(scannerLoc.delimiter());
				String description = scannerLoc.nextLine();
				System.out.println("Imported loc " + loc + ": " + description);
				
				Map<String, Integer> tempExit = new HashMap<>();
				locations.put(loc, new Location(loc, description, tempExit));
			}
			
			// Now read the directions
			scannerDir.useDelimiter(",");
			while(scannerDir.hasNextLine()) {
//				int locId = scannerDir.nextInt();
//				scannerDir.skip(scannerDir.delimiter());
//				String direction = scannerDir.next();
//				scannerDir.skip(scannerDir.delimiter());
//				String dest = scannerDir.nextLine();
//				int destination = Integer.parseInt(dest);
				
				String input = scannerDir.nextLine();
				String[] data = input.split(",");
				int locId = Integer.parseInt(data[0]);
				String direction = data[1];
				int destination = Integer.parseInt(data[2]);
				
				System.out.println(locId + ", " + direction + ", " + destination);
				Location location = locations.get(locId);
				location.addExit(direction, destination);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
//		Map<String, Integer> tempExit = new HashMap<String, Integer>();
//		locations.put(0, new Location(0, "You are sitting in front of a computer learning Java", null));
//
//		tempExit = new HashMap<String, Integer>();
//		tempExit.put("W", 2);
//		tempExit.put("E", 3);
//		tempExit.put("S", 4);
//		tempExit.put("N", 5);
//		locations.put(1,
//				new Location(1, "You are standing at the end of a road before a small brick building", tempExit));
//
//		tempExit = new HashMap<String, Integer>();
//		tempExit.put("N", 5);
//		locations.put(2, new Location(2, "You are at the top of a hill", tempExit));
//
//		tempExit = new HashMap<String, Integer>();
//		tempExit.put("W", 1);
//		locations.put(3, new Location(3, "You are inside a building, a well house for a small spring", tempExit));
//
//		tempExit = new HashMap<String, Integer>();
//		tempExit.put("N", 1);
//		tempExit.put("W", 2);
//		locations.put(4, new Location(4, "You are in a valley beside a stream", tempExit));
//
//		tempExit = new HashMap<String, Integer>();
//		tempExit.put("S", 1);
//		tempExit.put("W", 2);
//		locations.put(5, new Location(5, "You are in the forest", tempExit));
		
	}

	public int size() {
		return locations.size();
	}

	public boolean isEmpty() {
		return locations.isEmpty();
	}

	public boolean containsKey(Object key) {
		return locations.containsKey(key);
	}

	public boolean containsValue(Object value) {
		return locations.containsValue(value);
	}

	public Location get(Object key) {
		return locations.get(key);
	}

	public Location put(Integer key, Location value) {
		return locations.put(key, value);
	}

	public Location remove(Object key) {
		return locations.remove(key);
	}

	public void putAll(Map<? extends Integer, ? extends Location> m) {
		locations.putAll(m);
	}

	public void clear() {
		locations.clear();
	}

	public Set<Integer> keySet() {
		return locations.keySet();
	}

	public Collection<Location> values() {
		return locations.values();
	}

	public Set<Entry<Integer, Location>> entrySet() {
		return locations.entrySet();
	}

}
