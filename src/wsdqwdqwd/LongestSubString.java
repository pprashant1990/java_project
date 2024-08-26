package wsdqwdqwd;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {
		//int n = s.length();
		int ans = 0;
		
		Set<Character> set = new HashSet<>();
		
		int i = 0, j = 0;
		
		while (j < s.length()) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			} else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		//System.out.println(set);
		return ans;
	}

}
