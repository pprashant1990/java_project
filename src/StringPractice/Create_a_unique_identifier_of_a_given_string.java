package StringPractice;

public class Create_a_unique_identifier_of_a_given_string {
	 
	  public static void main(String[] args)
	    {
	        String str = "Python Exercises.";

	        // Get the hash code for the above string.
	        int hash_code = str.hashCode();

	        // Display the hash code.
	        System.out.println("The hash for " + str +
	            " is " + hash_code);
	        
	        String to_string = str.toString();

	        // Display the hash code.
	        System.out.println("The to_string for " + str +
	            " is " + to_string);
	    }
	}
