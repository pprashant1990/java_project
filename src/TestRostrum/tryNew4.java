package TestRostrum;

public class tryNew4 {

	public static void main(String[] args) {

		String str = "tomorrow";
		char CharReplace = 'o';

		String newstr = "";
		int count = 1;

		for (char c : str.toCharArray()) {

			if (c == CharReplace) {

				if (count == 2) {
					newstr = newstr + '$';
				} else {
					newstr = newstr + c;
				}

				count++;

			} 
			else {
				newstr = newstr + c;
			}

		}

		System.out.println(count);
		System.out.println(newstr);

	}

}
