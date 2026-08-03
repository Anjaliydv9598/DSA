package com.dsa.practice;

public class ReverseString3 {
	
	public static void main(String[] args) {
		String str = "abcdefgh";
		String reversed ="";
		
		for(int i=str.length()-1; i>=0; i--) {
			reversed+=str.charAt(i);
		}
		System.out.println(reversed);	
		
		
//		2nd way
		String string="2nd Way";
		String reversed1 =new StringBuilder(string).reverse().toString();
		System.out.println(reversed1);
		
		
		
		
	}
}
