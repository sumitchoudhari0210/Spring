package com.cjc.adhar;

public class Adhar {
	private int adharno;
    private String	adharCardHoldername;
    public int getAdharno() {
		return adharno;
	}
	public String getAdharCardHoldername() {
		return adharCardHoldername;
	}
	public String getDateofBirth() {
		return dateofBirth;
	}
	public String getAddress() {
		return address;
	}
	private String dateofBirth;
    private String address;
    
	public void setAdharno(int adharno) {
		this.adharno = adharno;
	}
	public void setAdharCardHoldername(String adharCardHoldername) {
		this.adharCardHoldername = adharCardHoldername;
	}
	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
