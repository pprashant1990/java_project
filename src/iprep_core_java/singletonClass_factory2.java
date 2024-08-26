package iprep_core_java;

class Y {

	static Y y = null;
	static {
		y = new Y();
	}
	static Y getRef() {
		return y;
	}
}

public class singletonClass_factory2 {
	
	public static void main(String[] args) {		
		System.out.println(Y.getRef());
		System.out.println(Y.getRef());
		System.out.println(Y.getRef());
	}

}
