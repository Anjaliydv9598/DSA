package com.dsa.practice;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
	
	public static void main(String[] args) {
		String str = "swiss";
		
		HashMap<Character,Integer>map = new HashMap<>();
		
//		Step 1: Count  frequency
		for(char ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
//		Step 2: Find 1st non-repeating
		for(char ch:str.toCharArray()) {
			if (map.get(ch)==1) {
				System.out.println("First non-repeating character : "+ch);
				return;
			}
		}
		System.out.println("No non-repeating charcater found");
	}

}
