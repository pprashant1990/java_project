package StringPractice;

public class Compare_a_given_string_to_the_specified_string_buffer {

   public static void main(String[] args) 
   {
    String str1 = "example.com"; 
    String str2 = "Example.com";
    StringBuffer strbuf = new StringBuffer(str1);
    
    System.out.println("Comparing "+str1+" and "+strbuf+": " + str1.contentEquals(strbuf));
    
    System.out.println("Comparing "+str2+" and "+strbuf+": " + str2.contentEquals(strbuf));
    
    }
}
