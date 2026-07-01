package com.dsa.practice;

public class PalindromeP1 {
	
	public static void main(String[] args) {
		String str="Madam";
		str=str.toLowerCase();
		
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev+=str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
