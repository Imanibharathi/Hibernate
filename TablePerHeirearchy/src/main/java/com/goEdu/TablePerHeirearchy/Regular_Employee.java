package com.goEdu.TablePerHeirearchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regularemployee")
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
