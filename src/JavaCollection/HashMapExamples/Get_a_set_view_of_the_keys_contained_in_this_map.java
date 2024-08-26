package JavaCollection.HashMapExamples;

import java.util.*;

public class Get_a_set_view_of_the_keys_contained_in_this_map {
	public static void main(String args[]) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");

		// get keyset value from map
		Set keyset = hash_map.keySet();

		// check key set values
		System.out.println("Key set values are: " + keyset);
	}
}
