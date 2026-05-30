package com.dsa.practice;

public class RotateTheArray {

	// WAJP to Rotate an Array
	public static void main(String[] args) {
	
		int a = 2;
		int []  arr = {10,20,30,40,50,60,70};
		
		for(int j=0 ; j<20 ; j++) {
			int temp= arr[0];
			
			for(int i =0;i<arr.length-1 ; i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
			
			for(int i: arr) {
				System.out.println(i+" ");
			}
		}
}
}