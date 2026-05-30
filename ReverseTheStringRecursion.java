package com.dsa.practice;

public class ReverseTheStringRecursion {

//  	WAJP Reverse the String using Recursion
	
		public static void main(String[] args) {
			String s ="hello";
			String rev = reverse(s,0);
			System.out.println(rev);
		}
		
		public static String reverse(String s,int i) {
			if(i==s.length()) {
				return "";
			}
			char c =s.charAt(i);
			return reverse(s,i+1)+c;
	}
		
		}
