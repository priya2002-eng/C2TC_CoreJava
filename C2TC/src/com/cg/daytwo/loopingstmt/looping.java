package com.cg.daytwo.loopingstmt;

public class looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println("FOR LOOP");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("WHILE LOOP");
		int b=2;
		while(b<=5) {
			System.out.println("The value of b is: "+b);
			b++;
		}
		System.out.println("DO WHILE LOOP");
		int c=3;
		do {
			System.out.println(c);
			c++;
		}while(c<=5);
		System.out.println("BREAK");
		for(int i=0;i<=6;i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
		System.out.println("CONTINUE");
		for(int i=0;i<6;i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
	}

}
