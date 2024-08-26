package TestRostrum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class tryNew6 {

	public static void main(String[] args) {
		
		
		Map<String,Integer> map = new HashMap<String,Integer>();		
		map.put("nokia", 300);
		map.put("apple", 500);
		map.put("realme", 100);
		System.out.println(map);
		
		List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		list.sort((a,b) -> b.getValue().compareTo(a.getValue()));
		System.out.println(list);
		
		LinkedHashMap<String,Integer> ll = new LinkedHashMap<String,Integer>();
		
		for(Map.Entry<String,Integer> me : list) {
			
			ll.put(me.getKey(), me.getValue());
		
		}
		System.out.println(ll);
		
		int count = 1;
		for(Map.Entry<String,Integer> me2 : ll.entrySet()) {
			
			if(count == 2) {
			System.out.println(me2.getKey() + "###" + me2.getValue());
			break;
			}
			
		}
		
		
		
		
		
//		int[] i = {1, 2, 3, 4, 1, 2, 5, 6, 7, 8, 5};
//		
//		Arrays.sort(i);
//		
//		String[] str = new String[i.length];
//		int k=0;
//		for(int j : i){
//			str[k++] = String.valueOf(j);			
//		}
//		System.out.println(Arrays.toString(str));
//		
//		int[] b = new int[str.length];
//		int f=0;
//		for(String s : str) {
//			b[f++] = Integer.parseInt(s);
//		}
//		System.out.println(Arrays.toString(b));
		
		
		
		/*int[] i = {1, 2, 3, 4, 1, 2, 5, 6, 7, 8, 5};
		
		String[] str = new String[i.length];
		int k=0;
		for(int j : i){
			str[k++] = String.valueOf(j);			
		}
		System.out.println(Arrays.toString(str));
		
		List l = Arrays.asList(str);
		Set s = new HashSet(l);
		System.out.println(s);*/

		

//		String str = "kdodowdkwkdkwd";
//		String expectedStr = "k";
//		String[] strChar = str.split("");
//		
//		List<String> ls = Arrays.asList(strChar);
//		ArrayList<String> al = new ArrayList<String>(ls);
//		System.out.println(ls);
//		
//		for(int i = 0 ; i < al.size();i++) {
//			
//			if(al.get(i).equals(expectedStr)) {
//				
//				al.remove(i);
//				al.addFirst(expectedStr);
//			}
//			
//		}
//		
//		System.out.println(al);
		
	}
}
