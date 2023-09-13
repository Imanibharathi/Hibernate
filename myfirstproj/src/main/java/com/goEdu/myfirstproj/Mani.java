package com.goEdu.myfirstproj;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mani {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("kediii");
		emp1.setSal(76900.9);
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("jo");
		emp2.setSal(98700.9);
		Doctor11 d = new Doctor11();
		d.setSpecialization("doctor");
		Lecturer l = new Lecturer();
		l.setSubject("Maths");
		Transaction tr = ss.beginTransaction();
		ss.save(emp1);ss.save(emp2);ss.save(d);ss.save(l);
		tr.commit();
		ss.close();
		

	}

}
