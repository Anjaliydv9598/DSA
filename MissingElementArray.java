package com.dsa.practice;

public class MissingElementArray {

	//WAJP to Find the missing element from an Array
	
	public static void main(String[] args) {
	
		int [] arr = {1,3,5,7,9,10,13};
		int n=13;	//no.'s r from 1 to 13
		
		//sum of 1st  n natural no's
		int expectedSum = n * (n+1) / 2;
		
		//sum of array elements 
		int actualSum = 0;
		
		for(int num : arr) {
			actualSum += num;
		}
		
		//Missing number
		int missing = expectedSum - actualSum ;
		System.out.println("Missing Element is : " + missing);
	}

}
