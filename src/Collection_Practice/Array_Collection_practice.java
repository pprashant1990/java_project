package Collection_Practice;

class Student {

	void m1_student() {
		System.out.println("m1_student");
	}
	void m2_student() {
		System.out.println("m2_student");
	}
}

class Customer {

	void m1_Customer() {
		System.out.println("m1_Customer");
	}
	void m2_Customer() {
		System.out.println("m2_Customer");
	}
}

public class Array_Collection_practice { 
	public static void main(String args[]) {

		/*
		 * Student[] s = new Student[1000]; s[0] = new Student(); s[0].m1_student();
		 * s[1] = new Student(); s[1].m1_student();
		 */
		// System.out.println(s[0]+" Student Array "+s[1]);		
		
		/*
		 * Student s = new Student(); s.m1_student();
		 */
		
		Object[] o = new Object[1000];	
		o[0] = new Student();		
		o[1] = new Customer();
		
		((Student) o[0]).m1_student();
		((Student) o[0]).m2_student();
		
		((Customer)o[1]).m1_Customer();
		((Customer)o[1]).m2_Customer();
		
	}

}
