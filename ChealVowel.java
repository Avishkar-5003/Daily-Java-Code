package com.stringexample;

import java.util.Scanner;

public class ChealVowel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter the String:");
	    String a = sc.next();
	    
	   a = a.toLowerCase();
	    
	     int  count = 0;
	   
	   for(int i=0;i< a.length();i++) {
		   
		   char ch = a.charAt(i);
		   
		   if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			   
			   count++;
			   
		   }
	   }   
		   if(count>0) {
			   
			   System.out.println("Yes it is vowel");
			   System.out.println("Count is:"+count);
			   
		   }
		   else {
			   
			   System.out.println("no vowel is present in the string:");
		   }
		   
		   
	   }
		
}


