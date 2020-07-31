package com.cjc.secondary_ref;

public class CollegeDetails {
	private int collegeid;
	private String collegename;
	private String address;
	@Override
	public String toString() {
		return "CollegeDetails [collegeid=" + collegeid + ", collegename=" + collegename + ", address=" + address + "]";
	}
	public CollegeDetails(int collegeid, String collegename, String address) {
		super();
		this.collegeid = collegeid;
		this.collegename = collegename;
		this.address = address;
	}
	
}
