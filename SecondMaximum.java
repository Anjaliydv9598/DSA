package com.dsa.practice;

public class SecondMaximum {
	
	public static int secondMax(int [] arr) {
		
		int maximum= arr[0];
		int secondMaximum=arr[1];
		
		for(int i=2 ; i<arr.length; i++) {
			if(arr[i]>maximum) {
				secondMaximum=maximum;
				maximum=arr[i];
			}
			else if(arr[i]>secondMaximum) {
				secondMaximum=arr[i];
			}
		}
		return secondMaximum;
	}
	
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6};
		System.out.println(secondMax(arr));
	}

}
