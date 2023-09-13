package com.goEdu.myfirstproj;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class CriteriaAndOperator {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		Session ss = cf.buildSessionFactory().openSession();
		Criteria cr = ss.createCriteria(Employee.class);
		Criterion crt1 = Restrictions.ge("sal", 50000.00);
		Criterion crt2 = Restrictions.like("name", "%m%");
		Criterion crt = Restrictions.and(crt1,crt2);
		cr.add(crt);
		List<Employee>ls=cr.list();
		for (Employee emp : ls) {
			System.out.println(emp.getId()+","+emp.getName()+","+emp.getSal());
		}

	}

}
