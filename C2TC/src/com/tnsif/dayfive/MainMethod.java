package com.tnsif.dayfive;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----------Single Inheritance-----------");
		Student obj=new Student();
		obj.setName("Priya");
		obj.setCity("Villupuram");
		obj.setId(85);
		obj.SetRoll("79");
		obj.display();
		System.out.println("\n-----------Multilevel Inheritance----------");
		City ob=new City();
		ob.setCname("India");
		ob.setCcode(126546);
		ob.setSname("Tamilnadu");
		ob.setCityname("Villupuram");
		ob.setPincode(605102);
		System.out.println(ob.toString());
		System.out.println("\n----------Hierarchical Inheritance---------");
		Emp o =new Emp();
		o.setName("priya");
		o.setId(7985);
		System.out.println(o.toString());

	}

}
