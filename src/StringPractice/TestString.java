package StringPractice;

import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class TestString {

	@Ignore
	public void m1() {

		int[] intArray = { 2, 3, 5, 6, 6, 7, 4, 3, 3, 3, 3, 3, 4, 2, 2, 4, 4, 4 };
		String[] stringArray = convertToStringArray(intArray);
		System.out.println("String array: " + Arrays.toString(stringArray));

	}

	public static String[] convertToStringArray(int[] intArray) {

		if (intArray == null) {
			return null;
		}

		String[] stringArray = new String[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			stringArray[i] = String.valueOf(intArray[i]);
		}

		return stringArray;
	}
	
	@Ignore
	public void m2() {
		
		int[] intArray = { 2, 3, 5, 6, 6, 7, 4, 3, 3, 3, 3, 3, 4, 2, 2, 4, 4, 4 };		
		String[] strArray = new String[intArray.length];
		for(int i = 0 ; i < intArray.length ; i++) {
			
			strArray[i] = String.valueOf(intArray[i]);
			//strArray[i].toString();
			//System.out.println(strArray[i].toString());
		}
		System.out.println(Arrays.toString(strArray));
		System.out.println(strArray[0]);			
		
		
	}
	
	@Test
	public void m3() {
		String input = "abdef";
		String allLetters = "abcdefghijklmnopqrstuvwxyz";
		String output ="";
		
		for(String s : allLetters.split("")) {
			
			if(!input.contains(s)) {
				output = output + s;
			}
			
		}
		
		System.out.println(output);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
