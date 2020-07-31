package com.cjc.javabased_di_SecondaryRef_Constbased;

import org.springframework.beans.factory.annotation.Autowired;


public class Employee {
	private int empid;
	private String empname;
	private String empmobno;
	@Autowired
	private BankDetails bd;
	public Employee(int empid, String empname, String empmobno, BankDetails bd) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empmobno = empmobno;
		this.bd = bd;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empmobno=" + empmobno + ", bd=" + bd + "]";
	}

}
