package com.dsa.practice;

public class TwoSum1 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		int target =  10 ;
		int left = 0;
		int right = arr.length-1;
		
		for(int i=0; i<arr.length; i++) {
			
			int sum = arr[left]+arr[right];
			
			if(sum == target) {
				System.out.println("TARGET FOUND " + left + " "+ right);
				break;
			}
			else if(sum<target) {
				left++;
			}else if(sum > target) {
				right--;
			}
		}
	}
}
