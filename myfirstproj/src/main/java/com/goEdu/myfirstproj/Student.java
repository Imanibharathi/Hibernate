package com.goEdu.myfirstproj;

public class Student {
	private int sid;
	private String sname;
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
	public Student(int sid,String sname,double sperc) {
		this.sid=sid;
		this.sname=sname;
		this.sperc=sperc;
	}
	public Student() {}
	
	public int hashcode() {
		return this.sid;
	}
	
	public boolean equals(Object obj) {
		return this.hashcode()==obj.hashCode();
	}

}
