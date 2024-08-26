package iprep_core_java;

import java.util.Arrays;

import org.junit.Test;

public class wrapper {

	// premitive type --> wrapper type (object)

	@Test
	public void Using_parameterized_constructor_from_wrapper_class() {
		int i = 10;
		Integer in = new Integer(i);
		System.out.println(i + "   " + in);
	}

	@Test
	public void Using_valueOf_method() {
		int i = 10;
		Integer in = Integer.valueOf(i);
		System.out.println(i + "   " + in);
	}

	@Test
	public void Using_autoBoxing() {
		int i = 10;
		Integer in = i;
		System.out.println(i + "   " + in);
	}

	// wrapper type (object) --> premitive type

	@Test
	public void Using_xxxvalueOf() {
		Integer in = new Integer(10);
		int i = in.valueOf(in);
		System.out.println(i + "   " + in);
	}

	@Test
	public void Using_autoUnboxing() {
		Integer in = new Integer(10);
		int i = in;
		System.out.println(i + "   " + in);
	}

	// String type --> object type
	@Test
	public void Using_string_parameterized_constructor_from_wrapper_class() {
		String data = "10";
		Integer in = new Integer(data);
		System.out.println(data + "   " + in);
	}

	@Test
	public void Using_valueOf() {
		String data = "10";
		Integer in = Integer.valueOf(data);
		System.out.println(data + "   " + in);
	}

	// Object type to string type
	@Test
	public void Using_toString() {
		Integer in = new Integer(10);
		String data = in.toString();
		System.out.println(data + "   " + in);
	}

	@Test
	public void Using_concatination_operator() {
		Integer in = new Integer(10);
		String data = "" + in;
		System.out.println(data + "   " + in);
	}

	// Premitive type --> string type
	@Test
	public void Using_toString_method() {
		int i = 10;
		String data = Integer.toString(i);
		System.out.println(data + "   " + i);
	}

	@Test
	public void Using_concatination() {
		int i = 10;
		String data = "" + i;
		System.out.println(data + "   " + i);
	}

	// string --> premitive
	@Test
	public void Using_parseXXX() {
		String data = "10";
		int i = Integer.parseInt(data);
		System.out.println(data + "   " + i);
	}

	//rachit mongia
	
	@Test
	public void check() {
		String[] data = {"10","28"};
		//int[] i = String.valueOf(data);
		//Integer in = new Integer(data);
		//System.out.println(data + "   " + i);
	}
}
