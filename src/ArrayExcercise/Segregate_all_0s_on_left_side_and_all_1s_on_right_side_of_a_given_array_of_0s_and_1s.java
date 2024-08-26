package ArrayExcercise;

import java.util.*;
import java.lang.*;
class Segregate_all_0s_on_left_side_and_all_1s_on_right_side_of_a_given_array_of_0s_and_1s
{
   public static void main (String[] args) 
    {  
        int nums[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        int i,  nums_size = nums.length;
        int left = 0, right = nums_size - 1;
        
        System.out.println("Original Array : "+Arrays.toString(nums));  
 
        while (left < right) 
        {
            /* While  0 at left increment left index  */
            while (nums[left] == 0 && left < right)
               left++;
 
            /* While we see 1 at right decrement right index*/
            while (nums[right] == 1 && left < right)
                right--;
 
           
            if (left < right) 
            {
                nums[left] = 0;
                nums[right] = 1;
                left++;
                right--;
            }
        }
        
       System.out.println("Array after segregation is : "+Arrays.toString(nums));  
    }
}
