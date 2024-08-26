package Java8_Features_Lambda_Expression;

import java.util.Arrays;
import java.util.List;

public class SortingAListOfIntegersInAscendingOrder {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 2);
        numbers.sort((a, b) -> a - b);
        System.out.println("Sorted numbers: " + numbers);  //Sorted numbers: [1, 2, 3, 5, 8, 9]
        numbers.sort((a, b) -> b.compareTo(a));
        System.out.println("Sorted numbers: " + numbers); // Sorted numbers: [9, 8, 5, 3, 2, 1]
        numbers.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted numbers: " + numbers); //Sorted numbers: [1, 2, 3, 5, 8, 9]

	} 

}
