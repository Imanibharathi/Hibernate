package com.JoyLife.Relation2_proj;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonPnameApp {
	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Pname pn = new Pname();
		pn.setI('R');
		pn.setFname("Mani");
		pn.setLname("Bharathi");
		
		Person1 p = new Person1();
		p.setPname(pn);
		p.setPersonId(101);
		p.setDate(new Date("1999/09/25"));
		
		Transaction tr = ss.beginTransaction();
		ss.save(p);
		tr.commit();
		System.out.println("Successfull.....");
		ss.close();

	}

}
