package JavaCollection.LinkedListExamples;

import java.util.*;
public class Clone_an_linked_list_to_another_linked_list {
 public static void main(String[] args) {
  // create an empty linked list
  LinkedList <String> c1 = new LinkedList <String> ();
            c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
          System.out.println("Original linked  list: " + c1);
           LinkedList <String> newc1 = new LinkedList <String> ();
                newc1 = (LinkedList)c1.clone();
          System.out.println("Cloned linked list: " + newc1);       
}
}
