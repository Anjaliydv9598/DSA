package com.dsa.practice;

public class CountWords {
	
	public static void main(String[] args) {
		String str = "Hello world";
		
//		split by space
		String [] words = str.split(" ");
		
//		count words
		int count = words.length;
		
		System.out.println("Nmber of words : "+count);
	}

}
