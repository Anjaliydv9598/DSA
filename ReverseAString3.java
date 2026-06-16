package com.dsa.practice;

public class ReverseAString3 {
	
	public static void main(String [] args) {
		String str="REPOLEVED DNEKCAB";
		String reversed=new StringBuilder(str).reverse().toString();
		System.out.println(reversed);
		
//		OR One-liner
		System.out.println(new StringBuilder("REPOLEVED AVAJ").reverse());
		
//		If you want only the first character of the reversed string
		char firstChar=new StringBuilder(str).reverse().charAt(0);
		System.out.println(firstChar);
		
//		Without built-in reverse() and using concatenation
		String str1="AVAJ";
		String reversed2="";
		for(int i=str1.length()-1;  i>=0; i--) {
			reversed2 += str1.charAt(i);
		}
		System.out.println(reversed2);
		
		
//		Without Concatenation
		String str2="REPOLEVED";
		StringBuilder sb=new StringBuilder();
		for(int i=str2.length()-1; i>=0; i--) {
			sb.append(str2.charAt(i));
		}
		System.out.println(sb.toString());

	}

}
