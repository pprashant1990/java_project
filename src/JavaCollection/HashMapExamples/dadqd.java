package JavaCollection.HashMapExamples;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");



class Solution {
	public static String solution(String S) {
     // Implement your solution here
  char[] c = S.toCharArray();

  int left = 0 ;
  int right = c.length - 1;

  while(left < right){
	  
    if(c[left] == '?' && c[right] =='?'){
            c[left] = 'a';
            c[right] = 'a';
            
    }else if(c[left] == '?'){
            c[left] = c[right];              
    }else if(c[right] == '?'){
            c[right] = c[left];
    }else if(c[left] != c[right]){
            return "NO";
    }
    left++;
    right++;
  }
  return new String(c);
 }

	public static void main(String[] args) {
		System.out.println(Solution.solution("?ab??a")); // aabbaa
		System.out.println(Solution.solution("bab??a")); // NO
		System.out.println(Solution.solution("?a?")); // aaa

	}

}