package StringPractice;

public class Trim_any_leading_or_trailing_whitespace_from_a_given_string {

	public static void main(String[] args) {
		String str = " Java Exercises ";

		// Trim the whitespace from the front and back of the
		// String.
		String new_str = str.trim();

		// Display the strings for comparison.
		System.out.println("Original String: " + str);
		System.out.println("New String: " + new_str);
	}
}
