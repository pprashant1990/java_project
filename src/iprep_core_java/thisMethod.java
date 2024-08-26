package iprep_core_java;

class B2{
	
	void m1(){
		System.out.println("B2-m1");
		this.m2();
	}
	void m2() {
		System.out.println("B2-m2");
	}
	
}


public class thisMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B2 b2 = new B2();
		System.out.println(b2);
		B2 b3 = new B2();
		System.out.println(b3);
		//b2.m1();
	}

}
