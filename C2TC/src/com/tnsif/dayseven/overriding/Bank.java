package com.tnsif.dayseven.overriding;

class Bank {
	int getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank {
	int getRateOfInterest() {
		return 79;
	}
}
class ICICI extends Bank {
	int getRateOfInterest() {
		return 85;
	}
}
class HDFC extends Bank {
	int getRateOfInterest() {
		return 55;
	}
}


