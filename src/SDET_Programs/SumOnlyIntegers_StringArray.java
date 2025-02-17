package SDET_Programs;

public class SumOnlyIntegers_StringArray {
	public static void main(String[] args) {
		
		//Array consists of integers and special characters,sum only integers
		
		String[] array = { "5", "2", "9", "a", "1", "6", "#", "3" };
		int sum = sumIntegers(array);
		System.out.println("Sum of integers in the array: " + sum);
	}

	public static int sumIntegers(String[] array) {
		int sum = 0;
		for (String element : array) {
			try {
				int num = Integer.parseInt(element);
				sum += num;
			} catch (NumberFormatException e) {
// Ignore non-integer elements
			}
		}
		return sum;
	}
}
