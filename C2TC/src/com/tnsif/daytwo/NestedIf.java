package com.tnsif.daytwo;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		int b=20;
		if(b<25) {
			if(a!=15) {
				System.out.println("A is equal to 15");
			}
			else {
				System.out.println("B is not equal to 15");
			}
		}
		else {
			System.out.println("The value of b is 20");
		}

	}

}
