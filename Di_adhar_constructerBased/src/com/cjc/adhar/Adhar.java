package com.cjc.adhar;

public class Adhar {
	private int adharno;
    private String	adharCardHoldername;
    private String dateofBirth;
    private String address;
    public Adhar(int adharno, String adharCardHoldername, String dateofBirth, String address) {
		super();
		this.adharno = adharno;
		this.adharCardHoldername = adharCardHoldername;
		this.dateofBirth = dateofBirth;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Adhar [adharno=" + adharno + ", adharCardHoldername=" + adharCardHoldername + ", dateofBirth="
				+ dateofBirth + ", address=" + address + "]";
	}
	
}
