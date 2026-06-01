package com.dsa.practice;

public class FactorialByRecursion {

//		WAJP Print factorial of 5 using recursion
		public static void main(String[] args) {
			int fact = print(5);
			System.out.print(fact);
		}
		
		public static int print(int n) {
			if(n==1) {
				return 1;		
			}
			return n*print(n-1);
			
		}

}
