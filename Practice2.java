package com.dsa.practice;

import java.util.Arrays;

public class Practice2 {

	public static void main(String[] args) {
		
		//Find the second largest element in an array.
		 int[] arr = {10, 25, 5, 40, 15};

//	        int largest = Integer.MIN_VALUE;
//	        int secondLargest = Integer.MIN_VALUE;
//
//	        for (int num : arr) {
//
//	            if (num > largest) {
//	                secondLargest = largest;
//	                largest = num;
//
//	            } else if (num > secondLargest && num != largest) {
//	                secondLargest = num;
//	            }
//	        }
//
//	        System.out.println("Largest: " + largest);
//	        System.out.println("Second Largest: " + secondLargest);
		 
		 //or

//	        int secondLargest = Arrays.stream(arr)
//	                                   .distinct()
//	                                   .boxed()
//	                                   .sorted((a, b) -> b - a)
//	                                   .skip(1)
//	                                   .findFirst()
//	                                   .orElseThrow();
//
//	        System.out.println("Second Largest: " + secondLargest);
		 
		 //or
		 int largest;
	        int secondLargest;

	        if (arr[0] > arr[1]) {
	            largest = arr[0];
	            secondLargest = arr[1];
	        } else {
	            largest = arr[1];
	            secondLargest = arr[0];
	        }

	        for (int i = 2; i < arr.length; i++) {

	            if (arr[i] > largest) {
	                secondLargest = largest;
	                largest = arr[i];
	            } 
	            else if (arr[i] > secondLargest && arr[i] != largest) {
	                secondLargest = arr[i];
	            }
	        }

	        System.out.println("Second Largest: " + secondLargest);
	}
}
