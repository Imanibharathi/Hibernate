package com.goEdu.myfirstproj;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class CriteriaEmpFullObj {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Criteria cr = ss.createCriteria(Employee.class);
		List<Employee> ls=cr.list();
		for (Employee emp : ls) {
			System.out.println(emp.getId()+","+emp.getName()+","+emp.getSal());
			
		}

	}

}
