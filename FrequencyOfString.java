package com.dsa.practice;

public class FrequencyOfString {

	//WAJP Frequency of String via loop 
	
	public static void main(String[] args) {
		
		String str = "hello";
		int [] freq = new int [256] ;
		
		//count the frequency 
		for(int i=0 ; i<str.length(); i++) 
		{
			freq[str.charAt(i)]++;
		}
		
		//print the result
		for(int i=0 ; i<256 ; i++)
		{
			if(freq[i] != 0)
			{
				System.out.println((char)i + "->" + freq[i]);
			}
		}

	}

	//o/p = So characters are printed based on their ASCII values, not the original string order.
	//'e' → 101
	//	'h' → 104
	//	'l' → 108
	//	'o' → 111
}
