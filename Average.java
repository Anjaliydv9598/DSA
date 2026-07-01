package com.dsa.practice;

public class Average {
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,6};
		int sum =0;
		
		for(int i=1; i>arr.length; i++) {
			sum=sum+arr[i];
		}
		double avg= sum/arr.length;
		System.out.println(avg);
	}

}
