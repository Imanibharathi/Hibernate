package com.goedu.clientproj;

import java.io.Serializable;

public class Product  implements Serializable{
	private String cname;
	private String pname;
	private Double price;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
	private int v;
	


	

}
