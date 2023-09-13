package com.goEdu.Joins_proj;

import javax.persistence.*;

@Entity
@Table(name = "Item_Join1")
public class Item {
	@Id
	@Column(name = "Item_Name")
	private String itemname;
	@Column(name = "Item_Price")
	private double price;

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
