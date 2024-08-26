package Java8_Features_Lambda_Expression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class TransformingAListOfIntegersBySquaringEachElement {

	@Test
	public void m1() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println("Squared numbers: " + squaredNumbers); 

	}
	@Test
	public void m2() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.forEach(number -> System.out.println(number * number)); // Square each element

	}
	@Test
	public void m3() {
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.forEach(number -> System.out.println(number * number)); // Square each element

	}
	//String str = "java is object oriented language";
	@Test
	public void occurance() {
		
		String str = "java is object oriented language";
		String[] split = str.split("\\s");
		List<String> words = Arrays.asList(split);
		words.forEach(w -> System.out.println("occurance : "+w.length())); // Square each element

	}

}
