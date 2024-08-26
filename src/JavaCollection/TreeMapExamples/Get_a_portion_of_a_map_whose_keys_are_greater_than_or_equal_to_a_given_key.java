package JavaCollection.TreeMapExamples;

import java.util.*;
import java.util.Map.Entry;  
public class Get_a_portion_of_a_map_whose_keys_are_greater_than_or_equal_to_a_given_key {  
           public static void main(String args[]) {

  // Declare tree maps
  TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();

  // Put elements to the map 
  tree_map.put(10, "Red");
  tree_map.put(20, "Green");
  tree_map.put(30, "Black");
  tree_map.put(40, "White");
  tree_map.put(50, "Pink");
  System.out.println("Orginal TreeMap content: " + tree_map);
  System.out.println("Keys are greater than or equal to 20: " + tree_map.tailMap(20));
 }
}
