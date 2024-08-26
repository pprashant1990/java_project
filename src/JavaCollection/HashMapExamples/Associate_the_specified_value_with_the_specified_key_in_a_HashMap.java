package JavaCollection.HashMapExamples;

import java.util.*;
import java.util.Map.Entry;

public class Associate_the_specified_value_with_the_specified_key_in_a_HashMap {
	public static void main(String args[]) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		
		Iterator<Map.Entry<Integer, String>> itr = hash_map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> en = itr.next();
			System.out.println(en.getKey()+ " ##### " +en.getValue());
		}

		for (Map.Entry x : hash_map.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
		
		//check hashcode storage logic
		HashMap<String,Integer> hash_map1 = new HashMap<String,Integer>();
		hash_map1.put("test1", 1);
		hash_map1.put("test2", 2);
		hash_map1.put("test3", 3);
		System.out.println(hash_map1.get("test3") + 1 );		
		
	}
}
