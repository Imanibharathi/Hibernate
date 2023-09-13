package com.goEdu.Many_to_One_Annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vendor_Many_to_One")
public class Vendor {
	@Id
	@Column(name = "vid")
	private int vid;
	@Column(name = "vname")
	private String vendorName;

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
