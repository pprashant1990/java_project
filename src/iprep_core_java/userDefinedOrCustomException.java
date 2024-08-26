package iprep_core_java;

class MyCustomException extends Exception {

	MyCustomException(String custom) {
		super(custom);
	}
}

public class userDefinedOrCustomException {

	public static void main(String[] args) {

		try {
			throw new MyCustomException("my custom exception");
		} catch (MyCustomException e) {
			e.printStackTrace();
			//e.getMessage();
			System.out.println("MyCustomException is caught");
		}

	}

}
