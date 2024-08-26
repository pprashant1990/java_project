package Java8_Features_Lambda_Expression;

import java.util.Arrays;
import java.util.List;

public class IteratingOverAListOfStringsAndPrintingEachElementInUppercase {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		//words.forEach(s -> System.out.println(s.toUpperCase()));
		words.forEach(w -> System.out.println(w.toUpperCase())); 
	}

}
