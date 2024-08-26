package StringPractice;

public class Get_the_contents_of_a_given_string_as_a_character_array {
	 
	  public static void main(String[] args)
	    {
	        String str = "This is a sample string.";

	        // Copy the contents of the String to a byte array.
	        // Only copy characters 4 through 10 from str.
	        // Fill the source array starting at position 2.
	        char[] arr = new char[] { ' ', ' ', ' ', ' ',
	                                  ' ', ' ', ' ', ' ' };
	        str.getChars(4, 10, arr, 2);
            //String str1 =  new String();
	        
	        // Display the contents of the byte array.
	        System.out.println("The char array equals \"" +
	            arr + "\"");
	    }
	}
