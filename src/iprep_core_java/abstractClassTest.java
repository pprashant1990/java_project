package iprep_core_java;

abstract class A {

	void m1() {
		System.out.println("m1-A");
	}

	void m2() {
		System.out.println("m2-A");
	}

	void m3() {
		System.out.println("m3-A");
	}

}

class B extends A {
	void m1() {
		System.out.println("m1-B");
		super.m1();
		this.m2();
		m2();
	}

	void m2() {
		System.out.println("m2-B");
	}
	void m4() {
		System.out.println("m4-B");
	}
}

//@FunctionalInterface    -- its a java 8 feature. if any interface contains only one abstract method than that interface can be marked as FunctionalInterface
interface I1 {
	void m1();
}

// default method in interface from java 8 onwards
interface I2 {
	void m1();

	default void m2() {
		System.out.println("this is a default method of the interface");
	}

	static void m3() {

	}
}

public class abstractClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("we are inside main method");
		/*
		 * A a = new A(); a.m1(); B b = new B(); b.m1();
		 */
		/*
		 * A a = new B(); a.m1(); a.m2();
		 */

		//B b = new B();
		//b.m1();
		
		A a = new B();
		a.m1();
		
		//B b = new B();
		
		// b.m2();
		// b.m3();
		System.out.println("we are Outside of main method");

	}

}
