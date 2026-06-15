package com.dsa.practice;

public class PrimeCheck {
	
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		if(n==2) {
			return false;
		}
		if(n%2==0) {
			return false;
		}
		for(int i=3; i*i<=n; i+=2) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String [] args) {
		int num=27;
		
		if(isPrime(num)) {
			System.out.println(num+" -> is a Prime Number ");
		}
		else {
			System.out.println(num + " -> is not a Prime Number");
		}
	}

}
