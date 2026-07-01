package com.dsa.practice;

import java.util.Arrays;

public class Anagram1 {
	
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		
		// converts intp lower case
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		// check length
		if(s1.length() != s2.length()) {
			System.out.println("Not Palindrome");
			return;
		}
		
		// convert into array
		
		char [] ch1 = s1.toCharArray();
		char [] ch2 = s2.toCharArray();
		
		//sort
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		//compare array
		if(Arrays.equals(ch1,ch2)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
