package com.goEdu.One_to_many_Annotations;

import java.util.Set;
import javax.persistence.*;
@Entity
@Table(name = "Vendor_Anno")
public class Vendor {
	@Id
	@Column(name = "vid")
	private int vendorId;
	@Column(name = "vname")
	private String vendorName;
	@OneToMany(fetch = FetchType.LAZY,targetEntity = Customers.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "venId",referencedColumnName = "vid")
	private Set<Customers>customers;

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public Set<Customers> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customers> customers) {
		this.customers = customers;
	}

	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
