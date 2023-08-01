package com.tnsif.dayfive;
//Multilevel Inheritance
class Country {
	String cname;
	int ccode;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname=cname;
	}
	public int getCcode() {
		return ccode;
	}
	public void setCcode(int ccode) {
		this.ccode=ccode;
	}
}
class State extends Country{
	String sname;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname=sname;
	}
}
class City extends State{
	String cityname;
	int pincode;
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname=cityname;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode=pincode;
	}
	@Override
	public String toString() {
		return "City [ cityname = " + cityname + ", pincode = " + pincode +
				", ccode = "+ccode+"]";
	}	
}
