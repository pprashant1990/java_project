package ArrayExcercise;

import java.util.Arrays; 
public class Find_the_number_of_even_and_odd_integers_in_a_given_array_of_integers {
public static void main(String[] args)
{
   int[] array_nums = {5, 7, 2, 4, 9};
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	int ctr = 0;
	for(int i = 0; i < array_nums.length; i++)
	{
		if(array_nums[i] % 2 == 0)
			ctr++;
	}
	System.out.println("Number of even numbers : "+ctr);
	System.out.println("Number of odd numbers  : "+(array_nums.length-ctr));
}
}
