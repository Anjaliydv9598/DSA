package com.dsa.practice;

public class SortAnArray {
	
	public static void main(String[] args) {
		
		int [] arr = {1,0,1,0,0,1,0,1,0,1};
		int countZero=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				countZero++;
			}
		}
		
		for(int i=0; i<countZero; i++) {
			arr[i]=0;
		}
		
		for(int i=countZero; i<arr.length; i++) {
			arr[i]=1;
		}
		
		for(int num:arr) {
			System.out.println(num + "");
		}
	}

}
