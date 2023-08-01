package com.tnsif.dayfive;
//Single Inheritance
class Citizen {
	String name;
	String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	void display() {
		System.out.println("name "+name+" city "+city);
	}
}
class Student extends Citizen{
	int id;
	String roll;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getRoll() {
		return roll;
	}
	public void SetRoll(String roll) {
		this.roll=roll;
	}
	void displlay() {
		System.out.println("Name "+name+" City "+city+" Id"+id+" RollNum"+roll);
	}
}

