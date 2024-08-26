package Java8_Features_Lambda_Expression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformingAListOfStringsToTheirLengths {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<Integer> lengths = words.stream().map(s -> s.length())
                                     .collect(Collectors.toList());
        System.out.println("Lengths of words: " + lengths);

	} 

}
