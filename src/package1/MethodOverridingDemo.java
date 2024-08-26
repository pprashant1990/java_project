package package1;

class Loan {
	float getIR() {
		return 5.0f;
	}

}

class GoldLoan extends Loan {
	float getIR() {
		return 7.5f;
	}
}

class StudyLoan extends Loan {
	float getIR() {
		return 12.0f;
	}
}

class CraftLoan extends Loan {
	/*
	 * float getIR() { return 12.0f; }
	 */
}

public class MethodOverridingDemo {

	public static void main(String[] args) {

		// super class
		Loan l = new Loan();
		// System.out.println("Loan: "+l.getIR());

		// sub class
		l = new GoldLoan();
		System.out.println("GoldLoan: " + l.getIR());

		l = new StudyLoan();
		System.out.println("StudyLoan: " + l.getIR());

		l = new CraftLoan();
		System.out.println("CraftLoan: " + l.getIR());

	}

}
