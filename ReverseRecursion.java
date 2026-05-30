package com.dsa.practice;

public class ReverseRecursion {

//	WAJP to print the num in reverse order using recursion
	
	public static void main(String[] args) {
		print(1);
	}
	
	public static void print(int n) {
		if(n>5) {
			return;
		}
		print(n+1);
		System.out.println(n);
	}
}
