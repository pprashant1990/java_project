package javaBasic;

/*Binary Search in Java
Binary search is used to search a key element from multiple elements. Binary search is faster than linear search.

In case of binary search, array elements must be in ascending order. If you have unsorted array, you can sort the array using Arrays.sort(arr) method.

Binary Search Example in Java
Let's see an example of binary search in java.*/

//Binary Search Example in Java
class BinarySearch {
	public static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}

	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int key = 30;
		int last = arr.length - 1;
		binarySearch(arr, 0, last, key);
	}
}

//Binary Search Example in Java using Recursion
class BinarySearchExample1 {
	public static int binarySearch(int arr[], int first, int last, int key) {
		if (last >= first) {
			int mid = first + (last - first) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				return binarySearch(arr, first, mid - 1, key);// search in left subarray
			} else {
				return binarySearch(arr, mid + 1, last, key);// search in right subarray
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int key = 30;
		int last = arr.length - 1;
		int result = binarySearch(arr, 0, last, key);
		if (result == -1)
			System.out.println("Element is not found!");
		else
			System.out.println("Element is found at index: " + result);
	}
}