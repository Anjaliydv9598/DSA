package com.dsa.practice;

public class Largest {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,7,6,5,8,0,5};
		
		int largest =arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>largest)
			{
			largest=arr[i];
			}
		}
		System.out.println("Largest element is : " + largest);
	}
	
	
}
