package com.cjc.combi.bank.empl;

public class Employee {
public Employee(){System.out.println("Employee class");}
public BankDetails bd;

public BankDetails getBd() {
	return bd;
}
public void setBd(BankDetails bd) {
	this.bd = bd;
}
}
