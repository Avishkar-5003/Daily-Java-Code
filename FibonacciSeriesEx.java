package com.practise;

import java.util.Scanner;

public class FibonacciSeriesEx {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no:");
		int n = sc.nextInt();
		
		int first = 0;
		int second = 1;
		
		
		System.out.println("Fibonacci series upto"+n+"Terms");
		
		for(int i=1;i<=n;i++) {
			
			System.out.println(first+" ");
			
			int next  = first + second;
			
			first = second;
			second  = next;
			
			
			
			
		}
		
		
		

	}

}
