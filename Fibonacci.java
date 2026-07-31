package com.dsa.practice;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int total = 10;
		
		int first=0, second=1;
		System.out.println("First num :- "+first + " " + ", Second num :- "+ second);
		System.out.println("Fibonacci Series :- ");
		
		for(int i=2; i<=total; i++) {
			int third= first+second;
			System.out.println(" " +third);
			first=second; 
			second=third;
		}
	}

}
