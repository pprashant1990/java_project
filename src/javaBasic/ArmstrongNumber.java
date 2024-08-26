package javaBasic;

/*Armstrong Number in Java
Armstrong Number in Java: Armstrong number is a number that is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc.

Let's try to understand why 153 , 371 is an Armstrong number.*/

class ArmstrongNumber {
	public static void main(String[] args) {
		int c = 0, a, temp;
		int n = 153;// It is the number to check Armstrong
		temp = n;
		while (n > 0) {
			System.out.println("###################################");
			a = n % 10;
			System.out.println("Remainder Of the number By 10 : " + a);
			n = n / 10;
			System.out.println("Division Of the number By 10 : " + n);
			c = c + (a * a * a);
			System.out.println("Armstrong Formula OutPut : " + c);
			System.out.println("###################################");
		}
		if (temp == c)
			System.out.println("It's a Armstrong number");
		else
			System.out.println("It's Not a Armstrong number");
	}
}