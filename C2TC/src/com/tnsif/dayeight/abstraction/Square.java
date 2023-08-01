package com.tnsif.dayeight.abstraction;

public class Square extends Shape {
	int side;
	Square(){
		side =7;
	}
	void calArea() {
		System.out.println("Are of Square: "+side*side);
	}
}
