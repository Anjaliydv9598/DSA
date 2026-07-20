package com.dsa.practice;

public class ReverseStringg {
	
	public static void main(String[] args) {
		
		String str = "Sky is Blue";
		
		 String result = "";
	        String word = "";
	        
	        for (int i = str.length() - 1; i >= 0; i--) {
	            char ch = str.charAt(i);
	            
	            if (ch != ' ') {
	                word = ch + word;   // build word
	            } else {
	                result += word + " "; // add word to result
	                word = "";            // reset
	            }
	        }
	        
	        result += word; // add last word
	        
	        System.out.println(result);
		
	}

}
