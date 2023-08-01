package com.tnsif.daythree;

class Constructor {
		int id;
		String name;
		void display() {
			System.out.println(id +" "+name);
		}
}
	//parameterized constructor
class ConsClass{
	int id;
	String name;
	ConsClass(int i,String n){
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}

