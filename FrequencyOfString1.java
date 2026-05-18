package com.dsa.practice;

public class FrequencyOfString1 {
	
	//WAJP Frequency of String via loop

	public static void main(String[] args) {
		
		String str = "FULL STACK DEVELOPER";
		int [] freq = new int [123];
		
		//count the frequency 
		for(int i=0 ; i<str.length() ; i++) {
			freq[str.charAt(i)]++;
		}
		
		
		//print the result
		
		for(int i =0 ; i<123 ; i++) {
			if(freq[i] !=0) {
				System.out.println((char)i + "->" + freq[i]);
			}
		}
		

	}

}
