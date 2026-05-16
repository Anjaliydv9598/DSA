package com.dsa.practice;

public class FrequencyOfSpecificArray {

	//WAJP Frequency of Specific Array
	public static void main(String[] args) {
		
		String str = "HELLO DEVELOPERS";
		char target = 'L';
		
		int count = 0;
		
		for (int i =0; i<str.length(); i++) {
			if(str.charAt(i)== target) {
				count++;
			}
		}
		System.out.println("Frequency of " + target + " = " + count);

	}

}
