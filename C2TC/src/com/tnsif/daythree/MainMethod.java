package com.tnsif.daythree;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj=new Encapsulation();
		obj.setName("Priya");
		obj.setId(12);
		obj.setEmail("priya@gmail.com");
		obj.setNum(55798732);
		System.out.println(obj.toString());
		Constructor ob=new Constructor();
		ob.display();
		ConsClass o=new ConsClass(79,"Priya");
		o.display();

	}

}
