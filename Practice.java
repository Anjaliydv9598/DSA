package com.dsa.practice;

import java.util.Arrays;

public class Practice {

	public static void main(String[] args) {
		
//		find the largest element in an array.
		
		int [] arr = {1,2,3,4,5,6,7,8};
//		int largest = arr[0];	
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i]>largest) {
//				largest = arr[i];
//			}
//		}
//		System.out.println("Largest elements : " + largest);
	
		//or  java 8
//		int largest= Arrays.stream(arr).max().orElseThrow();
//		System.out.println("Largest elements : " + largest);
		
		// or  java 8 using reduce()
		int largest = Arrays.stream(arr).reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
		System.out.println("Largest elements : " + largest);
		
	}
}
