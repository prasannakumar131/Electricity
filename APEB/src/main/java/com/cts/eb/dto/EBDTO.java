package com.cts.eb.dto;

public class EBDTO {

	private long serviceNo;
	private String customerName;
	private String address;
	private long mobile;
	private String email;
	private int units;
	private int billAmount;
	
	public long getServiceNo() {
		return serviceNo;
	}
	public void setServiceNo(long serviceNo) {
		this.serviceNo = serviceNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	
	
}
