package com.cjc.javabased_di_Constructor;

public class Student {
	private int id;
	private String name;
	private String mobno;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobno=" + mobno + "]";
	}
	public Student(int id, String name, String mobno) {
		super();
		this.id = id;
		this.name = name;
		this.mobno = mobno;
	}

}
