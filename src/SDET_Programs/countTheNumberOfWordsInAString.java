package SDET_Programs;

import java.util.Scanner;

public class countTheNumberOfWordsInAString {
	public static void main(String[] args) {
		
		//Java program to count the number of words in a string
		
		
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of words in a string: " + count);
	}
}
