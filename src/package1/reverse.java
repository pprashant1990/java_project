package package1;

class reverse
{
   public static void main(String args[])
   {
      int num=12345;
      int reversenum =0;
      while( num != 0 )
      {
    	  System.out.println("######################");
          reversenum = reversenum * 10;
          System.out.println("Reverse  num 1 : "+reversenum);
          reversenum = reversenum + num%10;
          System.out.println("Reverse num 1 : "+reversenum);
          num = num/10;
          System.out.println("Num : "+reversenum);
          
          System.out.println("######################");
      }

      System.out.println("Reverse of specified number is: "+reversenum);
   }
}