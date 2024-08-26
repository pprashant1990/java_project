package wsdqwdqwd;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import junit.framework.Assert;

public class practice01 {

	public static void main(String[] args) throws IOException {

		Map<String, List<String>> stateCities = new HashMap<String, List<String>>();
		stateCities.put("KA", Arrays.asList("A1", "B1", "C1"));
		stateCities.put("CG", Arrays.asList("D1", "E1", "C1"));
		System.out.println("stateCities : "+stateCities);

		findCommonCityStates(stateCities);

	}

	public static void findCommonCityStates(Map<String, List<String>> stateCities) {
		
		//create a set to store all cities in one
		Set<String> allCities = new HashSet<>();
		
		for(Map.Entry<String, List<String>> cities : stateCities.entrySet()) {
			allCities.addAll(cities.getValue());
		}
		System.out.println("allCities : "+allCities);
		
		 //create a map to store commom city states		
		 Map<String, List<String>> commonCityStates = new HashMap<>();
		 
		 for (String city : allCities) {
			 
			 List<String> states = new ArrayList<>();
			
			 for(Map.Entry<String, List<String>> entry : stateCities.entrySet()) {
				 if(entry.getValue().contains(city)) {
					 states.add(entry.getKey());
				 }
				 if(states.size() > 1) {
					 commonCityStates.put(city, states);
				 }
			 }
			 
		 }
		 System.out.println(commonCityStates);
		
		 // Print the results
	        for (Map.Entry<String, List<String>> entry : commonCityStates.entrySet()) {
	            System.out.println("City: " + entry.getKey() + ", States: " + entry.getValue());
	        }
		 
		 

	}
}
//		int[] array = { 5, 2, 9, 1, 6, 3 };
//		
//		int min = array[0];
//		int max = array[0];
//		
//		int count =0;
//		for(int i : array) {
//			if(array[count] < min ) {
//				min = array[count];
//			}
//			if(array[count] > max) {
//				max = array[count];
//			}
//			count++;
//		}
//		System.out.println(min+"#####"+max);
//		

//		ArrayList<String> arrayList = new ArrayList<>();
//		arrayList.add("Apple");
//		arrayList.add("Banana");
//		arrayList.add("Cherry");
//		arrayList.add("Date");
//		arrayList.add("Elderberry");
//		System.out.println(arrayList);
//		
//		System.out.println(arrayList.get(0));
//		System.out.println(arrayList.get(arrayList.size()-1));

//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("test4", 4);
//		map.put("test1", 1);
//		map.put("test2", 2);
//		map.put("test3", 3);
//		System.out.println(map);
//
//		ArrayList<Map.Entry<String, Integer>> al = new ArrayList<>(map.entrySet());
//		System.out.println(al);
//		// sort the map by value
//		al.sort((a, b) -> b.getValue().compareTo(a.getValue()));
//		System.out.println(al);
//
//		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
//
//		for (Map.Entry<String, Integer> me : al) {
//			lhm.put(me.getKey(), me.getValue());
//		}
//		System.out.println(lhm);
//
//		Iterator<Map.Entry<String, Integer>> itr = lhm.entrySet().iterator();
//
//		while (itr.hasNext()) {			
//			Entry<String, Integer> e = (Entry<String, Integer>) itr.next();
//			System.out.println(e);
//			break;
//		}

//		List<String> list = Arrays.asList("test "," prashant ","vaishali");
//		List<String> listNew = list.stream().map(a -> new StringBuffer(a.trim()).reverse().toString()).collect(Collectors.toList());
//		System.out.println(listNew);

// String s = new StringBuffer("test").reverse().toString();

//

//		int a[] = { 1, 10, 24, 36, 8, 17, 3, 1, 2 };
//
//		for (int i : a) {
//			if (isPrime(i)) {
//				System.out.println(i + " is a prime number");
//			} else {
//				System.out.println(i + " is Not a prime number");
//			}
//		}
//	}
//
//	public static boolean isPrime(int i) {
//
//		if (i == 1) {
//			return false;
//		}
//
//		for (int j = 2; j < i / 2; j++) {
//
//			if (i % 2 == 0) {
//				return false;
//			}
//
//		}
//
//		return true;

// shift all 5 to right\\\
//		String str = "Hello World!";
//		String strNew = "";
// 		
//		for(char c: str.toCharArray()) {
//			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u') {				
//				
//			}else {
//				strNew = strNew + c;
//			}
//		}
//		System.out.println(strNew);
//		

//		String str = "my name is prashant";
//		
//		String[] arrStr = str.split("\\s");
//		
//		List<String> list = Arrays.asList(arrStr);
//		List<Integer> countEach = list.stream().map(a -> a.length()).collect(Collectors.toList());
//		System.out.println(countEach);
//		
//		Map<String,Integer> map = new HashMap<String,Integer>();
//		
//		for(int i = 0 ; i <arrStr.length ;i++) {
//			map.put(arrStr[i], countEach.get(i));
//		}
//		System.out.println(map);
//		

//		String strNew = "";
//		
//		for(String s : str.split("\\s")) {
//			strNew = strNew + s;
//		}
//		System.out.println(strNew);
//		
//		Map<Character,Integer> map = new HashMap<Character,Integer>();
//		
//		int count = 1;
//		for(char c : str.toCharArray()) {
//			if(map.containsKey(c)) {
//				map.put(c, map.get(c)+1);
//			}else {
//				map.put(c,count);
//			}
//		}
//		System.out.println(map);

// String str1 = "army";
//		String str2 = "mary";
//
//		char[] c1 = str1.toLowerCase().toCharArray();
//		char[] c2 = str2.toLowerCase().toCharArray();
//
//		Arrays.sort(c1);
//		Arrays.sort(c2);
//
//		System.out.println(Arrays.equals(c1, c2));

//		Properties p = new Properties();
//		//FileInputStream fis = new FileInputStream(System.setProperty("user.dir"+"//test.properties"));		
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test.properties");
//		p.load(fis);
//		System.out.println(p.getProperty("password"));
//		
//		System.out.println(p.entrySet());
//		
//		Iterator<Entry<Object, Object>> itr = p.entrySet().iterator();
//		
//		while(itr.hasNext()) {
//			
//			Entry<Object,Object> e =(Entry<Object,Object>)itr.next();
//			System.out.println(e.getKey()+"####"+e.getValue());
//		}
