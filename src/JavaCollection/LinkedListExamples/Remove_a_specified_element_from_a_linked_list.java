package JavaCollection.LinkedListExamples;

import java.util.*;

public class Remove_a_specified_element_from_a_linked_list {
 public static void main(String[] args) {
  // create an empty linked list
  LinkedList <String> l_list = new LinkedList <String> ();
  // use add() method to add values in the linked list
  l_list.add("Red");
  l_list.add("Green");
  l_list.add("Black");
  l_list.add("Pink");
  l_list.add("orange");

  // print the list
  System.out.println("The Original linked list: " + l_list);

  // Remove the element in third position from the said linked list
  l_list.remove(2);
  System.out.println("The New linked list: " + l_list);
 }
}
