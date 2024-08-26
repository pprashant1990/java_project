package Java8_Features_Lambda_Expression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringStringsWithLengthGreaterThan3 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "bat", "cat", "dog", "elephant");
		List<String> longWords = words.stream().filter(s -> s.length() > 3).collect(Collectors.toList());
		System.out.println("Long words: " + longWords); //Long words: [apple, elephant]

	}

}
