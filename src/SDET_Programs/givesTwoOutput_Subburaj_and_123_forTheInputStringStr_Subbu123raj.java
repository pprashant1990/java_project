package SDET_Programs;

import java.util.Scanner;

public class givesTwoOutput_Subburaj_and_123_forTheInputStringStr_Subbu123raj {
	public static void main(String[] args) {
		 
		//Java program to gives two Output: “Subburaj”, “123” for the Input String Str = “Subbu123raj”
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		System.out.println("Original String is: " + input);
		separateAplhaAndNumeric(input);
	}

	public static void separateAplhaAndNumeric(String input) {
		StringBuilder alphaPart = new StringBuilder();
		StringBuilder numericPart = new StringBuilder();
		for (char ch : input.toCharArray()) {
			if (Character.isLetter(ch)) {
				alphaPart.append(ch);
			} else if (Character.isDigit(ch)) {
				numericPart.append(ch);
			}
		}
		System.out.println("Output in Alpha: " + alphaPart.toString());
		System.out.println("Output in Numeric: " + numericPart.toString());
	}
}