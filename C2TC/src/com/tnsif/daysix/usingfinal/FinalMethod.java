package com.tnsif.daysix.usingfinal;

public class FinalMethod {
	final void run() {
		System.out.println("Running");
	}
}
class Method extends FinalMethod{
	void runs() {
		System.out.println("Runs");
	}
}
