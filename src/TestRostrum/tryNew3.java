package TestRostrum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.sound.midi.Soundbank;

public class tryNew3 {

	public static void main(String[] args) {
		
		String str = "my name is vaishali dewangan";
		String[] split = str.split("\\s");
		
		//no of words
		//System.out.println(split.length);
		
		Map<String, Integer> map = new LinkedHashMap<String,Integer>();
		
		for(String s : split) {
			
			map.put(s, s.length());
			
		}
		System.out.println(map);
		
		
		
		
		//letters in a word		
		//List<String> ll = Arrays.asList(split);
		//List<Integer> ll1 = ll.stream().map( a -> a.length()).collect(Collectors.toList());
		//System.out.println(ll1);
		
		
		
		
		
	}

}
