package StringPractice;

public class Replace_all_the_$d_characters_with_$f_characters {
    
	   public static void main(String[] args)
	    {
	        String str = "The quick brown fox jumps over the lazy dog.";

	        // Replace all the 'd' characters with 'f' characters.
	        String new_str = str.replace('d', 'f');

	        // Display the strings for comparison.
	        System.out.println("Original string: " + str);
	        System.out.println("New String: " + new_str);
	    }
	}
