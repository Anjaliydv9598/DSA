package com.dsa.practice;

public class Fibonacci1 {
	
	public static void main(String[] args) {
		
		int num= 7;
		int first = 0;
		int second = 1;
		
		for(int i=2; i<=num; i++) {
			int next = first + second;
			System.out.println(" "+next);
			first=second;
			second=next;
			
		}
			}

}
