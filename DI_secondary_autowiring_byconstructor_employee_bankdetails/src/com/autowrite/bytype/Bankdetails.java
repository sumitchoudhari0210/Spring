package com.autowrite.bytype;

public class Bankdetails {
	
	private String accountno;
	
	private String bankname;
	
	private String addr;

	public Bankdetails(String accountno, String bankname, String addr) {
		super();
		this.accountno = accountno;
		this.bankname = bankname;
		this.addr = addr;
	}

	@Override
	public String toString() {
	
		return  "accountnoo:-"+accountno+",bankname:-"+bankname+",address:-"+addr+"";

	}
}
