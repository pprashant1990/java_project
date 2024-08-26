package iprep_core_java;

public class exception_throw1 {

	public static void main(String[] args) throws Exception {

		int i = 200;

		if (i < 500 || i > 100) {
			System.out.println("inside if block");
			throw new ArithmeticException("Invalid number");
			//System.out.println("exit if block");
		} else {
			System.out.println("inside else block");
			System.out.println("Invalid number");
		}

	}

}
