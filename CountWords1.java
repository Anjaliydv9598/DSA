package com.dsa.practice;

public class CountWords1 {
	
	public static void main(String[] args) {
		String str ="sdfgh hjk sdfghj ghj";
		
//		remove extra spaces
		str=str.trim();
		
//		split one or more space
		String[] words=str.split("\\s+");
		
		System.out.println(words.length);
	}

}
