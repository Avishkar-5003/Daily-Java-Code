package com.loopex;
import java.util.*;

public class IsPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		
		if(isPrime(number)) {
			System.out.println("Number is prime:"+number);
		}
		else {
			System.out.println("Number is not Prime:"+number);
		}
		
		
		

	}

	public static boolean isPrime(int num) {
		
		if(num<=1)return false; 
		
		for(int i=2; i <=Math.sqrt(num); i++) {
			
			if(num %i == 0)return false;
			
		}
		return true;
		
		
		
	}

}
