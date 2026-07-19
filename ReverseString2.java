package com.dsa.practice;

public class ReverseString2 {
	
	public static void main(String[] args) {
		String s = "Sky is Blue";
		String [] words = s.split(" ");
		
		StringBuilder result = new StringBuilder();
		
		for(int i=words.length-1; i>=0; i--) {
			result.append(words[i]).append(" ");
		}	
		System.out.println(result.toString().trim());
		
	}
	
			

}
