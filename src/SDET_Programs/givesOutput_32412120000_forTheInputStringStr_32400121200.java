package SDET_Programs;

public class givesOutput_32412120000_forTheInputStringStr_32400121200 {
	public static void main(String[] args) {
		
		//Java program to gives Output:“32412120000” for the Input  String Str = “32400121200”
		
		
		String input = "32400121200";
		System.out.println("input: " + input);
		String output = rearrangeDigits(input);
		System.out.println("Output: " + output);
	}

	public static String rearrangeDigits(String input) {
// Split the input into parts: digits and non-digits
		StringBuilder digits = new StringBuilder();
		StringBuilder nonDigits = new StringBuilder();
		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {
				digits.append(c);
			} else {
				nonDigits.append(c);
			}
		}
// Concatenate non-digits followed by digits
		return digits.toString() + nonDigits.toString();
	}
}
