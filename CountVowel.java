package com.dsa.practice;

public class CountVowel {
	
	public static void main(String[] args) {
		String str ="asdfqwertyuiopzxcvbnm";
		int vowel_count=0;
		int consonent_count=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				vowel_count++;
			}
			else if((str.charAt(i)>='a' && str.charAt(i)<='z') &&! (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')) {
				consonent_count++;
			}
		}
		
		System.out.println("The Count of Vowels : "+vowel_count);
		System.out.println("The Count of Consonent : "+consonent_count);
	}

}
