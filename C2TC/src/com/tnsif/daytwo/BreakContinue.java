package com.tnsif.daytwo;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------BREAK------");
		for(int i=0;i<=6;i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
		System.out.println("-------CONTINUE-------");
		for(int i=0;i<6;i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
	}

}
