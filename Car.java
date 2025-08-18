package com.arraylistex;

public class Car {
	
	int no;
	String cname;
	String cmodel;
	
	
	Car(int no,String name,String model){
		
		this.no = no;
		this.cname  = name;
		this.cmodel  = model;
	}


	@Override
	public String toString() {
		return "Car [no=" + no + ", cname=" + cname + ", cmodel=" + cmodel + "]";
	}
	
	

}
