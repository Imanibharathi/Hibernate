package com.JoyLife.Relation2_proj;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One2one {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		
		License l1 = new License();
		l1.setLicenseId(1010);
		l1.setIssuedate("02/05/2020");
		l1.setExpiredate("25/08/2030");
		
				
		Person p1 = new Person();
		p1.setPersonId(101);
		p1.setPersonName("nesamani");
		p1.setPlace("tn");
		
		Person p2 = new Person();
		p2.setPersonId(102);
		p2.setPersonName("gopal");
		p2.setPlace("tn");
		
		Person p3 = new Person();
		p3.setPersonId(103);
		p3.setPersonName("silky");
		p3.setPlace("kr");
		
		Transaction tr = ss.beginTransaction();
		
		l1.setPerson(p3);
		ss.save(l1);
		tr.commit();
		ss.close();
		
		

	}

}
