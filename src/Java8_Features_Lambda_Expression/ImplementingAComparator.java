package Java8_Features_Lambda_Expression;

import java.util.Comparator;
import java.util.TreeSet;

public class ImplementingAComparator {

	public static void main(String[] args) {
		
	//	Comparator<String> byLength = (s1, s2) -> s1.length() - s2.length(); // Sorts by string length
		
//		TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator());
//		t.add(1);
//		t.add(3);
//		t.add(5);
//		t.add(2);
//		
//		System.out.println(t);

		TreeSet<String> tstring = new TreeSet<String>(new MyComparatorString());
		tstring.add("A");
		tstring.add("C");
		tstring.add("H");
		tstring.add("B");
		
		System.out.println(tstring);
	}

}

//class MyComparator implements Comparator<Object>{
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		Integer i1 = (Integer)o1;
//		Integer i2 = (Integer)o2;
//		if(i1<i2)
//			return 1;
//		else if( i1>i2)
//			return -1;
//		else		
//		    return 0;
//	}	
//	

class MyComparatorString implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		
		String s1 = (String) o1;
		String s2 = (String) o2;
		return s1.compareTo(s2);

		
		   
	}		
	
}
