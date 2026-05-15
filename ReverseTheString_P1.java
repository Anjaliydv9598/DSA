package com.dsa.practice;

public class ReverseTheString_P1 {

	public static void main(String [] args) {
		//Ways of Reversing an Array
		
		//1. via loop
		
		String a = "KCATS LLUF";
		String b ="";
		
		for(int i= a.length()-1 ; i>=0 ; i--) {
			 b=b+a.charAt(i);
		}
		System.out.println(b);
		
		
		System.out.println("---------------------------------------------------");
		
		//2. via character array
		
		String c = "REPOLEVED AVAJ";
		char [] d = c.toCharArray();
		
		for(int i =d.length-1 ; i>=0 ; i--){
			System.out.println(d[i]);
		}
		
		
	
		System.out.println("----------------------------------------------------");
		
		//3. via StringBuilder
		String str="DNETNORF";
		
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(reversed);
		
		
		
		
		System.out.println("----------------------------------------------------");
		
		//4. via recursion 
		System.out.println(reverse("DNEKCAB"));
		
	}			

	static String reverse(String e) { 
	if(e.isEmpty())
	return e;
	
	return reverse(e.substring(1))+e.charAt(0);
	}
	
	
}
