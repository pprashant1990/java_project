package wsdqwdqwd;

import java.util.HashMap;
import java.util.Map;

public class openText1 {

	public static void main(String[] args) {

		String[] str = { "aaa", "bbb", "ccc", "bbb", "aaa", "aaa" };

		Map<String, Integer> map = new HashMap<String, Integer>();

		int count = 1;
		for (String s : str) {

			if (map.containsKey(s)) {

				map.put(s, map.get(s) + 1);

			} else {
				map.put(s, count);
			}
		}
		System.out.println(map); // {aaa=3, bbb=2, ccc=1};

		for (Map.Entry<String, Integer> me : map.entrySet()) {

			if (me.getValue() == 2) {

				System.out.println(me.getKey() + "###" + me.getValue()); // bbb = 2

			}

			// System.out.println(me.getKey()); //[aaa , //bbb = 2]

		}

	}

}
