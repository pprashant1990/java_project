package iprep_core_java;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class tryWithResources {

	public static void main(String[] args) {

		try {

			File f = new File("abc.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Connection conn = DriverManager.getConnection("", "", "");
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		int[] intArray = {1,2,0,3,0,4,5};
		String result = "";
		for (int i : intArray) {
			result += String.valueOf(i);
		}
		System.out.println(result);
		
		String[] s = {"5","3","4","9"};
		System.out.println(Arrays.toString(s));
//		Arrays.sort(s, Collections.reverseOrder());		
//		System.out.println(Arrays.toString(s));		
//		String s1 = Arrays.toString(s);
//		System.out.println(s1.length());
		//System.out.println(s.length);
		//System.out.println(s1.length());
		
		StringBuffer sb= new StringBuffer("123456");
		String r = new String(sb.reverse());
		System.out.println(r);
		
		String[] k = {"c","b","a"};
		List<String> l = Arrays.asList(k);
		Collections.sort(l);
		System.out.println(l);
		
		ArrayList<String> al = new ArrayList<String>();
		al.add(new String("a"));
		al.add("b");
		al.add("c");
		al.add(null);
		al.add(null);
		
		
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(l.containsAll(al));
		Collections.synchronizedList(al);
		
		TreeSet t = new TreeSet();
		t.add(90);
		t.add(24);
		t.add(26);
		t.add(28);
		System.out.println("Ascending order : "+t);
		
		
		TreeSet t1 = new TreeSet();
		t1.add(90);
		t1.add(24);
		t1.add(26);
		t1.add(28);
		System.out.println("Ascending order : "+t1);
		
		/*
		 * public class MyComparator extends Comparator{
		 * 
		 * }
		 */
		
	

	}
}
