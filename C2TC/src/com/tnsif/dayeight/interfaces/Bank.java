package com.tnsif.dayeight.interfaces;

public interface Bank {
	static final float min=5000;
	static final float max=10000;
	public void deposit(float amt);
	public void withdraw(float amt);
}
