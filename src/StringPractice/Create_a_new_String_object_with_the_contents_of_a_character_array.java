package StringPractice;

public class Create_a_new_String_object_with_the_contents_of_a_character_array {

    public static void main(String[] args)
    {
        // Character array with data.
        char[] arr_num = new char[] { '1', '2', '3', '4' };

        // Create a String containing the contents of arr_num
        // starting at index 1 for length 2.
        String str = String.copyValueOf(arr_num, 1, 3);

        // Display the results of the new String.
        System.out.println("\nThe book contains " + str +" pages.\n");
    }
}
