package SDET_Programs;

import java.util.Scanner;

public class swapTwoStringWithoutUsing3rdVariable {
	public static void main(String[] args) {
		
		//Java program to swap two string without using 3rd variable
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String str1 = scanner.nextLine();
		System.out.print("Enter second string: ");
		String str2 = scanner.nextLine();
		System.out.println("Before swapping: str1 = " + str1 + ", str2 = " + str2);
// Swapping without using a third variable
		str1 = str1 + str2; // Concatenate str1 and str2 and
//store in str1
		str2 = str1.substring(0, str1.length() - str2.length());
// Extract the initial part (original str1) from the concatenated
		String str = str1.substring(str2.length()); // Extract the remaining part (original str2) from the concatenated
													// string
		System.out.println("After swapping: str1 = " + str1 + ",str2 = " + str2);
	}
}