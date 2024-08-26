package JavaCollection.TreeMapExamples;

import java.util.*;  
public class Associate_the_specified_value_with_the_specified_key_in_a_TreeMap {  
  public static void main(String args[]){  
   // Create a tree map
   TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();      
  // Put elements to the map 
  tree_map.put(1, "Red");
  tree_map.put(2, "Green");
  tree_map.put(3, "Black");
  tree_map.put(4, "White");
  tree_map.put(5, "Blue");
    
   for (Map.Entry<Integer,String> entry : tree_map.entrySet())
   {
    System.out.println(entry.getKey() + "=>" + entry.getValue());
   }
 }  
}
