package Java8_Features_Lambda_Expression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class tryInterviewQueEPAM {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("a", "b", "a", "c", "a");
		List<Integer> lengths = words.stream().map(s -> s.length()).collect(Collectors.toList());
		System.out.println("Lengths of words: " + lengths);

	}

}
