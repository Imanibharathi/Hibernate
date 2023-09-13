package com.goEdu.myfirstproj;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class CriterionEmp {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Criteria cr = ss.createCriteria(Employee.class);
		Criterion crt = Restrictions.ge("sal", 50000.00);
//		Criterion crt1 = Restrictions.like("name", "mani");
		cr.add(crt);
		List< Employee> ls = cr.list();
		Iterator<Employee> itr = ls.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println(emp.getId()+","+emp.getName()+","+emp.getSal());
			System.out.println("Success....");
			
		}

	}

}
