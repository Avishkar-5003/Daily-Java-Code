package com.stringexample;

import java.util.Scanner;

public class Cheakpassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username = new String("avi");
		String password = new String("avi");
		
		System.out.println("Enter the username");
		String u =sc.next();
		
		System.out.println("Enter the password");
		String p = sc.next();
		
		if(username.equals(u) && password .equals(p)) {
			
			System.out.println("login sucessfully");
			}
		else {
			
			System.out.println("Wrong password");
		}
	}

}
