package com.autowrite.bytype;

public class Employee {
	
	private int empid;
	
	private  String empname;
	
	private String empmobno;
	
	private Bankdetails bankdetails;

	public Employee(int empid, String empname, String empmobno, Bankdetails bankdetails) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empmobno = empmobno;
		this.bankdetails = bankdetails;
	}

@Override
public String toString() {
	
	return "id:-"+empid+",name:-"+empname+",mobno:-"+empmobno+",bankdetails:-"+bankdetails+"";
}

}
