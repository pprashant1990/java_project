package StringPractice;

import java.util.Arrays;
import java.util.Collections;

;

public class TescoInterview {

	public static void main(String[] args) {

		char[] cs = { 'd', 'd', 'e', 'f', 'f', 's' };
		// System.out.println(Arrays.toString(cs));
		String sa = Arrays.toString(cs);
		String sa1 = new String(cs);
		System.out.println(sa1);

		int[] i = { 2, 3, 2, 1, 3 };
		Arrays.sort(i);
		System.out.println("Ascending order : " + Arrays.toString(i));

		// for arranging int arrays in descending order
		Integer[] j = { 2, 3, 2, 1, 3 };
		// for arranging int arrays in descending order
		Arrays.sort(j, Collections.reverseOrder());
		System.out.println("Descending order : " + Arrays.toString(j));

		String[] sf = { "as", "sd", "wdw", "wddw", "wdw" };
		System.out.println(Arrays.toString(sf));
		Arrays.sort(sf, Collections.reverseOrder());
		System.out.println(Arrays.toString(sf));

	}

}
