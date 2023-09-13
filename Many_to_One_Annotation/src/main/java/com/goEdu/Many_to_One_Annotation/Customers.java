package com.goEdu.Many_to_One_Annotation;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Customers_Many_to_One")
public class Customers {
	@Id
	@Column(name = "cid")
	private int cid;
	@Column(name = "cname")
	private String cname;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "venid",referencedColumnName = "vid")
	private Vendor vendor;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

}
