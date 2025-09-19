package com.interfaceex;

public class CalculateTotal implements Calcilate1,Calculate2 {
	int a=2,b=3;
	
	@Override
	public void add() {
		
		
		int sum = a+b;
		System.out.println("Addition is:"+sum);
	}
	@Override
	public void sub() {
		
		int subt=a-b;
		System.out.println("Subtraction is:"+subt);
		
	}
	@Override
	public void mul() {
		
		double division = a*b;
		System.out.println("Multiplication is:"+division);
		
	}
	@Override
	public void div() {
		
		double  divi = a/b;
		
		System.out.println("Division is:"+divi);
		
	}
	
	
	
	
	
		
		
	
	

}
