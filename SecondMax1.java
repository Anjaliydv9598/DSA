package com.dsa.practice;

public class SecondMax1 {

	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,6,7,8,10,1,2,3};
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Second Maximum element : " +max);
	}
}
