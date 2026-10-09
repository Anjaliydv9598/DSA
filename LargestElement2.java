package com.dsa.practice;

import java.util.Arrays;

public class LargestElement2 {
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,45,5,7,6,8};
		
		int largest = Arrays.stream(arr).reduce(Integer.MIN_VALUE,(a,b)->a>b ? a:b);
		
		System.out.println("largets element: " + largest);
		
	}

}
