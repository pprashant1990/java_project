package TestRostrum;

import java.util.HashMap;
import java.util.Map;

public class ecora_test {

	public static void main(String[] args) {

		String str = "prashant is a software engineer";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		int count = 1;
		for (char c : str.toCharArray()) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else {
				map.put(c, count);
			}

		}
		System.out.println(map);

	}

}
