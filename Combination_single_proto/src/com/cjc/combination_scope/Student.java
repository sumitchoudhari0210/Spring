package com.cjc.combination_scope;

public class Student {
	public Student(){System.out.println("Student");}
	
	private Address add;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	

}
