package com.dsa.practice;

import java.util.Arrays;

public class Anagram2 {
	
	public static void main(String[] args) {
		String s1 = "race";
		String s2 = "care";
		
		//convert into lowercase
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		 // Check length first
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }
		
		//convert to char array
		char [] a1 = s1.toCharArray();
		char [] a2 = s2.toCharArray();
		
		//sort both array
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		//compare
		if(Arrays.equals(a1,a2 )){
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}

}
