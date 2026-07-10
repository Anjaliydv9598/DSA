package com.dsa.practice;

public class ReverseString1 {
	
	public static void main(String[] args) {
		String str =  "! DECALP TEG U LINTU ECITCARP ";
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(reversed);
	}

}
