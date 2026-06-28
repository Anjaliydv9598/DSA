package com.dsa.practice;

public class SecondMax {
	
	public static int secondLargest(int []  arr) {
		int Largest=arr[0];
		int secondLargest=arr[1];
		
		for(int i=2 ;  i<arr.length ; i++) {
			if(arr[i]>Largest) {
				secondLargest=Largest;
				Largest=arr[i];
			}
			else if(arr[i]>secondLargest){
			secondLargest=arr[i];
			}
		}
		return secondLargest;
	}

	
	public static void main(String[] args) {
		int [] arr= {7,3,6,65,2,10,-10,23,53,0,-53};
		System.out.println(secondLargest(arr));
	}
}
