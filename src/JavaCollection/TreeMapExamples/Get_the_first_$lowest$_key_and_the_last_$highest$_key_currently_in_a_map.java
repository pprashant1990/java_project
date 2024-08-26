package JavaCollection.TreeMapExamples;

import java.util.*;
import java.util.Map.Entry;  
public class Get_the_first_$lowest$_key_and_the_last_$highest$_key_currently_in_a_map {  
     public static void main(String args[]) {

  // Create a tree map
  TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();

  // Put elements to the map 
  tree_map1.put("C2", "Red");
  tree_map1.put("C1", "Green");
  tree_map1.put("C4", "Black");
  tree_map1.put("C3", "White");

  System.out.println("Orginal TreeMap content: " + tree_map1);
  System.out.println("Greatest key: " + tree_map1.firstKey());
  System.out.println("Least key: " + tree_map1.lastKey());
 }
}
