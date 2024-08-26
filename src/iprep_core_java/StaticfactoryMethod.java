package iprep_core_java;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class StaticfactoryMethod {

	public static void main(String[] args) throws Exception {
		
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf);
		System.out.println(nf instanceof NumberFormat);
		System.out.println(nf instanceof Object);
		
		
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df);
		System.out.println(df instanceof DateFormat);
		
		//Class c = Class.forName("N");	
		//Object o = c.newInstance();
		//System.out.println(o);
		
		ArrayList al = new ArrayList();
		System.out.println(al instanceof ArrayList);
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof RandomAccess);
		
		LinkedList ll = new LinkedList();
		System.out.println(ll instanceof LinkedList);
		System.out.println(ll instanceof Serializable);
		System.out.println(ll instanceof RandomAccess);
		//System.out.println(ll instanceof Clonable);
		
		Class c = Class.forName("N");
		Object o = c.newInstance();
	}

}
class N{
	
}
