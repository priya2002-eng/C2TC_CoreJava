package com.tnsif.dayfive;
//Hierarchical Inheritance
public class People {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class Stud extends People {
	int rollno;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}
class Emp extends People{
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Emp [ id = " + id + ", name = "+ name+ "]";
	}
	
}
