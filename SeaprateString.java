package com.stringbuffer;

public class SeaprateString {

	public static void main(String[] args) {
		
		    
		        String input = "avishkar@123";

		        String letters = "";
		        String digits = "";
		        String symbols = "";

		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);

		            if (Character.isLetter(ch)) {
		                letters += ch;
		            } else if (Character.isDigit(ch)) {
		                digits += ch;
		            } else {
		                symbols += ch;
		            }
		        }

		        System.out.println("Letters: " + letters);
		        System.out.println("Digits: " + digits);
		        System.out.println("Symbols: " + symbols);
		    }
		

	}


