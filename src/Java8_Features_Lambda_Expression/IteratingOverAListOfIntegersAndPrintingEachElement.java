package Java8_Features_Lambda_Expression;

import java.util.Arrays;
import java.util.List;

public class IteratingOverAListOfIntegersAndPrintingEachElement {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
       // numbers.forEach(n -> System.out.println(n));
		numbers.forEach(n -> System.out.println(n)); 

	}

}
