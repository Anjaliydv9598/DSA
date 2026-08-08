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
		
//		3rd Way
		String str1="3rd Way";
		StringBuilder reversed2=new StringBuilder();
		for(int i=str1.length()-1; i>=0; i--) {
			reversed2.append(str1.charAt(i));
		}
		System.out.println(reversed2.toString());
		
//		4th Way
		String str2="Sky is Blue";
		String [] words=str.split(" ");
		StringBuilder result = new StringBuilder();
		for(int i=words.length-1; i>=0; i--) {
			result.append(words[i]).append(" ");
		}
		System.out.println(result.toString().trim());
	
	
	 
	
	
	
	}
}
