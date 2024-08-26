package SDET_Programs;

import java.util.Scanner;

public class FibonacciSeries {

	// Java program to find Fibonacci series upto a given number range
	
	//The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones. It starts with 0 and 1, and then continues as follows: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of terms");
		
		int number = 6;
		int first = 0;
		int second = 1;
		int next;
		
		System.out.println("Fibonacci series is ");
		for (int i = 0; i <= number; i++) {
			
			next = second + first;
			first = second;
			second = next;
			
			System.out.println(first + "");
		}
	}
}