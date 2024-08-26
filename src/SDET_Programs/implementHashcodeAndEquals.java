package SDET_Programs;

import java.util.Objects;

public class implementHashcodeAndEquals {
	private int id;
	private String name;

// Constructor
	public implementHashcodeAndEquals(int id, String name) {
		this.id = id;
		this.name = name;
	}

// Getters and setters (omitted for brevity)
// hashCode method
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

// equals method
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		implementHashcodeAndEquals student = (implementHashcodeAndEquals) obj;
		return id == student.id && Objects.equals(name, student.name);
	}

	public static void main(String[] args) {
// Creating objects of Student class
		implementHashcodeAndEquals student1 = new implementHashcodeAndEquals(1, "Alice");
		implementHashcodeAndEquals student2 = new implementHashcodeAndEquals(2, "Bob");
		implementHashcodeAndEquals student3 = new implementHashcodeAndEquals(1, "Alice");
// Testing equals method
		System.out.println("student1.equals(student2): " + student1.equals(student2)); // Output: false
		System.out.println("student1.equals(student3): " + student1.equals(student3)); // Output: true
// Testing hashCode method
		System.out.println("Hashcode of student1: " + student1.hashCode());
		System.out.println("Hashcode of student2: " + student2.hashCode());
		System.out.println("Hashcode of student3: " + student3.hashCode());
	}
}