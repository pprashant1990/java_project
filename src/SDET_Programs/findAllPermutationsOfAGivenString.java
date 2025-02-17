package SDET_Programs;

import java.util.Scanner;

public class findAllPermutationsOfAGivenString {
	
	//Java program to find all permutations of a given string
	
	public static void main(String[] args) {
		String str = "abc"; 
		permute(str, "");
	}

	static void permute(String str, String prefix) {
		if (str.length() == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < str.length(); i++) {
				String rem = str.substring(0, i) + str.substring(i + 1);
				permute(rem, prefix + str.charAt(i));
			}
		}
	}
}
