package JavaCollection.ArrayListExamples;

import java.util.ArrayList;
import java.util.Collections;

public class Join_two_array_lists {
	public static void main(String[] args) {
		
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		c1.add("");
		c1.add("");
		System.out.println(c1.get(1));
		System.out.println("List of first array: " + c1);

		ArrayList<String> c2 = new ArrayList<String>();
		c2.add("Red");
		c2.add("Green");
		c2.add("Black");
		c2.add("Pink");
		c2.add("");
		c2.add("");
		System.out.println("List of second array: " + c2);

		// Let join above two list
		ArrayList<String> a = new ArrayList<String>();
		a.addAll(c1);
		a.addAll(c2);
		System.out.println("New Array List: " + a);
		Collections.sort(a);
		System.out.println("New sorted Array List"+ a);
	    
		
		System.out.println(a.size());
		//System.out.println(a.toArray());
		
	}
}
