package com.dsa.practice;

public class FrequencyChar {
	
	public static void main(String[] args) {
		String str= "qwertyuiop asfghjkl zxcvbnm";
		
		int [] count = new int [256];		// for all ASCII 
		
		//count frequency
		for(int i=0; i<str.length();i++) {
			count [str.charAt(i)]++;
		}
		
		//print frequency
		for(int i=0;i<str.length();i++) {
			if(count[str.charAt(i)] != 0) {
				System.out.println(str.charAt(i) + " = " + count[str.charAt(i)]);
				 
				count[str.charAt(i)]=0;			//avoid duplicate
			}
		}
	}

}
