package com.tnsif.daytwo;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		for(int i:a) {
			System.out.println(i);
		}
		System.out.println("-----------");
		char b[]= {'A','B','C','D','E'};
		for(char i:b) {
			System.out.println(i);
		}
		System.out.println("-----------");
		String c[]= {"Apple","Kiwi","Cherry","Banana","Plums"};
		for(String i:c) {
			System.out.println(i);
		}
		
	}

}
