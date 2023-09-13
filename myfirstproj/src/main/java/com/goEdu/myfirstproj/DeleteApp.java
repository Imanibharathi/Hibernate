package com.goEdu.myfirstproj;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class DeleteApp {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Transaction tr = ss.beginTransaction();
		Employee emp = (Employee)ss.load(Employee.class, 9);
		ss.delete(emp);
		tr.commit();
		ss.close();

	}

}
