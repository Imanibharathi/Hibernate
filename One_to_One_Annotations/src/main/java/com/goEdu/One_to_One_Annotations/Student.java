package com.goEdu.One_to_One_Annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_One_to_one")
public class Student {
	@Id
	@Column(name = "sid")
	private int studentId;
	@Column(name = "sname")
	private String studentName;
	@Column(name = "grp")
	private String grp;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGrp() {
		return grp;
	}

	public void setGrp(String grp) {
		this.grp = grp;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
