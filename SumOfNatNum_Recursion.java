package com.dsa.practice;

public class SumOfNatNum_Recursion {

//  WAJP Print Sum of 5,7 natural no. using recursion
	
	public static int print(int n) {
		if(n==1) {
			return n;
		}
		return n+print(n-1);
	}
	
	public static int num(int n) {
		if(n==0) {
			return 0;
		}
		return n + num(n-1);
	}
	
	
	public static void main(String [] args) {
		System.out.println("Print sum of 5 natural no. using recursion");
		int sum=print(5);
		System.out.println(sum);
//		------------------------
		System.out.println();
		System.out.println("Print sum of 7 natural no. using recursion");
		int summ=num(7);
		System.out.println(summ);
	}
}
