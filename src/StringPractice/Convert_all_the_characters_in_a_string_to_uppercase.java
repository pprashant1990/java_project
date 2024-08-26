package StringPractice;

public class Convert_all_the_characters_in_a_string_to_uppercase {
    
	   public static void main(String[] args)
	    {
	        String str = "The Quick BroWn FoX!";
	        // Convert the above string to all uppercase.
	        String upper_str = str.toUpperCase();

	        // Display the two strings for comparison.
	        System.out.println("Original String: " + str);
	        System.out.println("String in uppercase: " + upper_str);
	    }
	}
