package StringPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

//import org.testng.annotations.Test; 

public class StringSplit {

	@Test(/* enabled=false */)
	public void m1() 
	   {		
	      //Split the string
	      //String s1 = "t u t o r i a l s"; 
	      String s1 = "a b c d e f a b";
	      String[] words = s1.split("\\s"); 
	      //System.out.println(words);
	      for(String w:words) 
	      {
	         System.out.println(w);   
	      }
	      	         
	      String s = Arrays.toString(words); //new TreeSet<String>(words);
	      System.out.println("String array values: "+s);
	      
	     List<String> l1 = Arrays.asList(s1);
	      System.out.println("List values: "+11);	     	     
	   }

	@Test
	public void m12() 
	   {
		   String words1 = "my name is prashant name is prashant";
		   String[] split = words1.split("\\s");
		   //System.out.println("String split: "+split);
		   //System.out.println("String split: "+Arrays.toString(split))
		   List<String> uniqeWords1 = Arrays.asList(split);
		   Set<String> uniqeWords= new HashSet<String>(uniqeWords1);
		   System.out.println("String uniqeWords: "+uniqeWords);
		
		  
	   }		
/*	@Test
	void m2() 
	   {
		int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		System.out.println("Original Array : " + Arrays.toString(my_array));

		// Remove the second element (index->1, value->14) of the array
		int removeIndex = 1;

		for (int i = removeIndex; i < my_array.length - 1; i++) 
		{
			my_array[i] = my_array[i + 1];
		}
		// We cannot alter the size of an array , after the removal, the last
		// and second last element in the array will exist twice
		System.out.println("After removing the second element: "+ Arrays.toString(my_array));
	   }*/
	
	

}
