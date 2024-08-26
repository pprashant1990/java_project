package iprep_core_java;

class K {

	void m1() throws Exception {
		
		m2();
	}

	void m2() throws RuntimeException {

		throw new RuntimeException("my runtime exception");

	}
}

public class exception_throw {

	public static void main(String[] args) throws Exception {

		K k = new K();
		k.m1();
	}

}
