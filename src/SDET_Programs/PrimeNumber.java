package SDET_Programs;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		// Java program to find Prime number

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter a number: ");
//		int number = scanner.nextInt();
		int[] numbers = { 10, 24, 36, 8, 17, 3 ,5};
		
		int j = 3;
		int k = 25/2;
		int l = 25%2;
		System.out.println(k+"####"+l);

		for (int number : numbers) {

			if (isPrime(number)) {
				System.out.println(number + " is a prime number.");
			} else {
				System.out.println(number + " is not a prime number.");
			}
		}
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			// try each number by using %
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}