package TestRostrum;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {

	public static void main(String[] args) {

//		String str = "laptop";
//		char[] c = str.toCharArray();
//
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		int count = 1;
//
//		for (int i = 0; i > str.length(); i++) {
//			if (!map.containsKey(c)) {
//				map.put(c[i], count);
//			} else {
//				map.put(c[i], map.get(c[i]) + 1);
//			}
//		}
//		// System.out.println(map);
//		for (Character key : map.keySet()) {
//			if (map.get(key) > 1) {
//				System.out.println(key + ":" + map.get(key));
//			}
//		}

		String str = "Laptop";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] strArray = str.toCharArray();
		for (char c : strArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);

		for(Character key: map.keySet()) {
			if(!(map.get(key) >1)) {
				System.out.println(map.get(key));
			}
		}
	}

}
