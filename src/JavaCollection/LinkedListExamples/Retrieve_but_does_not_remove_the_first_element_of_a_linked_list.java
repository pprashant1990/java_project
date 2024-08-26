package JavaCollection.LinkedListExamples;

import java.util.LinkedList;

public class Retrieve_but_does_not_remove_the_first_element_of_a_linked_list {
	public static void main(String[] args) {
		// create an empty linked list
		LinkedList<String> c1 = new LinkedList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Black");
		c1.add("White");
		c1.add("Pink");
		System.out.println("Original linked list: " + c1);
		// Retrieve but does not remove, the first element of a linked list
		String x = c1.peekFirst();
		System.out.println("First element in the list: " + x);
		System.out.println("Original linked list: " + c1);
	}
}
