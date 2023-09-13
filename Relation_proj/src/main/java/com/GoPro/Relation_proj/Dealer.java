package com.GoPro.Relation_proj;

import java.util.List;

public class Dealer {
	private int dealerId;
	private String dealerName;
	private List<Product> products;
	public int getDealerId() {
		return dealerId;
	}
	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Dealer() {
		super();
	}
	public Dealer(int dealerId, String dealerName, List<Product> products) {
		super();
		this.dealerId = dealerId;
		this.dealerName = dealerName;
		this.products = products;
	}

}
