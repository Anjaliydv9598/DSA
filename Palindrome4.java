package com.dsa.practice;

import java.util.Scanner;

public class Palindrome4 {

	public static boolean  isPalindrome(String str) {
		str=str.toLowerCase().replaceAll("[^a-z0-9]" , "");
		
		int start =0;
		int end = str.length()-1;
		
		while(start<end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}return true;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");		
		String input = sc.nextLine();
		
		if(isPalindrome(input)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
		sc.close();
	}
}
