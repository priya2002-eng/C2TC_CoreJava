package com.tnsif.dayseven.overloading;
//Method Overloading
public class MethodOverloading {
	int sum(int a,int b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}
	float sum(int a,float b) {
		return a-b;
	}
	float sum(float a,int b) {
		return a*b;
	}
}
