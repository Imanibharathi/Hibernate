package com.JoyLife.Relation2_proj;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Annotations {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		
		Student_Anno s1 = new Student_Anno();
//		s1.setSid(101);
		s1.setSname("Raju");
		s1.setSperc(65.98);
		
		Student_Anno s2 = new Student_Anno();
//		s2.setSid(102);
		s2.setSname("Jo");
		s2.setSperc(98.92);
		
		Transaction tr = ss.beginTransaction();
		ss.save(s1);ss.save(s2);
		tr.commit();
		ss.close();
		
		
		

	}

}
