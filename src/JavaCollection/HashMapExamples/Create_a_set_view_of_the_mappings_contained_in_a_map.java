package JavaCollection.HashMapExamples;

import java.util.*;  
public class Create_a_set_view_of_the_mappings_contained_in_a_map {  
    public static void main(String args[]) {
  HashMap < Integer, String > hash_map = new HashMap < Integer, String > ();
  hash_map.put(1, "Red");
  hash_map.put(2, "Green");
  hash_map.put(3, "Black");
  hash_map.put(4, "White");
  hash_map.put(5, "Blue");
  // create set view for the map
  Set set = hash_map.entrySet();
  // check set values
  System.out.println("Set values: " + set);
 }
}
