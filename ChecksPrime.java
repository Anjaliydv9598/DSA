package com.dsa.practice;

public class ChecksPrime {

	public static boolean isPrime(int num) {
		
		if(num<=1)
		return false;
		
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String [] args) {
		int num=17;
		if(isPrime(num)) {
			System.out.println("Prime");
		}else {
			System.out.println("NotPrime");
		}
	}
	
}
