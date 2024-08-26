package iprep_core_java;


//constructor overloading
class B1 {

	B1() {
		this(10.0f);
		System.out.println("B1-cons");
		//this(10.0f);  -- compilation error
	}

	B1(int i) {
		System.out.println("B1-int-cons");
	}

	B1(float f) {
		System.out.println("B1-float-cons");
	}

	B1(double d) {
		System.out.println("B1-double-cons");
	}

}

public class thisConstructor {

	public static void main(String[] args) {

		B1 b1 = new B1();

	}

}
