package JavaCollection.ArrayListExamples;

import java.util.*;
public class Iterate_through_all_elements_in_a_list {
public static void main(String[] args) {
// Creae a list and add some colors to the list
List<String> list_Strings = new ArrayList<String>();
list_Strings.add("Red");
list_Strings.add("Green");
list_Strings.add("Orange");
list_Strings.add("White");
list_Strings.add("Black");
// Print the list
for (String element : list_Strings) {
  System.out.println(element);
  }
}
}
