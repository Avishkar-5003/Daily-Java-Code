package com.stringexample;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String name = sc.next();
		
		int letter = 0;
		int digit = 0;
		int symbol = 0;
		
		for(int i=0;i< name.length();i++) {
			char ch = name.charAt(i);
			
			if(Character.isLetter(ch)) {
				letter++;
				
			}
			else if(Character.isDigit(ch)) {
				digit++;
			}
			else {
				symbol++;
			}
			
			
		}
		System.out.println("User input:"+name);
		System.out.println("Lettter:"+letter);
		System.out.println("Digit:"+digit);
		System.out.println("symbol:"+symbol);



	}

}
