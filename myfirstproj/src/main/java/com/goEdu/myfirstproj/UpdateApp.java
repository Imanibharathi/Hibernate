package com.goEdu.myfirstproj;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class UpdateApp {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
/*		Transaction tr = ss.beginTransaction();
		Employee emp = (Employee)ss.load(Employee.class, 1);
		emp.setSal(50990);
		tr.commit();
		ss.close();*/
		Employee emp = new Employee();
		emp.setId(6);
		emp.setName("Kediii");
		emp.setSal(25000.00);
		Transaction tr = ss.beginTransaction();
		ss.update(emp);
		tr.commit();
		ss.close();
		
		

	}

}
