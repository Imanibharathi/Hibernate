package com.goEdu.myfirstproj;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class ReadApp {
	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure();
		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Employee emp = (Employee)ss.load(Employee.class, 1);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSal());
		ss.close();
		sf.close();
	}

}
