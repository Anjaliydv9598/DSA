package com.dsa.practice;

public class PalindromeString {
	
	//box model,flex&grid,jsEngine=fatbox, var,let,const,equal,equalsTo


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
