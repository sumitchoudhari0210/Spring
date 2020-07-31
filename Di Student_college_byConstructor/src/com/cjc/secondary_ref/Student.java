package com.cjc.secondary_ref;

public class Student {
	private int id;
	private String  name;
	private String mobno;
	private CollegeDetails col;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobno=" + mobno + ", col=" + col + "]";
	}
	public Student(int id, String name, String mobno, CollegeDetails col) {
		super();
		this.id = id;
		this.name = name;
		this.mobno = mobno;
		this.col = col;
	}
	
}