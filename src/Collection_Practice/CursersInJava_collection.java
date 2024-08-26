package Collection_Practice;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

class CursersInJava_enumeration {
	void enumeration() {
		Vector<Integer> c1 = new Vector<Integer>();
		for (int k = 0; k < 10; k++) {
			c1.addElement(k);
		}
		/*
		 * c1.addElement(1); c1.addElement(2); c1.addElement(3); c1.addElement(4);
		 * c1.addElement(5);
		 */
		System.out.println("Original Vector list: " + c1);

		Enumeration e = c1.elements();
		while (e.hasMoreElements()) {
			int j = (int) e.nextElement();
			// System.out.println(j);
			if (j % 2 == 0) {
				System.out.println(j);
			}
		}

		/*
		 * while (e.hasMoreElements()) { Integer i = (Integer) e.nextElement(); if (i %
		 * 2 == 0) { System.out.println(i); }
		 */
		System.out.println(c1);
	}

	void iterator() {

		ArrayList a = new ArrayList();
		for (int i = 0; i <= 10; i++) {
			a.add(i);
		}
		System.out.println(a);

		Iterator itr = a.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if (i % 2 == 0) {
				// System.out.println(i);
			} else {
				itr.remove();
			}
			System.out.println(i);
			
		}
	}

	void ListIterator() {

		LinkedList l = new LinkedList();
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		System.out.println(l);

		java.util.ListIterator itr = l.listIterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			if (s.equals("chiru")) {
				itr.remove();
			}
			if (s.equals("venki")) {
				itr.set("charan");
			}
			if (s.equals("nag")) {
				itr.add("chitu");
			}

		}
		System.out.println(l);

	}

}

public class CursersInJava_collection {
	public static void main(String[] args) {

		CursersInJava_enumeration e = new CursersInJava_enumeration();
		System.out.println(e.hashCode());
		// e.enumeration();
		// e.iterator();
		e.ListIterator();
	}
}
