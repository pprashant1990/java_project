package StringPractice;

//import static org.testng.Assert.assertEquals;

import java.io.*;
import java.util.*;

import org.junit.Test;

//import org.testng.annotations.Test;

public class ReverseTheString {

	@Test
	public void m1() {
		// Reverse the string
		String str = "abcde  fghi  jk";
		System.out.println("String Value: " + str);
		System.out.println("String Lenght: " + str.length());
		char[] ch = str.toCharArray();
		System.out.println("char values: " + ch);
		System.out.println("char values Arrays.toString(ch) : " + Arrays.toString(ch));
		
		StringBuffer sb = new StringBuffer();
		for (int i = ch.length - 1; i >= 0; i--) {
			// System.out.print(ch[i]);
			// return sb.ch[i];
			sb.append(ch[i]);
		}
		System.out.println("char values:" + sb);
	}

	@Test
	public void m6() {
		// Reverse the string
		String str = "abcdefghijk";
		String reverse = "";
		System.out.println("String Lenght: " + str.length());

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);

		}
		System.out.print("m6() : " + reverse + "\n");
	}

	@Test
	public void m2() {
		// Reverse the string
		String string = "abcdef";
		String reverse = new StringBuffer(string).reverse().toString();
		System.out.println("\nString before reverse: " + string);
		System.out.println("String after reverse: " + reverse);
	}

	@Test
	public void m3() {
		// Print the Empty string
		String string = "";
		System.out.println("String value: " + string);

	}

	@Test
	public void m4() {
		// Split the words in the string
		// String s1 = "t u t o r i a l s";
		String s1 = "abc d e f";
		String[] words = s1.split("\\s");
		for (String w : words) {
			System.out.println("split: " + w);
		}
	}

	@Test
	public void m5() {
		// Replacing a String
		String str = "Hello World";
		System.out.println(str.replace('H', 'W'));
		System.out.println(str.replaceFirst("He", "Wa"));
		System.out.println(str.replaceAll("He", "Ha"));
	}

	@Test
	public void m7() {
		// Count Occurrences of a Char in a String

		String someString = "elephant";

		for (char c : someString.toCharArray()) {

			char someChar = c;
			/* char someChar1 = 'c'; */
			int count = 0;

			for (int i = 0; i < someString.length(); i++) {
				if (someString.charAt(i) == someChar /* && someString.charAt(i) == someChar1 */) {
					count++;
				}
			}
			System.out.println("No of occurance of char "+c+":" + count);
			// assertEquals(2, count);

		}
	}

	@Test
	public void m8() {

		String str = "hello-world!java";
		String[] parts = str.split("\\W+"); // Matches one or more non-word characters
		System.out.println(Arrays.toString(parts)); // Output: [hello, world, java]

	}

}