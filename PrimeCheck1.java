package com.dsa.practice;

public class PrimeCheck1 {
	
	public static boolean isPrime(int n) {
		if( n==1) {
			return false;
		}
		if( n==2) {
			return false;
		}
		if(n%2==0) {
			return false;
		}
		for(int i=3 ; i*i<=n ; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String [] args) {
		int [] nums= {29 , 12, 13, 17,39};
		
		for(int num:nums) {
		if(isPrime(num)) {
			System.out.println(num + " -> is a Prime Number .");
		}else {
			System.out.println(num + " -> is not a Prime Number");
		}
	}}
	

}
