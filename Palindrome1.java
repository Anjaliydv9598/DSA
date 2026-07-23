package com.dsa.practice;

public class Palindrome1 {

	public static boolean palinDrome(int n) {
		
		if(n<0) {
			return false;
		}
		
		int original = n;
		int reverse=0;
		
		while(n!=0) {
			reverse=reverse*10 + n%10;
			n=n/10;
		}return original==reverse;
	}
	
	public static void main(String[] args) {
		int n=12321;
		System.out.println(palinDrome(n));
	}
}
