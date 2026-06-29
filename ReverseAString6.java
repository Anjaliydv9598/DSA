package com.dsa.practice;

public class ReverseAString6 {
	
	public static void main(String[] args) {
		String str="DECALP TOG LITNU GNILTSUH";
		String reversed="";
		
		for(int i=str.length()-1; i>=0; i--) {
			reversed += str.charAt(i);
		}
		
		System.out.println(reversed);
	}

}
