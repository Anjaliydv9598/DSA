package com.dsa.practice;

public class CharFrequencyy {
	
	public static void main(String[] args) {
		String str = "javaaaaaaaa";
		int[]  count = new int [256];
		
		for(int i=0; i<str.length(); i++) {
				count[str.charAt(i)]++;
			
		}
		
		for(int i=0; i<str.length(); i++) {
			if(count[str.charAt(i)] != 0) {
				System.out.println(str.charAt(i) + "=" + count[str.charAt(i)]);
				
				count[str.charAt(i)]=0;
			}
		}
		
	}

}
