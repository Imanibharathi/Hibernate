package com.JoyLife.Relation2_proj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Anno")
public class Student_Anno {
	@Id
	@Column(name = "s_id",length = 9)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	@Column(name = "s_name")
	private String sname;
	@Column(name = "s_perc")
	private double sperc;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSperc() {
		return sperc;
	}
	public void setSperc(double sperc) {
		this.sperc = sperc;
	}
	public Student_Anno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student_Anno(int sid, String sname, double sperc) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sperc = sperc;
	}

}
