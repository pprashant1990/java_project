package JavaCollection.HashMapExamples;

import java.util.*;  
public class Count_the_number_of_keyValue_$size$_mappings_in_a_map {  
   public static void main(String args[]){  
  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
  hash_map.put(1, "Red");
  hash_map.put(2, "Green");
  hash_map.put(3, "Black");
  hash_map.put(4, "White");
  hash_map.put(5, "Blue");
  System.out.println("Size of the hash map: "+hash_map.size());
 }
}
