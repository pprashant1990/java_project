package SDET_Programs;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		//Java program to find Palindrome number
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome.");
		}
	}

	public static boolean isPalindrome(int num) {
		int originalNumber = num;
		int reversedNumber = 0;
		while (num != 0) {
			int digit = num % 10;
			reversedNumber = reversedNumber * 10 + digit;
			num = num / 10;
		}
		return originalNumber == reversedNumber;
	}
}
