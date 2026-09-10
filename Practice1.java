package com.dsa.practice;

public class Practice1 {

	// find second largest in array
	
	public static int secondLargest(int[]arr) {
		
		int largest = arr[0];
		int second_largest=arr[1];
		
		for(int i=2; i<arr.length; i++) {
			
			if(arr[i]>largest) {
				second_largest=largest;
				largest=arr[i];
			}else if(arr[i]>second_largest) {
				second_largest=arr[i];
			}
		}
		
		return second_largest;
	}
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6};
		System.out.println(secondLargest(arr));
	}
}
