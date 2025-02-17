package JavaCollection.HashMapExamples;

import java.util.*;

public class Check_whether_a_map_contains_keyValue_mappings_$empty$_or_not {
	public static void main(String args[]) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		
		// check if map is empty
		boolean result = hash_map.isEmpty();
		
		// check the result
		System.out.println("Is hash map empty: " + result);
		
		// Removing all the elements from the linked map
		hash_map.clear();
		
		// check if map is empty
		result = hash_map.isEmpty();
		
		// check the result
		System.out.println("Is hash map empty: " + result);
	}
}
