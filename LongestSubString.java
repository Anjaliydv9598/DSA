package com.dsa.practice;

public class LongestSubString {

	public static void main(String[] args) {
		
		String str = "abcdafghc";
		String longest="";
		
		for(int i=0; i<str.length(); i++) {
			String temp="";
			
			for(int j=i; j<str.length(); j++) {
				char ch= str.charAt(j);
				boolean found=false;
				
				for(int k=0; k<temp.length(); k++) {
					if(temp.charAt(k)==ch) {
						found=true;
						break;
					}
				}
				
			if(found) {
				break;	
			}
			temp=temp+ch;
			}
			
		if(temp.length()>longest.length()) {
			longest=temp;
		}
		}
		System.out.println("Longest SubString : " +longest);
		System.out.println("length : " + longest.length());
		
	}
}
