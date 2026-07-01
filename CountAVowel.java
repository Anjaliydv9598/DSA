package com.dsa.practice;

public class CountAVowel {

	   public static void main(String [] args){
	        String str = "AAASFBDFSDFNGFNHGNGGFNFG";
	        str = str.toLowerCase();
	        int vowelcount = 0;
	        int constcount = 0;

	        for(int i = 0; i < str.length(); i++){
	            if(str.charAt(i) == 'a' || str.charAt(i)== 'e' || str.charAt(i) == 'o' || str.charAt(i)== 'u' || str.charAt(i) == 'i'){
	                vowelcount++;     
	            }
	            else if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') && !(str.charAt(i) == 'a' || str.charAt(i)== 'e' || str.charAt(i) == 'o' || str.charAt(i)== 'u' || str.charAt(i) == 'i')){
	                constcount++;
	            }

	        }

	        System.out.println("Present Vowels in string : " + vowelcount);
	        System.out.println("Present Consonant in string : " + constcount);
	    }
	
}
