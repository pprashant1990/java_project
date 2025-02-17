package JavaCollection.HashSetExamples;

import java.util.*;
import java.util.Iterator;

public class Get_the_number_of_elements_in_a_hash_set {
	public static void main(String[] args) {
		// Create a empty hash set
		HashSet<String> h_set = new HashSet<String>();
		// use add() method to add values in the hash set
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		System.out.println("Original Hash Set: " + h_set);
		System.out.println("Size of the Hash Set: " + h_set.size());
	}
}
