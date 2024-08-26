package JavaCollection.ArrayListExamples;

import java.util.*;

public class Extract_a_portion_of_a_list 
{
	public static void main(String[] args) 
	{
		// Create a list and add some colors to the list
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		System.out.println("Original list: " + list_Strings);

		List<String> sub_List = list_Strings.subList(0, 3);
		System.out.println("List of first three elements: " + sub_List);
	}
}
