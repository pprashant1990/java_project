package SDET_Programs;

import java.util.ArrayList;

public class firstAndLastElementOfArraylist {
	public static void main(String[] args) {
		
		//Find first and last element of Arraylist

		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		arrayList.add("Date");
		arrayList.add("Elderberry");
		
		if (!arrayList.isEmpty()) {
			
			String firstElement = arrayList.get(0);
			String lastElement = arrayList.get(arrayList.size() - 1);
			
			System.out.println("First element: " + firstElement);
			System.out.println("Last element: " + lastElement);
		} else {
			System.out.println("The ArrayList is empty.");
		}
	}
}
