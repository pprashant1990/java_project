package wsdqwdqwd;

import java.util.Arrays;

public class minMax_approach2 {

	public static void main(String[] args) {
		
		int[] arr = {2, 3, 4, 5, 6, 7, 9};		
		Arrays.sort(arr);
		
		int Lowest = 0;
		int Highest = 2;
		
		System.out.println(arr[Lowest]+ " #### "+ arr[arr.length - Highest]);

	}

}
