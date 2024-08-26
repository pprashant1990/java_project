package Java8_Features_Lambda_Expression;

import java.util.Arrays;
import java.util.List;

public class IteratingOverAList {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.forEach(number -> System.out.println(number * 2)); // Doubles each element 
		//numbers.forEach(number -> System.out.println(number)); // Doubles each element  

	}

}
