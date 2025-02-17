package JavaCollection.HashMapExamples;

import java.util.*;

public class Test_if_a_map_contains_a_mapping_for_the_specified_value {
	public static void main(String args[]) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		// print the map
		System.out.println("The Original map: " + hash_map);
		System.out.println("1. Is value \'Green\' exists?");
		if (hash_map.containsValue("Green")) {
			// value exists
			System.out.println("Yes! ");
		} else {
			// value does not exists
			System.out.println("no!");
		}

		System.out.println("\n2. Is value \'orange\' exists?");
		if (hash_map.containsValue("orange")) {
			System.out.println("yes! - ");
		} else {
			System.out.println("No!");
		}
	}
}
