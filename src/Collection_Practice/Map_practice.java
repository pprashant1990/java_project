package Collection_Practice;

import java.util.*;

public class Map_practice {
	public static void main(String args[]) 
	{
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		//IdentityHashMap<Integer, String> hash_map = new IdentityHashMap<Integer, String>();
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		if(i1.equals(i2)) {
			System.out.println("i1.equals(i2)  --> true");
		}
		if(i1==i2) {
			System.out.println("i1==i2 --> true");
		}
		
		
		/*
		 * hash_map.put(new Integer(10), "pavan"); hash_map.put(new Integer(10),
		 * "kalyan");
		 * 
		 * System.out.println("hash_map : "+hash_map);
		 * 
		 * for(Map.Entry m: hash_map.entrySet()){ System.out.println(m);
		 * System.out.println(m.getKey()+"========="+m.getValue());
		 * 
		 * }
		 */
		
		
	}
}
