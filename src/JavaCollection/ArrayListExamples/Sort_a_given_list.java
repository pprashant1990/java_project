package JavaCollection.ArrayListExamples;

import java.util.*;

public class Sort_a_given_list {
	public static void main(String[] args) throws Exception {

		String[] s = { "x", "y", "z" };
		//Arrays.sort(s);
		System.out.println(s.length);
		for (int i = 0; i < s.length; i++) {
			
			System.out.println(s[i]);
			
			ArrayList<String> al = new ArrayList<String>();
			al.add(s[i]);
			System.out.println(al);

		}
		//System.out.println(al);

		// Create a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();

		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");

		/*
		 * if (list_Strings.contains("Red")) {
		 * 
		 * try { System.out.println("List before sort: " + list_Strings);
		 * Collections.sort(list_Strings); System.out.println("List after sort: " +
		 * list_Strings); throw new Exception("try block exception"); } catch (Exception
		 * e) { throw new Exception("test exception"); } }
		 */

		System.out.println("List before sort: " + list_Strings);
		Collections.sort(list_Strings);
		System.out.println("List after sort: " + list_Strings);
		
		ArrayList<String> ad = new ArrayList<String>(list_Strings);
		System.out.println(ad);
		
		Collections.synchronizedList(list_Strings);
		System.out.println(list_Strings);

	}
}
