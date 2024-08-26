package JavaCollection.ArrayListExamples;

import java.util.*;
public class Insert_an_element_into_the_list_at_the_first_position {
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
	
	// Now insert a color at the first and last position of the list
	list_Strings.add(0, "Pink");
	list_Strings.add(5, "Yellow");
	
	// Print the list
	System.out.println(list_Strings);
	}
}
