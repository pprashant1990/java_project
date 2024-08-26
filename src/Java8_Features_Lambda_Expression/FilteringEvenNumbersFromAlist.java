package Java8_Features_Lambda_Expression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringEvenNumbersFromAlist {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers: " + evenNumbers); //Even numbers: [2, 4, 6, 8, 10]

	} 

}
