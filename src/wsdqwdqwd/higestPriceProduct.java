package wsdqwdqwd;

import java.util.*;
import java.util.Map.Entry;

public class higestPriceProduct {
	public static void main(String[] args) {
		// Creating a sample map
		Map<String, Integer> map = new HashMap<>();
		map.put("nokia", 200);
		map.put("samsung", 400);
		map.put("iphone", 500);
		map.put("realme", 100);

		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		System.out.println(list);

		list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
		System.out.println(list);

		LinkedHashMap<String, Integer> m = new LinkedHashMap<>();

		for (Map.Entry<String, Integer> me : list) {
			m.put(me.getKey(), me.getValue());

		}
		System.out.println(m);

		int count = 1;
		int highest = 1;
		for (Map.Entry<String, Integer> me : m.entrySet()) {			

			if (count == highest) {
				System.out.println(me.getKey() + " #### " + me.getValue());
				break;
			}
			count++;

		}

//		//comparator logic to sort the map by value
//		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>(){
//			
//			public int compare(Map.Entry<String,Integer> obj1, Map.Entry<String,Integer> obj2) {
//				return obj2.getValue().compareTo(obj1.getValue());
//				
//			}	
//			
//		});
//		System.out.println(list);
//		
//		Map<String, Integer> sortedMap = new LinkedHashMap<>();
//		
//		for(Map.Entry<String, Integer> entry : list) {
//			sortedMap.put(entry.getKey(), entry.getValue());
//		}
//		System.out.println(sortedMap);
//		
//		
//		for(Map.Entry<String, Integer> entry1 :sortedMap.entrySet() ) {
//			System.out.println(entry1.getKey());
//			
//		}

	}
}
