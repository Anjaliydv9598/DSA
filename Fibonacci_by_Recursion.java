package com.dsa.practice;

public class Fibonacci_by_Recursion {
	
	public static void main(String[] args) {
		int fib=fib(5);
		System.out.println(fib);
	}
	
	private static int fib(int n) {
		if(n==0 || n==1)
			return n;
	
	return fib(n-1)+fib(n-2);
	}
}
