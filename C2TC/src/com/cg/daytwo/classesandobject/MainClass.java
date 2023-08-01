package com.cg.daytwo.classesandobject;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		MethodClass obj=new MethodClass();
		System.out.println(obj.add());
		obj.sub(a, b);
		obj.mul(a, b);
		System.out.println(obj.div(a, b));
		
	}

}
