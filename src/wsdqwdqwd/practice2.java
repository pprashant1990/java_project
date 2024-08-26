package wsdqwdqwd;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import junit.framework.Assert;

public class practice2 {

	public static void main(String[] args) {

		Integer[] syrArray = { 2, 3, 2, 3, 4, 5, 5, 2 };

		List<Integer> l = Arrays.asList(syrArray);
		LinkedList<Integer> al = new LinkedList<Integer>(l);
		Integer r = 2;

		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).equals(r)) {
				al.remove(i);
				//al.addLast(r);
				al.addFirst(r);
				
			}
		}
		System.out.println("al :" + al);
	}
}
