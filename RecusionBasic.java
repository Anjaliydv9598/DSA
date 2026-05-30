package com.dsa.practice;

public class RecusionBasic {
	
	public static void printNum(int n) {
		if(n>5) {	//base case
			return;
		}
		System.out.println(n);
		printNum(n+1);
	}
	public static void main(String[] args) {
		printNum(1);
	
	}

}
