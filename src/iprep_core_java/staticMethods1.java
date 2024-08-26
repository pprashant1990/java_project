package iprep_core_java;

class SM {
	       int i = 10;
	static int j = 20;

	static void m1() {
		System.out.println("SM-m1");
		
		//access the static member of the class from static method
		System.out.println(j);
		
		//create an object to access non static member of the class
		SM s = new SM();
		System.out.println(s.i);
	}

}

public class staticMethods1 {

	public static void main(String[] args) {

		SM s = new SM();
		s.m1();
		//SM s1 = new SM();
		//s1.m1();

	}

}
