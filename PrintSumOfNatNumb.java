package com.dsa.practice;

public class PrintSumOfNatNumb {

	// Print Sum of 5 natural number using recursion
	
		public static void main(String[] args) {
			System.out.println(num(5)); 	//1+2+3+4+5=15
			
			int sum=print(5);
			System.out.println(sum);		//15
		}
		
		public static int num(int n) {
			if(n==0) {
				return 0;
			}
			return n + num(n-1);
		}
		
//		or
		
		public static int print(int n) {
			if(n==1) {
				return n;
			}
			return n + print(n-1);
		}
}


