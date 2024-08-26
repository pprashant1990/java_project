package JavaCollection.ArrayListExamples;

import java.util.*;

public class Remove_the_third_element_from_a_list {
	public static void main(String[] args) {
		// Create a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		// Print the list
		System.out.println(list_Strings);
		// Remove the third element from the list.
		list_Strings.remove(2);
		// Print the list again
		System.out.println("After removing third element from the list:\n"+ list_Strings);
	}
}
