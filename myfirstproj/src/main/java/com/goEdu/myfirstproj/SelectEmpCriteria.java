package com.goEdu.myfirstproj;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectEmpCriteria {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Criteria cr = ss.createCriteria(Employee.class);
		List< Employee> ls = cr.list();
		Iterator<Employee> itr = ls.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp.getId()+","+emp.getName()+","+emp.getSal());
			
		}
		
		
		
		
		
				

	}

}
