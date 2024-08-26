package SDET_Programs;

public class calculateSumOfDigitsOfANumber {
	
	//Java program to calculate the sum of digits of a number
	
	public static void main(String[] args) {
		int number = 12345;
		int sumOfDigits = calculateSumOfDigits(number);
		System.out.println("Sum of digits of " + number + " is: " + sumOfDigits);
	}

	public static int calculateSumOfDigits(int number) {
		int sum = 0;
		while (number > 0) {
			int digit = number % 10; // Extract the last digit
			System.out.println("Extract the last digit : "+digit);
			sum = sum + digit; // Add the digit to sum
			System.out.println("Add the digit to sum : "+sum);
			number = number / 10; // Remove the last digit from number
			System.out.println("Remove the last digit from number : "+number);
		}
		return sum;
	}
}
