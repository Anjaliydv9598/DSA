package com.dsa.practice;

import java.util.Arrays;

public class LargestElement1 {

	public static void main(String[] args) {
		
		int [] arr = {1,2,4,7,5,3};
		
		int largest = Arrays.stream(arr).max().orElseThrow();
		
		System.out.println( "largest : "  +largest );
	}
}
