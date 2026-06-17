package com.dsa.practice;

public class PalindromeString1 {
	
	  public static void main(String[] args) {

	        String str = "Java";
	        String reversed = "";

	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i);
	        }

	        if (str.equals(reversed)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }
	    }

}
