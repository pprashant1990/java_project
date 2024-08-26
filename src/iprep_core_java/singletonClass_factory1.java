package iprep_core_java;

class X {

	static X x = null;
	private X() {
	}
	static X getRef() {
		if (x == null) {
			x = new X();
		}
		return x;
	}
}

public class singletonClass_factory1 {

	public static void main(String[] args) {

		System.out.println(X.getRef());
		System.out.println(X.getRef());
		System.out.println(X.getRef());
		System.out.println(X.getRef() instanceof X);
		
	}

}
