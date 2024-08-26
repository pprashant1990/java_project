package package1;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 12, 35, 1, 10, 34, 1 };
		int secondLargest = findSecondLargest(arr);
		System.out.println("The second largest number is: " + secondLargest);
	}

	public static int findSecondLargest(int[] arr) {
		if (arr == null || arr.length < 2) {
			throw new IllegalArgumentException("Array must contain at least two elements");
		}

		int first = Integer.MIN_VALUE;
		System.out.println(first);
		int second = Integer.MIN_VALUE;
		System.out.println(second);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				
				second = first;
				first = arr[i];
			
			} else if (arr[i] > second && arr[i] != first) {
				
				second = arr[i];
			}
		}

		if (second == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("No second largest element found");
		}

		return second;
	}
}
