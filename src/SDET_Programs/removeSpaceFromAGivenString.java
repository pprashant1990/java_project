package SDET_Programs;

import java.util.Scanner;

public class removeSpaceFromAGivenString {
	public static void main(String[] args) {
		
		// Java program to remove space from a given string
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string with spaces: ");
		String input = scanner.nextLine();
		String stringWithoutSpaces = removeSpaces(input);
		System.out.println("String without spaces: " + stringWithoutSpaces);
	}

	public static String removeSpaces(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				result.append(str.charAt(i));
			}
		}
		return result.toString();
	}
}