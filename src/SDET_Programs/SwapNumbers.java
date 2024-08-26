package SDET_Programs;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {

       //Java program to swap two numbers without using third variable
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = 5;
		System.out.print("Enter the second number: ");
		int b = 10;
		System.out.println("Before swapping: a = " + a + ", b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping: a = " + a + ", b = " + b);
	}
}