package com.goEdu.One_to_many_Annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customers_Anno")
public class Customers {
	@Id
	@Column(name = "cid")
	private int customerId;
	@Column(name = "cname")
	private String customerName;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
