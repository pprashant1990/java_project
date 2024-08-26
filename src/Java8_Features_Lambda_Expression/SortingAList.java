package Java8_Features_Lambda_Expression;

import java.util.Arrays;
import java.util.List;

public class SortingAList {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(3, 1, 4, 1, 5, 9);
		numbers.sort((a, b) -> a - b); // Sort in ascending order based on difference
		System.out.println("Ascending order : "+numbers); // Ascending order : [1, 1, 3, 4, 5, 9] 
		/*
		 * List<Integer> s = numbers; System.out.println(s);
		 */
		numbers.sort((a, b) -> b - a); // Sort in ascending order based on difference
		System.out.println("Descending order : "+numbers); // Descending order : [9, 5, 4, 3, 1, 1]

	}

}
