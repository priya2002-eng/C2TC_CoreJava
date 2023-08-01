package com.cg.dayfive;

public class Encapsule {
	String name;
	String email;
	int id;
	long num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Encapsule [name=" + name + ", email=" + email + ", id=" + id + ", num=" + num + "]";
	}
	
	
}
