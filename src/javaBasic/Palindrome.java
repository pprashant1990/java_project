package javaBasic;

/*Palindrome Program in Java
Palindrome number in java: A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.

Palindrome number algorithm
Get the number to check for palindrome
Hold the number in temporary variable
Reverse the number
Compare the temporary number with reversed number
If both numbers are same, print "Palindrome number"
Else print "not palindrome number"

Let's see the palindrome program in java. In this java program, we will get a number variable and check whether number is palindrome or not.*/

class PalindromeExample {
	public static void main(String args[]) {
		int r, sum = 0, temp;
		int n = 454;// It is the number variable to be checked for palindrome

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r; // Armstrong output formula
			n = n / 10; // number after division
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	}
}
