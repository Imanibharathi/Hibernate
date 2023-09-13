package com.JoyLife.Relation2_proj;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class Pname {
	@Column(name = "initial",length = 4)
	private char i;
	@Column(name = "FNAME",length = 10)
	private String fname;
	@Column(name = "LNAME",length = 10)
	private String lname;

	public char getI() {
		return i;
	}

	public void setI(char i) {
		this.i = i;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Pname() {
		super();
		// TODO Auto-generated constructor stub
	}

}
