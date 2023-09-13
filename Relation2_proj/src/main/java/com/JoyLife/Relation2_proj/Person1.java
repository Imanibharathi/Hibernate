package com.JoyLife.Relation2_proj;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
@Entity
@Table(name = "PERSON1_A")
public class Person1 {
	@Id
	@Column(name = "PID",length = 10)
	@GenericGenerator(name = "gen1",strategy = "increment")
	@GeneratedValue(generator = "gen1")
	private int personId;
	@Embedded
	private Pname pname;
	@Column(name = "DOB")
	@Type(type = "date")
	private Date date;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public Pname getPname() {
		return pname;
	}

	public void setPname(Pname pname) {
		this.pname = pname;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Person1() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
