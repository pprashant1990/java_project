package SDET_Programs;

import java.util.Scanner;

public class reverseAString {
	public static void main(String[] args) {
		
		//Java program to reverse a string
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		char ch;
		String nstr = "";
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
			nstr = ch + nstr;
		}
		System.out.println("Reversed String is : " + nstr);
	}
}