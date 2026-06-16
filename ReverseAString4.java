package com.dsa.practice;

public class ReverseAString4 {
	
	public static void main(String[] args) {

        String str = "REPOLEVED DNEKCAB";

        // Using StringBuilder reverse()
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);

        // One-liner
        System.out.println(new StringBuilder("REPOLEVED AVAJ").reverse());

        // First character of reversed string
        char firstChar = new StringBuilder(str).reverse().charAt(0);
        System.out.println(firstChar);

        // Without built-in reverse() and using concatenation
        String str1 = "AVAJ";
        String reversedString = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversedString += str1.charAt(i);
        }
        System.out.println(reversedString);

        // Without concatenation
        String str2 = "REPOLEVED";
        StringBuilder sb = new StringBuilder();
        for (int i = str2.length() - 1; i >= 0; i--) {
            sb.append(str2.charAt(i));
        }
        System.out.println(sb);
    }

}
