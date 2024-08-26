package Java8_Features_Lambda_Expression;

import java.util.Arrays;
import java.util.List;

public class SortingAlistOfStringsInReverseAlphabeticalOrder {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        words.sort((a, b) -> b.compareTo(a));
        System.out.println("Reverse sorted words: " + words);

	} 

}
