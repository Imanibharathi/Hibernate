package com.goEdu.TablePerHeirearchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contractemployee")

public class Contract_Employee extends Employee {
	
	@Column(name = "pay_per_hr")
	private double pay_per_hr;

	@Column(name = "contract_period")
	private String contract_period;

	public double getPay_per_hr() {
		return pay_per_hr;
	}

	public void setPay_per_hr(double pay_per_hr) {
		this.pay_per_hr = pay_per_hr;
	}

	public String getContract_period() {
		return contract_period;
	}

	public void setContract_period(String contract_period) {
		this.contract_period = contract_period;
	}

	public Contract_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
