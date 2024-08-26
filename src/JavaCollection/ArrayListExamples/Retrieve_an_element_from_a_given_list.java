package JavaCollection.ArrayListExamples;

import java.util.*;
public class Retrieve_an_element_from_a_given_list {
public static void main(String[] args) {
	// Creae a list and add some colors to the list
	List<String> list_Strings = new ArrayList<String>();
	list_Strings.add("Red");
	list_Strings.add("Green");
	list_Strings.add("Orange");
	list_Strings.add("White");
	list_Strings.add("Black");
	// Print the list
	System.out.println(list_Strings);
	
	//iterate through index
	int i=0;
	for(String s : list_Strings)
	{
		System.out.println(list_Strings.get(i));
		i++;
	}
	
	//iterate through iterator
	Iterator ir = list_Strings.iterator();
	while(ir.hasNext())
	{
		System.out.println("Iterator: " +ir.next());
	}
	
	// Retrive the first and third element
	String element = list_Strings.get(0);
	System.out.println("First element: "+element);
	element = list_Strings.get(2);
	System.out.println("Third element: "+element);
	}
}
