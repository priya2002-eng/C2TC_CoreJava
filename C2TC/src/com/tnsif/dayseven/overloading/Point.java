package com.tnsif.dayseven.overloading;
//constructor overloading
public class Point {
	private float a;
	private float b;
	Point(){
		a=0.0f;
		b=7.9f;
	}
	Point(float a,float b){
		this.a=a;
		this.b=b;
	}
	@Override
	public String toString() {
		return "Point [a=" + a + ", b=" + b + "]";
	}
	
}
