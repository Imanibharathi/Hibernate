package com.goEdu.myfirstproj;

import org.hibernate.*;

import org.hibernate.cfg.*;

public class Simple {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Hema");
		emp.setSal(40000.1);
		Configuration cf =new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Transaction tr = ss.beginTransaction();
		ss.save(emp);
		tr.commit();
		ss.close();

	}

}
