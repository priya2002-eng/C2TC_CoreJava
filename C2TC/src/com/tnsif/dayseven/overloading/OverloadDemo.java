package com.tnsif.dayseven.overloading;

public class OverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------Constructor overloading-------");
		Point obj=new Point(55.3f,85.2f);
		System.out.println(obj.toString());
		System.out.println("\n----------Method overloading-------");
		MethodOverloading ob=new MethodOverloading();
		System.out.println(ob.sum(4, 8));
		System.out.println(ob.sum(79,85,55));
		System.out.println(ob.sum(55,79.f));
		System.out.println(ob.sum(85.f, 79));

	}

}
