package com.goEdu.Joins_proj;

import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name = "Customer_Join1")
public class Customer {
	@Id
	@Column(name = "Customer_Name")
	private String cname;
	@Column(name = "Customer_City")
	private String ccity;
	@OneToMany(fetch = FetchType.LAZY,targetEntity =Item.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "Customer_Name",referencedColumnName = "Customer_Name")
	private Set<Item>items;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	public Set<Item> getItems() {
		return items;
	}
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
