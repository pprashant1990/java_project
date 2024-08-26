package TestRostrum;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		//Anagram - if 2 strings are present with the same no. of charactors and same size
		// verify if they are Anagram or no
		//stop tops
		
		String str1 = "army";
		String str2 = "mary";
		
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Given strings are anagram");
		}else {
			System.out.println("Given strings are not anagram");
		}
		

	}

}
