package com.dsa.practice;

public class ReverseAString5 {
	
	public static void main(String[] args) {
		String str="SREDIPSQ TA GNINIART";
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(reversed);
	}

}
