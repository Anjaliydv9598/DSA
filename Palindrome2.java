package com.dsa.practice;

public class Palindrome2 {
	
	public static void main(String[] args) {
		String str = "Madam";
		str=str.toLowerCase();
	
		String reversed="";
		
		for(int i=str.length()-1; i>=0; i--) {
			reversed+=str.charAt(i);
		}
		
		if(str.equals(reversed)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
