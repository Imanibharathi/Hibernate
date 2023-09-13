package com.goEdu.myfirstproj;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Onetomany1 {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		
		//Parent object
		Lecturer1 l1=new Lecturer1();
		l1.setLid(120);
		l1.setLname("Raghu");
		
		//Child object
		Student s1 = new Student();
		s1.setSid(1);
		s1.setSname("Jo");
		s1.setSperc(98.00);
		
		Student s2 = new Student();
		s2.setSid(2);
		s2.setSname("Go");
		s2.setSperc(87.98);
		
		Student s3 = new Student();
		s3.setSid(3);
		s3.setSname("Ting");
		s3.setSperc(75.36);
		
		Set<Student> s = new HashSet<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		l1.setStudents(s);
		Transaction tr = ss.beginTransaction();
		ss.save(l1);
		System.out.println("Success....");
		tr.commit();
		ss.close();
		



	}

}
