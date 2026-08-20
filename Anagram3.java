package com.dsa.practice;

import java.util.Arrays;

public class Anagram3 {
	
	public static void main(String[] args) {
		
		    String s1 = "care";
	        String s2 = "race";

	        // Convert into lowercase
	        s1 = s1.toLowerCase();
	        s2 = s2.toLowerCase();

	        // Check length
	        if (s1.length() != s2.length()) {
	            System.out.println("Not Anagram");
	            return;
	        }

	        // Convert into char array
	        char[] c1 = s1.toCharArray();
	        char[] c2 = s2.toCharArray();

	        // Sort arrays
	        Arrays.sort(c1);
	        Arrays.sort(c2);

	        // Check if arrays are equal
	        if (Arrays.equals(c1, c2)) {
	            System.out.println("Anagram");
	        } else {
	            System.out.println("Not Anagram");
	        }
	}

}
