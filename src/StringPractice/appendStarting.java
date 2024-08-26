package StringPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class appendStarting {

	public static void main(String[] args) {

		String str = "kdodowdkwkdkwd";
		System.out.println("Actual str : "+str);
		String[] syrArray = str.split("");
		System.out.println(Arrays.toString(syrArray));
		
		List<String> l = Arrays.asList(syrArray);
		ArrayList<String> al = new ArrayList<String>(l);
		String r = "k";

		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).equals(r)) {
				//System.out.println("Remove "+r+" in the string : "+al.remove(i));
				al.remove(i);
				//System.out.println("Remove "+r+" in the end of tha string : "+al.remove(i));
				//System.out.println("Add "+r+" in the end of tha string : "+al.remove(i));
				//al.addFirst(r);
				al.addLast(r);
			}
		}; 
		System.out.println("al :"+al);
		StringBuilder sb = new StringBuilder();
		for (String s : al) {
			sb.append(s);
		}
		System.out.println("New String : "+sb.toString());    //kkkkdodowdwdwd 	al.addFirst(r);
	}

}
