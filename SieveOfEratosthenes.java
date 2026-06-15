package com.dsa.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
	
	public static void sieve(int n) {
		boolean[]prime=new boolean[n+1];
		
		Arrays.fill(prime, true);
		
		if(n>=0) prime[0]= false;
		if(n>=1) prime[1]=false;
		
		for(int i=2; i*i<=n; i++) {
			if(prime[i]) {
				for(int j=i*i; j<=n; j+=i) {
					prime[j]=false;
				}
			}
		}
		
		System.out.println("prime numbers upto " +n+ ":");
		for(int i=2; i<=n; i++) {
			if(prime[i]) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		
		while(true) {
		System.out.println("Enter n: ");
		int n= sc.nextInt();
		
		if(n== -1) {
			break;
		}
		
		sieve(n);
		
		}
		sc.close();
	}

}
