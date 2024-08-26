package javaBasic;

public class CountNumberOfCharInAString {
  
	public static void main(String[] args)
    {
        String str = "xaaaxxxx";
        System.out.print("Number of  'x 'Char in the string: " + count_Char(str));
    }
 public static int count_Char(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'x')
            {
                count++;
                System.out.print("Count : " +count+"\n");
            }
        }
        return count; 
    }
 
}
