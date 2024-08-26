package wsdqwdqwd;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import junit.framework.Assert;

public class practice3 {

	public static void main(String[] args) {

		String str = "good_morning__india";

		String newStr21 = str.substring(0, 4); // good
		String newStr2 = str.substring(str.indexOf('d') + 1); // _morning__india

		String newStr3 = "";

		int count = 1;
		for (char c : newStr2.toCharArray()) {
			if (c == '_') {

				if (count > 1) {
					newStr3 = newStr3 + '$';
				} else {
					newStr3 = newStr3 + c;
				}
				count++;

			} else {
				newStr3 = newStr3 + c;
			}
		}
		
		String newStr4 = newStr21 + newStr3;
		System.out.println(newStr4);

	}
}