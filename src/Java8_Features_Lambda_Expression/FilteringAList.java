package Java8_Features_Lambda_Expression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringAList {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
		List<String> longNames = names.stream().filter( name -> name.length()>4).collect(Collectors.toList());
		System.out.println(longNames); // Output: [Alice, Charlie]

	}

}
