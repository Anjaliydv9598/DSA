package com.dsa.practice;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		String str1 = "Listen";
		String str2= "silent";
		
		//convert String into lowercase
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		//check length
		if(str1.length() != str2.length()) {
			System.out.println("Not Anagram");
			return;
		}
		
		//convert String into characterArray
		char [] ch1 = str1.toCharArray();
		char [] ch2 = str2.toCharArray();
		
		//sort both array
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		//compare array
		if(Arrays.equals(ch1,ch2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}

}
