package com.cjc.secondary_ref;

public class Student {
	private int id;
	private String  name;
	private String mobno;
	private CollegeDetails col;
	
	public CollegeDetails getCol() {
		return col;
	}
	public void setCol(CollegeDetails col) {
		this.col = col;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

}
