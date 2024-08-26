package iprep_core_java;

class M {

	private M() {

	}

	void m1() {
		System.out.println("m1-M");
	}

	static M getRef() {
		M m = new M();
		return m;
	}

}

public class factoryMethod1 {

	public static void main(String[] args) {

		M m = M.getRef();
		System.out.println(m.getRef());// any static method returning same class object then that static method is static factory method.
		//System.out.println(m);
		//m.m1();
		M m1 = M.getRef();
		System.out.println(m1.getRef());

	}

}
