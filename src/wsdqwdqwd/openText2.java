package wsdqwdqwd;

import java.util.HashSet;


/*
 Given a string s, find the length of the longest substring
without repeating characters in java

Example 1:
Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the length of 3.
//abc abc cb
Plain Text
Input: s = "bbbbb" Output: 1 Explanation: The answer is "b", with the length of 1
*/
public class openText2 {
	
	
	public static void main(String[] args) {
        String s1 = "abcabcbb";
        System.out.println("Input: " + s1 + " Output: " + lengthOfLongestSubstring(s1)); // Output: 3

        String s2 = "bbbbb";
        System.out.println("Input: " + s2 + " Output: " + lengthOfLongestSubstring(s2)); // Output: 1
    }
	
    public static int lengthOfLongestSubstring(String s) {
       // int n = s.length();
        int maxLength = 0;
        int left = 0;
       
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            // If the character at the right index is already in the set,
            // remove the leftmost character from the set and move the left pointer.
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add the current character to the set
            set.add(s.charAt(right));
            // Update the maximum length if the current window is larger
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    
}
