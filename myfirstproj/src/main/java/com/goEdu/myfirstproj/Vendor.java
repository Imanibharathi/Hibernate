package com.goEdu.myfirstproj;

import java.util.Set;

public class Vendor {
	private int vendorId;
	private String vendorname;
	private Set<Customer> customers;
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorname() {
		return vendorname;
	}
	public void setVendorname(String vendorname) {
		this.vendorname = vendorname;
	}
	public Set<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
	public Vendor(int vendorId,String vendorName,Set<Customer> customers) {
		super();
		this.vendorId=vendorId;
		this.vendorname=vendorName;
		this.customers=customers;
	}
	public Vendor(int vendorId) {
		super();
		this.vendorId=vendorId;
	}
	public Vendor() {}

}
