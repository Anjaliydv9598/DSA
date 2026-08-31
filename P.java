package com.dsa.practice;

import java.util.Arrays;
import java.util.Scanner;

public class P {
	
	public static void main(String[] args) {
		
		//anagram
		String s1= "eat";
		String s2="tea";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		if(s1.length()!=s2.length()) {
			System.out.println("Not anagram");
			return;
			}
	
		char [] c1=s1.toCharArray();
		char [] c2=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
	
		if(Arrays.equals(c1, c2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	
		//reverse
		String s= "hello";
		StringBuilder sb=new StringBuilder();  //or ->String reversed=new StringBuilder(s).reverse().toString();
		for(int i=s.length()-1; i>=0; i--) {
			sb.append(s.charAt(i));
		}System.out.println(sb.toString());
		
		
		//Palindrome
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		String input=sc.nextLine();
		if(isPalindrome(input)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}sc.close();
	}

	
	//Palindrome
			public static boolean isPalindrome(String str) {
				str= str.toLowerCase().replaceAll("[a-z0-9]", "");
				int start=0;
				int end=str.length()-1;
				while(start<end) {
					if(str.charAt(start)!=str.charAt(end)) {
						return false;
					}start++;
					end--;
				}
				return true;
			}
}
