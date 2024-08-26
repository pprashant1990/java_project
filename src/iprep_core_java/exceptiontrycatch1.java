package iprep_core_java;

public class exceptiontrycatch1 {

	public static void main(String[] args) {

		try {
			throw new ArithmeticException("My ArithmeticException");
			// throw new NullPointerException("My NullPointerException");
			// throw new ClassCastException("My ClassCastException");
		}

//		catch (NullPointerException e) {
//			System.out.println("inside NullPointerException");
//		}
//		catch (ClassCastException e) {
//			System.out.println("inside ClassCastException");
//		}

		//case 1:  it will be caught if we throw either of the above exception and wont go till Exception catch block
		// case 2: it will be caught by Exception catch block if defined first and other exceptions (if defined) will be unreachable
		catch (ArithmeticException e) {
			System.out.println("inside ArithmeticException catch block");
		} catch (Exception e) {
			System.out.println("inside Exception catch block");
		} finally {
			System.out.println("inside finally block");
		}

	}

}
