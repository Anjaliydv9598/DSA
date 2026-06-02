package com.dsa.practice;

public class SumOfNatNum_Recursion {

//	Print Sum of 3 natural no. using recursion
	
	public static int print(int n) {
		if(n==1) {
			return n;
		}
		return n+print(n-1);
	}
	
	
	public static void main(String [] args) {
		int sum=print(5);
		System.out.println(sum);	}
}
