package SDET_Programs;

import java.util.Scanner;

public class givesTwoOutput_abcde_ABCDE_for_the_InputString_Str_aBACbcEDed {
	public static void main(String[] args) {
		
		//Java program to gives two Output: “abcde”, “ABCDE” for the Input String Str = “aBACbcEDed”
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		System.out.println("Original String is: " + input);
		separateCharacters(input);
	}

	public static void separateCharacters(String input) {
		StringBuilder lowerCase = new StringBuilder();
		StringBuilder upperCase = new StringBuilder();
		for (char ch : input.toCharArray()) {
			if (Character.isLowerCase(ch)) {
				lowerCase.append(ch);
			} else {
				upperCase.append(ch);
			}
		}
		System.out.println("Output in lowercase: " + lowerCase);
		System.out.println("Output in uppercase " + upperCase);
	}
}
