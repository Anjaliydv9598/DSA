package com.dsa.practice;

public class CharFrequency {
	
	public static void main(String[] args) {
		String str = "HELLO WORLD";
		
		int [] count = new int[256];		// for all ASCII char
		
		//count frequency
		for(int i=0; i<str.length(); i++)
		{
			count[str.charAt(i)]++;
		}
		//print frequency
		for(int i=0; i<str.length(); i++) 
		{
			if(count[str.charAt(i)]!=0)
			{
				System.out.println(str.charAt(i) + "=" + count[str.charAt(i)]);
				count[str.charAt(i)]=0;			//avoid duplicate
			}
		}
	}

}
