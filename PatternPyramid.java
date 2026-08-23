package com.dsa.practice;

public class PatternPyramid {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1; i<=n; i++) {
			//print space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//print stars
			for(int j=1; j<=(2*i-1); j++) {
				System.out.print("*");
			}
			//move to the next line
			System.out.println();
		}
	}
}
