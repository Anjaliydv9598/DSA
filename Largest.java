package com.dsa.practice;

public class Largest {

//	public static void main(String[] args) {
//		int [] arr = {1,2,3,4,7,6,5,8,0,5};
//		
//		int largest =arr[0];
//		
//		for(int i=1; i<arr.length; i++)
//		{
//			if(arr[i]>largest)
//			{
//			largest=arr[i];
//			}
//			
//		}
//		System.out.println("Largest element is : " + largest);
//	}
	
	public static int secondLargest(int [] arr) {
		int largest = arr [0];
		int secondlargest = arr [1];
		
		for(int i=2; i<arr.length; i++) {
			
			if(arr[i]>largest) {
				secondlargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondlargest) {
				secondlargest=arr[i];
			}
			
		}
		return secondlargest;
	}
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,9,0,1};
		System.out.println(secondLargest(arr));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
