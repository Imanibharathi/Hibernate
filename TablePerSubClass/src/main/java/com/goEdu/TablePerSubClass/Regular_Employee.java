package com.goEdu.TablePerSubClass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Regular_employeeTperSubClass")
@PrimaryKeyJoinColumn(name = "ID")
public class Regular_Employee extends Employee{
	@Column(name = "salary")
	private double salary;
	@Column(name = "bonus")
	private int bonus;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Regular_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
