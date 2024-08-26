package TestRostrum;

import java.util.HashMap;
import java.util.Map;

public class tryNew2 {

	public static void main(String[] args) {
		
		int[] in = {2,3,4,2,4,4,5};
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i : in) {
			
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i,1);
			}
		}
		System.out.println(map);

	}

}
