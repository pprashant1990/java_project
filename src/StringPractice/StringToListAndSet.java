package StringPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringToListAndSet {

	public static void main(String[] args) {
		
		/*String[] words = {"ace", "boom", "crew", "dog", "eon","crew"};   
		 * 
		 * 

		List<String> wordList = Arrays.asList(words);  
		 System.out.println("String array values: "+wordList);
		//For converting to Set, you can do as below

		Set<String> mySet = new HashSet<String>(Arrays.asList(words));
		System.out.println("String array values: "+mySet);*/
		 
	   String words1 = "my name is prashant name is prashant";
	   String[] split = words1.split("\\s");
	   System.out.println("String split1: "+split);	 
	   
	   
	   String sArray= Arrays.toString(split);	   
	   System.out.println("String split2: "+sArray);	   
	   System.out.println("String split2: "+Arrays.toString(split));
	   
	   String split2 = Arrays.toString(split);
	   System.out.println("String split3: "+split2);
	   
	   List<String> ListWords= Arrays.asList(split);
	   System.out.println("String listWords: "+ListWords);
	   
	   //Set<String> uniqeWords= new HashSet<String>(Arrays.asList(split));
	   //System.out.println("String uniqeWords: "+uniqeWords);
	   
	   Set<String> setUniqeWords= new HashSet<String>(ListWords);
	   System.out.println("String uniqeWords: "+setUniqeWords);
	   
	   
	  
	   
	   
	}

}
