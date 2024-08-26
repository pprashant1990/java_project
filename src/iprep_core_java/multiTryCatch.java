package iprep_core_java;

public class multiTryCatch {

	public static void main(String[] args) {
		
		try {
			throw new ArithmeticException("My ArithmeticException");
			// throw new NullPointerException("My NullPointerException");
			// throw new ClassCastException("My ClassCastException");
		}
		catch(ArithmeticException|NullPointerException|ClassCastException e) {
			e.printStackTrace();
			e.getMessage();
			e.getStackTrace();
		}

	}

}
