package package1;

//Example 1: Program to print fibonacci series using for loop

public class fibonacci1 {

    public static void main(String[] args) {

        int count = 7, num1 = 0, num2 = 1;
        System.out.println("######################");
        System.out.print("Fibonacci Series of "+count+" numbers:");

        for (int i = 1; i <= count; ++i)
        {
        	 System.out.print(num1+" "); //0 1

            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number*/
             
            int sumOfPrevTwo = num1 + num2; //1 
            //System.out.println("SumOfPrevTwo : "+sumOfPrevTwo);
            num1 = num2; //1
            //System.out.println("Num1 : "+num1);
            num2 = sumOfPrevTwo; //1
            //System.out.println("Num2 : "+num2);
            
            //System.out.println("######################");
        }
    }
}

/*//Example 2: Displaying Fibonacci Sequence using while loop
public class fibonacci {

    public static void main(String[] args) {

        int count = 7, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}*/



//Example 3: Program to display the fibonacci series based on the user input

/*import java.util.Scanner;
public class fibonacci {

    public static void main(String[] args) {

        int count, num1 = 0, num2 = 1;
        System.out.println("How may numbers you want in the sequence:");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.close();
        System.out.print("Fibonacci Series of "+count+" numbers:");

        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}*/