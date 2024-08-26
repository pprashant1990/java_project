package JavaCollection.TreeMapExamples;

import java.util.*;
import java.util.Map.Entry;  
public class Get_NavigableSet_view_of_the_keys_contained_in_a_map {  
         public static void main(String args[]) {

  // Create a tree map
  TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();

  // Put elements to the map 
  tree_map1.put(10, "Red");
  tree_map1.put(20, "Green");
  tree_map1.put(40, "Black");
  tree_map1.put(50, "White");
  tree_map1.put(60, "Pink");

  System.out.println("Orginal TreeMap content: " + tree_map1);
  System.out.println("Orginal TreeMap content: " + tree_map1.navigableKeySet());

 }
}
