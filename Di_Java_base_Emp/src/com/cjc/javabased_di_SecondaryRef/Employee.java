package com.cjc.javabased_di_SecondaryRef;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int empid;
	private String empname;
	private String empmobno;
	@Autowired
	private BankDetails bd;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpmobno() {
		return empmobno;
	}
	public void setEmpmobno(String empmobno) {
		this.empmobno = empmobno;
	}
	public BankDetails getBd() {
		return bd;
	}
	public void setBd(BankDetails bd) {
		this.bd = bd;
	}
	
}
