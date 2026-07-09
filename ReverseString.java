package com.dsa.practice;

public class ReverseString {
	
	public static void main(String[] args) {
		String str="java";
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(reversed);
	}

}
