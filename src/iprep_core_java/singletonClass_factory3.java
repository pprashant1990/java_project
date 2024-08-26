package iprep_core_java;

class Z{
	
	static Z z = new Z();
	private Z() {
		
	}	
	static Z getRef(){		
		return z;
	}
	
}

public class singletonClass_factory3 {

	public static void main(String[] args) {
		System.out.println(Z.getRef());
		System.out.println(Z.getRef());
		System.out.println(Z.getRef());
		
	}

}
