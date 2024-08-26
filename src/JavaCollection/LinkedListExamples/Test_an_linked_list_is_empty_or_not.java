package JavaCollection.LinkedListExamples;

import java.util.LinkedList;
import java.util.Vector;
import java.util.Collections;

public class Test_an_linked_list_is_empty_or_not {
	public static void main(String[] args) {
		LinkedList<String> c1 = new LinkedList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Original linked list: " + c1);
		System.out.println("Check the above linked list is empty or not! " + c1.isEmpty());
		c1.removeAll(c1);
		System.out.println("Linked list after remove all elements " + c1);
		System.out.println("Check the above linked list is empty or not! " + c1.isEmpty());
	
		System.out.println("###################################################################");
		
		Vector<String> v = new Vector<String>();
		v.add("Red");
		v.add("Green");
		v.add("Black");
		v.add("White");
		v.add("Pink");
		System.out.println("Original linked list: " + v);
		System.out.println("Check the above linked list is empty or not! " + v.isEmpty());
		c1.removeAll(c1);
		System.out.println("Linked list after remove all elements " + c1);
		System.out.println("Check the above linked list is empty or not! " + v.isEmpty());
	}
}
