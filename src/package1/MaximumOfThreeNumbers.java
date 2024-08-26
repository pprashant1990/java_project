package package1;

/*public class MaximumOfThreeNumbers {

	public static void main(String[] args) {
		

	}

}*/

import java.util.Scanner;

class MaximumOfThreeNumbers
{
   public static void main(String args[])
   {
      int x, y, z;
      //System.out.println("Enter three integers ");
     // Scanner in = new Scanner(System.in);
 
      x = 10;
      y = 91;
      z = 90;
 
      if ( x > y && x > z )
         System.out.println("First number: " +x+ "is largest.");
      else if ( y > x && y > z )
         System.out.println("Second number: " +y+ " is largest.");
      else if ( z > x && z > y )
         System.out.println("Third number: " +z+ " is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");
   }
}