package com.dsa.practice;

public class PalindromeString {

	    public static void main(String[] args) {

	        String str = "MADAM";

	        String reversed = new StringBuilder(str).reverse().toString();

	        if (str.equals(reversed)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }
	    }
	

}
