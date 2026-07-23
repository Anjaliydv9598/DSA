package com.dsa.practice;

public class ReverseWord {
	
	public String reverseWords(String s) {
		
		char [] str = s.toCharArray();
		
		//Step 1: reverse the entire String
		reverse(str,0,str.length-1);
		int end=str.length;
		int left=0;
		int right=0;
		int i=0;
		
		while(i<end) {
			  // skip spaces
			while(i<end && str[i]== ' ') {
				i++;
			}
			if(i==end) {
				break;
			}
			// add space before next word (if not first word)
		    if (right != 0) {
	           str[right++] = ' ';
	         }
	        left = right;

	        // copy word
	        while(i<end && str[i] != ' ') {
	           str[right++]=str[i++];
	         }
		
	     // reverse the copied word
		 reverse(str,left, right-1);
		}
		  return new String(str, 0, right);
	}
	
	
	public void reverse(char [] arr, int start,int end) {
		while(start<end) {
			char temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		ReverseWord sol = new ReverseWord();
		String input1 = "Sky is Blue";
		System.out.println(sol.reverseWords("Sky is Blue"));
		
		String input2= "cookies eat Cookie";
		System.out.println(sol.reverseWords("cookies eat Cookie"));
	}
}
