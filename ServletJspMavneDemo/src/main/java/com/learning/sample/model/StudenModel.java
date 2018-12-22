package com.learning.sample.model;

public class StudenModel {
	int sid;
	String sname;
	String designation;
	String address;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	@Override
	public String toString() {
		return "StudenModel [sid=" + sid + ", sname=" + sname + ", designation=" + designation + ", address=" + address
				+ "]";
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
