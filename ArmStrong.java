package com.dsa.practice;

public class ArmStrong {
	
	public static void main(String[] args) {
		
		int num = 153;
		int temp = num;
		int count =0; int sum=0;
		
		//count no. of digit 
		while(temp  != 0) {
			count ++;
			temp = temp/10;
		}
		temp = num;
		
		//calculate sum of each digit raised to power of count
		while(temp != 0) {
			int digit = temp % 10;
			sum = sum + (int)Math.pow(digit, count);
			temp = temp /10;
		}
		if(sum == num) {
			System.out.println(num + "is Armstrong no. ");
		}
		else {
			System.out.println(num + "is not an Armstrong no. ");
		}
		
	}

}
