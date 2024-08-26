package SDET_Programs;

import java.util.Scanner;

public class printEachLetterTwiceFromAGivenString {
	public static void main(String[] args) {
		
		//Java program to print each letter twice from a given string
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		String doubledString = doubleCharacters(input);
		System.out.println("Doubled characters: " + doubledString);
	}

	public static String doubleCharacters(String str) {
       //twice
		StringBuilder doubled = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			doubled.append(ch).append(ch); // Append each character
		}
		return doubled.toString();
	}
}