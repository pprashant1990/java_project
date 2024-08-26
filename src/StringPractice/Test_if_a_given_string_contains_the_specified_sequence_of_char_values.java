package StringPractice;


public class Test_if_a_given_string_contains_the_specified_sequence_of_char_values {

    public static void main(String[] args)
    {
        String str1 = "PHP Exercises and Python Exercises";
        String str2 = "and";
        System.out.println("Original String: " + str1);
        System.out.println("Specified sequence of char values: " + str2);
        System.out.println(str1.contains(str2));
    }
}
