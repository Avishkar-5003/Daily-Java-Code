package com.arraylistex;

import java.util.ArrayList;

public class CarArrayListEx {

	public static void main(String[] args) {
		
		Car c1 = new Car(12,"verna","Hundai");
		Car c2 = new Car(13,"alto","Maruti");
		Car c3 = new Car(14,"Fortuner","Toyota");
		
		ArrayList<Car> c = new ArrayList<Car>();
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		
		System.out.println(c);

	}

}
