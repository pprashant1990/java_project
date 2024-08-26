package TestRostrum;

import java.util.HashSet;
import java.util.Set;

public class tryNew5 {

	public static void main(String[] args) {

		// find the 2nd highest

		int[] b = { 1, 2, 3, 4, 3, 5, 5, 6, 6 };
		
		Set<Integer> s = new HashSet<Integer>();
		
		for(int c : b) {
			s.add(c);
		}
		
		int[] a = new int[s.size()]; 
		
		int k = 0;
		for(int d : s) {
			a[k] = d;
			k++;
		}
		

		int largest = largestNum(a);
		System.out.println(largest);

	}

	public static int largestNum(int[] a) {
		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
		//return a[a.length - 4];
		return a[3];
	}
}
