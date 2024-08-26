package SDET_Programs;

import java.util.Scanner;

public class findIfAStringIsPalindrome {

	// Java program to find if a string is Palindrome

	public static void main(String[] args) {
		String input = "Radar"; // Example input
		input = input.toLowerCase(); // Convert to lowercase for case-insensitivity
		boolean isPalin = isPalindrome(input);
		if (isPalin) {
			System.out.println(input + " is a palindrome!");
		} else {
			System.out.println(input + " is not a palindrome.");
		}
	}

	public static boolean isPalindrome(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		return str.equals(reversed);
	}
}
