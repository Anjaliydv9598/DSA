package com.dsa.practice;

public class ReturnTwoNum {

	public static int add(int a, int b) {
		return a+b;
	}
	
	public static String getNum(int a , int b) {
		return a + " " +b;
	}
	public static void main(String [] args) {
		System.out.println("returning Sum of two no's");
		int result = add(10,20);
		System.out.println(result);
		System.out.println();
		System.out.println("returning two no's");
		System.out.println(getNum(10,20));
	}
}
