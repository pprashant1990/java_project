package TestRostrum;

import java.util.Arrays;

import org.testng.annotations.Test;

public class countCharacterOccurance {

	@Test(enabled = false)
	public void countCharacterOccurance_method1() {

		// count of occurrence of a
		String str = "java is object oriented language";
		char searchChar = 'o';
		int countCharacter = countCharacter(str, searchChar);
		System.out.println("countCharacter : " + countCharacter);

	}

	private static int countCharacter(String str, char searchChar) {
		int count = 0;
		str = str.toLowerCase();
		for (char c : str.toCharArray()) {
			if (c == searchChar) {
				count++;
			}

		}
		return count;

	}

	@Test(enabled = true)
	public void countCharacterOccurance_method2() {

		String str1 = "java is object oriented language";
		System.out.println("countCharacterOccurance_method2 string : " + str1.length());
		int occur = str1.length() - str1.replaceAll("a", "").length();
		System.out.println(occur);
	}

	@Test(enabled = false)
	public void countCharacterOccurance_method3() {

		String str1 = "java is object oriented language";
		String[] strArray = {"a","e","i","g"};
		int count = 0;
		for(String s : strArray) {
			int i = str1.length()-str1.replaceAll(s, " ").length();
			System.out.println(i);
			count++;
		}		
		//System.out.println(i);
	}
	
	

}
