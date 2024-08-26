package SDET_Programs;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		
		//Java program to Find Factorial on given Number
		
		int factorial = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number ");
		int number = 5;
		for (int i = 1; i <= number; i++) { 
			factorial = factorial * i;
		}
		System.out.println("Factorial number is :" + factorial);
	}
}
