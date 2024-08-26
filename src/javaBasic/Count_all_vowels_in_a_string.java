package javaBasic;

import java.util.Scanner;

public class Count_all_vowels_in_a_string {
	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// System.out.print("Input the string: ");
		// String str = in.nextLine();
		String str = "xaaaxxxx";

		System.out.print("Number of  Vowels in the string: " + count_Vowels(str));
	}

	public static int count_Vowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
				System.out.print("Count : " + count + "\n");
			}
		}
		return count;
	}
}
