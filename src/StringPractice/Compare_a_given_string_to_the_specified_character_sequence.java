package StringPractice;

public class Compare_a_given_string_to_the_specified_character_sequence {
public static void main(String[] args) {
    String str1 = "example.com"; 
    String str2 = "Example.com";
    CharSequence cs = "example.com";
     
    System.out.println("Comparing "+str1+" and "+cs+": " + str1.contentEquals(cs));
    System.out.println("Comparing "+str2+" and "+cs+": " + str2.contentEquals(cs));
  
}
}
