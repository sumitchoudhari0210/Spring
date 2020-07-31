package com.cjc.javabased_di_SecondaryRef_Constbased;

public class BankDetails {
	private int accountno;
	private String bankname;
	private String address;
	public BankDetails(int accountno, String bankname, String address) {
		super();
		this.accountno = accountno;
		this.bankname = bankname;
		this.address = address;
	}
	@Override
	public String toString() {
		return "BankDetails [accountno=" + accountno + ", bankname=" + bankname + ", address=" + address + "]";
	}
	

}
