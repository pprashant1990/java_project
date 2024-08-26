package StringPractice;

import java.util.Calendar;

public class Print_current_date_and_time_in_the_specified_format {
 
 public static void main(String[] args) { 
    Calendar c = Calendar.getInstance();
      System.out.println("Current Date and Time :"); 
      System.out.format("%tB %te, %tY%n", c, c, c);
      System.out.format("%tl:%tM %tp%n", c, c, c); 
   }
   }
