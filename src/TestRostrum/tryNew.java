package TestRostrum;

import java.util.*;
import java.util.Map.Entry;

public class tryNew {

	public static void main(String[] args) {

		String str = "tomorrow";
		
		//int[] int= {2,3,1,2,4,2};

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : str.toCharArray()) {

			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);

			} else {

				map.put(c, 1); 
				//t 1
				//
			}

		}
		System.out.println(map);

		for (Map.Entry<Character, Integer> e : map.entrySet()) {

			if (e.getValue() > 1) {
				System.out.println(e.getKey());

			}

		}

	}
}
