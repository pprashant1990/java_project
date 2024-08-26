package wsdqwdqwd;

import java.util.*;

public class tryMap {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("test1", 1);
		map.put("test3", 3);
		map.put("test4", 4);
		map.put("test2", 2);
		System.out.println(map);
		
		List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		System.out.println(list);
		list.sort((a,b)-> b.getValue().compareTo(a.getValue()));
		System.out.println(list);
		
		LinkedHashMap<String,Integer> lhmap = new LinkedHashMap<String,Integer>();
		
		for(Map.Entry<String,Integer> me : list ) {			
			lhmap.put(me.getKey(), me.getValue());			
		}
		System.out.println(lhmap);
		
		for(Map.Entry<String,Integer> me1 : lhmap.entrySet()) {
			
			if(me1.getValue() > 1) {
				System.out.println(me1.getKey());
			}
			
		}
		
		
		
		

	}

}
