package TestRostrum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountWords {

	public static void main(String[] args) {

		// total count words in an string
		String str = "I am learning learning java java programming";
//		System.out.println("Origional string : "+str);
//		String[] split = str.split("\\s");
//		System.out.println("Origional String array after split : "+Arrays.toString(split));
//		System.out.println("Size of an string array : "+split.length);

		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] split = str.split("\\s");
		int count = 1;
		for (int i = 0; i < split.length; i++) {
			if (map.containsKey(split[i])) {
				map.put(split[i], map.get(split[i]) + 1);
			} else {
				//System.out.println(map.get(split[i]));				
				map.put(split[i], count);
			}
			System.out.println(map);
		}
		//System.out.println(count);
		for (String x : map.keySet()) {
			System.out.println("count of word :" + x + " = " + map.get(x));
		}

		// get the unique elements in an string array
//		Collection<String> c = Arrays.asList(split);
//		
//		List<String> l =  Arrays.asList(split);
//		System.out.println(l);  // all string object values as per the string array
//		
//		
//		HashSet<String> uniqe = new HashSet<String>(c);
//		System.out.println("Unique elements in an string array : "+uniqe);
//		

		// Set<String> uniqe = HashSet<String>(ll1);

		// count number of occurrences of each words in an string

		String str1 = "I am learning learning java java programming";

		// hashmap stores key value pair

	}

}
