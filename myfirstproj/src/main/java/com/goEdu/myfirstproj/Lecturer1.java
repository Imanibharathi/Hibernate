package com.goEdu.myfirstproj;

import java.util.Set;

public class Lecturer1 {
	private int lid;
	private String lname;
	private Set<Student> students;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public Lecturer1(int lid,String lname,Set<Student> students) {
		super();
		this.lid=lid;
		this.lname=lname;
		this.students=students;
	}
	public Lecturer1(int lid) {
		super();
		this.lid=lid;
	}
	public Lecturer1() {}

}
